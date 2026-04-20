
// Import Scanner from java.util
import java.util.Scanner;

// Define Main class
public class Main {

    // Define main method
    static public void main(String[] args)  {

        // Declare scanner
        var scanner = new Scanner(System.in);

        // Inquire for side of the square
        System.out.println("What is the side of the square?");

        // Declare side
        int side = scanner.nextInt();

        // Declare area
        double area = Math.pow(side, 2.0);

        // Declare perimeter
        double perimeter = 4.0 * side;

        // Declare diagonal
        double diagonal = side * Math.sqrt(2.0);

        // Declare apothem
        double apothem = side / 2.0;

        // Declare inscribed circumference's ray
        double inscribedRay = side / 2.0;

        // Declare circumscribed circumference's ray
        double circumscribedRay = side / Math.sqrt(2.0);

        // Exhibit table
        System.out.printf("\nSQUARE:\nSide: %d\nArea: %.0f\nPerimeter: %.0f\nDiagonal: %.2f\nApothem: %.2f\nInscribed circumference's ray: %.2f\nCircumscribed circumfernce's ray: %.2f\n",
        side, area, perimeter, diagonal, apothem, inscribedRay, circumscribedRay);

    }

}