
# Import modules
from datetime import datetime, timezone, timedelta
import functools

# Main function
def main():

    # Define transactions limit and list of accounts
    MAX_OF_TRANSACTIONS = 10
    list_of_accounts = []

    # Define Account class
    class Account:

        # define constructor
        def __init__(self, account_number, account_balance):

            # Define instance attributes
            self.account_number = account_number
            self.account_balance = account_balance
            self.account_created = datetime.now(timezone(timedelta(hours=-3))).strftime('%Y-%m-%d %H:%M:%S')
            self.transactions = []
            list_of_accounts.append({"Account number": self.account_number, "Account balance": self.account_balance, "Created": self.account_created,})

        # Define log decorator
        def log_decorator(func):
            @functools.wraps(func)
            def wrapper(*args, **kwargs):
                result = func(*args, **kwargs)
                return f"Transaction: {result["Transaction"]}\nValue: {result["Value"]}\nAccount balance before: {result["Account balance before"]}\nAccount balance now: {result["Account balance now"]}\nStatus: {result["Status"]}\nDate and Time: {result["datetime"]}"

            return wrapper
                
        # Define make deposit method
        @log_decorator
        def make_deposit(self, deposit):

            # Check if transactions limit has been exceeded
            if len(self.transactions) >= MAX_OF_TRANSACTIONS:
                result = {
                    "Transaction": "Deposit",
                    "Value": deposit,
                    "Account balance before": self.account_balance,
                    "Account balance now": self.account_balance,
                    "Status": "Max of transactions reached (10)",
                    "datetime": datetime.now(timezone(timedelta(hours=-3))).strftime('%Y-%m-%d %H:%M:%S')
                }
                return result

            # If deposit has succeeded
            else:
                self.account_balance += deposit
                result = {
                    "Transaction": "Deposit", 
                    "Value": deposit, 
                    "Account balance before": self.account_balance - deposit, 
                    "Account balance now": self.account_balance, 
                    "Status": "Success",
                    "datetime": datetime.now(timezone(timedelta(hours=-3))).strftime('%Y-%m-%d %H:%M:%S'),
                }
                self.transactions.append(result)
                return result

        # Define make withdraw method
        @log_decorator
        def make_withdraw(self, withdraw):

            # Check if withdraw is greater than the balance
            if (withdraw > self.account_balance):
                result = {
                    "Transaction": "Withdraw",
                    "Value": withdraw,
                    "Account balance before": self.account_balance,
                    "Account balance now": self.account_balance,
                    "Status": "Failure",
                    "datetime": datetime.now(timezone(timedelta(hours=-3))).strftime('%Y-%m-%d %H:%M:%S'),
                }
                self.transactions.append(result)
                return result

            # Check if transactions limit has been exceeded
            elif len(self.transactions) >= 10:
                result = {
                    "Transaction": "Withdraw",
                    "Value": withdraw,
                    "Account balance before": self.account_balance,
                    "Account balance now": self.account_balance,
                    "Status": "Max os transactions reached (10)",
                    "datetime": datetime.now(timezone(timedelta(hours=-3))).strftime('%Y-%m-%d %H:%M:%S'),
                }
                return result

            # If withdraw has succeeded
            else:
                self.account_balance -= withdraw
                result = {
                    "Transaction": "Withdraw",
                    "Value": withdraw,
                    "Account balance before": self.account_balance + withdraw,
                    "Account balance now": self.account_balance,
                    "Status": "Success",
                    "datetime": datetime.now(timezone(timedelta(hours=-3))).strftime('%Y:%m:%d %H:%M:%S'),
                }
                self.transactions.append(result)
                return result

        # Define account generator
        def account_generator(self):
            for transaction in self.transactions:
                yield transaction

    # Define account iterator
    class AccountIterator:

        # Instanciate iterable
        def __init__(self, list_of_accounts):
            self.list_of_accounts = list_of_accounts
            self.counter = 0

        # Define __iter__ method
        def __iter__(self):
            return self

        # Define __next__ method
        def __next__(self):
            try:
                account = self.list_of_accounts[self.counter]
                self.counter += 1
                return account

            except IndexError:
                raise StopIteration

    account = Account(1234, 1000)

    print(account.make_withdraw(500))

main()