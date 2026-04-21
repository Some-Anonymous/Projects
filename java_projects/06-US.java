
// Import Scanner from java.util
import java.util.Scanner;

// Define Main class
public class Main {

    // Define main method
    public static void main(String[] args) {

        // Declare scanner
        var scanner = new Scanner(System.in);

        // Inquire for first number
        System.out.println("Choose the first number");

        // Declare first number
        var first_number = scanner.nextInt();

        // Declare second number
        int second_number;

        // Find second number
        do {

            // Inquire for second number
            System.out.println("Choose the second number (greater than the first one)");

            // Assign second number
            second_number = scanner.nextInt();

        } while (second_number <= first_number);

        // Inquire for preference for even to odds and vice-versa
        System.out.println("Would you prefer even numbers? (y/n)");

        // Declare preference
        boolean evenNumbers = scanner.next().equalsIgnoreCase("y");

        // Find requested numbers
        for (int i = first_number, n = second_number; i <= n; i++) {
            
            // Verify parity and preference
            if ((i % 2 == 0) && evenNumbers) System.out.println(i);
            else if ((i % 2 != 0) && !evenNumbers) System.out.println(i);

        }

    }

}