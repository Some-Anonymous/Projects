
// Import Scanner from java.util
import java.util.Scanner;

// Import ArrayList from java.util
import java.util.ArrayList;

// Define Main class
public class Main {

    // Declare number of multiples of a number
    static int NUMBER_OF_MULTIPLES = 20;

    // Define main class
    public static void main(String[] args) {

        // Declare scanner
        var scanner = new Scanner(System.in);

        // inquire for number
        System.out.println("Choose a number");

        // Declare number
        var number = scanner.nextInt();

        // Declare dividers
        ArrayList<Integer> dividers = new ArrayList<>();

        // Find dividers
        for (int i = 1, n = number; i <= n; i++) {

            // Add found divider
            if (n % i == 0) dividers.add(i);

        }

        // Declare successor
        var successor = number + 1;

        // Declare predecessor
        var predecessor = number - 1;

        // Declare whether number is even or not
        var isEven = number % 2 == 0 ? true : false;

        // Declare multiples
        ArrayList<Integer> multiples = new ArrayList<>();

        // Find multiples
        for (int i = 1; i <= NUMBER_OF_MULTIPLES; i++) {

            // Add found multiple
            multiples.add(number * i);

        }

        // Exhibit table
        System.out.printf("\nNUMBER:\nValue: %d\nSuccessor: %d\nPredecessor: %d\nEven: %b\nDividers: %s\nMultiples: %s\n",
        number, successor, predecessor, isEven, dividers, multiples);

    }

}
