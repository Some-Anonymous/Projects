
# Importar módulos
from datetime import datetime
import functools

# Função principal
def main():

    # Declarar lista de contas
    lista_de_contas = []

    # Criar classe Conta
    class Conta:

        # Instancear objeto
        def __init__(self, numero_conta, saldo):

            # Atributos de instâncias
            self.numero_conta = numero_conta
            self.saldo = saldo
            self.historico = []
            lista_de_contas.append({"numero de conta": self.numero_conta, "saldo": self.saldo})

        # Definir decorador de logs
        def decorador_log(func):

            # Preservar introspecção
            @functools.wraps(func)

            # Definir envelope
            def envelope(*args, **kwargs):

                # Retornar transação, valor, antigo saldo, novo saldo e status de uma transação
                resultado = func(*args, **kwargs)

                # Exibir transação
                return resultado

            # Retornar envelope
            return envelope

        # Definir método depositar
        @decorador_log
        def depositar(self, valor):

            # Efetuar depósito
            self.saldo += valor

            # Retornar tupla de dados do depósito
            resultado = f"Transação: Depósito, Valor: {valor}, Antigo saldo: {self.saldo - valor}, Novo saldo: {self.saldo}, Status: Sucesso"
            self.historico.append(resultado)
            return resultado

        # Definir método sacar
        @decorador_log
        def sacar(self, valor):

            # Verificar se saque é maior que saldo
            if valor >= self.saldo:

                # Retornar tupla de dados do saque com falha
                resultado = f"Transação: Saque, Valor: {valor}, Antigo saldo: {self.saldo}, Novo saldo: {self.saldo}, Status: Falha"
                self.historico.append(resultado)
                return resultado

            else:

                # Efetuar saque
                self.saldo -= valor

                # Retornar tupla de dados do saque com sucesso
                resultado = f"Transação: Saque, Valor: {valor}, Antigo saldo: {self.saldo + valor}, Novo saldo: {self.saldo}, Status: Sucesso"
                self.historico.append(resultado)
                return resultado

        # Definir gerador
        def gerador(self):

            # Gerar transações
            for transacao in self.historico:

                # Consumir transaçõa
                yield transacao

    # Definir iterador de contas
    class ContaIterador:
        
        # Instanciar iteráveis
        def __init__(self, lista_de_contas):
            self.lista_de_contas = lista_de_contas
            self.contador = 0

        # Definir __iter__
        def __iter__(self):
            return self

        # Definir __next;__
        def __next__(self):

            # Percorrer conta
            try:
                conta = self.lista_de_contas[self.contador]
                self.contador += 1

                return conta

            # Fim das contas
            except IndexError:
                raise StopIteration

main()

# git init
# git add README.md
# git commit -m "first commit"
# git branch -M main
# git remote add origin https://github.com/Some-Anonymous/Projects.git
# git push -u origin main