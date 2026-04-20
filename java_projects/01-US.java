
// Import Scanner from java.util
import java.util.Scanner;

// Define Main class
public class Main {

    // Define main method
    static public void main(String[] args) {

        // Verify if number of arguments is correct
        if (args.length != 1){

            System.out.println("Usage: java 01-US.java [aditional-information]");

        }

        // Execute the rest of code
        else {

            // Declare scanner
            var scanner = new Scanner(System.in);

            // Inquire for name
            System.out.println("What is your name?");

            // Declare name
            var name = scanner.next();

            // Inquire for place
            System.out.println("Where are you from?");

            // Declare place
            var place = scanner.next();

            // Inquire for birth date
            System.out.println("What is your birth year?");

            // Declare age
            var age = 2026 - scanner.nextInt();

            // Inquire for job
            System.out.println("Are you working?");

            // Declare if is working or not
            var isWorking = scanner.nextBoolean();

            // Inquire for partner
            System.out.println("Do you have a partner?");

            // Declare if has a partner or not
            var hasPartner = scanner.nextBoolean();

            // Declare aditional information
            var aditionalInformation = args[0];

            // Break line
            System.out.println();

            // Exhibit message
            System.out.printf("Hello, %s from %s your age is %s and you are working (%s) have partner (%s). Aditional information: %s\n", name, place, age, isWorking, hasPartner, aditionalInformation);

            // Exhibit table
            System.out.printf("\nInformation:\nName: %s\nPlace: %s\nAge: %s\nIs working: %s\nHas partner: %s\nAditional information: %s\n", name, place, age, isWorking, hasPartner, aditionalInformation);

        }

    }

}