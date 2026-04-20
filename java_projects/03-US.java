
// Import Scanner from java.util
import java.util.Scanner;

// Define Main class
public class Main {

    // Define main method
    static public void main(String[] args) {

        // Declare scanner
        var scanner = new Scanner(System.in);

        // Inquire for the base of the Rectangle
        System.out.println("What is the base of the Rectange?");

        // Declare the base of the Rectangle
        int base = scanner.nextInt();

        // Inquire for the height of the Rectangle
        System.out.println("What is the height of the Rectangle?");
        
        // Declare the height of the Rectangle
        int height = scanner.nextInt();

        // Declare area
        int area = base * height;

        // Declare perimeter
        double perimeter = (base + height) * 2.0;

        // Declare diagonal
        double diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(height, 2.0));

        // declare area of the triangle
        double triangle_area = base * height / 2.0;

        // Exhibit table
        System.out.printf("\nRECTANGLE:\nBase: %d\nHeight: %d\nArea: %d\nPerimeter: %.0f\nDiagonal: %.2f\nArea of the Triangle: %.2f\n",
        base, height, area, perimeter, diagonal, triangle_area);

    }

}