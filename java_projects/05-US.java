
// Import Scanner from java.util
import java.util.Scanner;

// Import Locale from java.util
import java.util.Locale;

// Define Main class
public class Main {

    // Define main method
    public static void main(String[] args) {

        // Declare scanner
        var scanner = new Scanner(System.in);

        // Assert Locale
        scanner.useLocale(Locale.US);

        // inquire for mass
        System.out.println("What is your mass?");

        // Declare mass
        var mass = scanner.nextInt();

        // Inquire for height
        System.out.println("What is your height?");

        // Declare height
        float height = scanner.nextFloat();

        // Declare Body Mass Index
        double body_mass_index = mass / Math.pow(height, 2.0);

        // Declare result
        String result = body_mass_index < 18.5 ? "Under normal weight"
                        : body_mass_index < 25 ? "Normal weight"
                        : body_mass_index < 30 ? "Above normal weight"
                        : body_mass_index < 37.5 ? "Obesity"
                        : "Morbid Obesity";

        // Exhibit result
        System.out.println(result);

    }

}