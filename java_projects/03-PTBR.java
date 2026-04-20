
// importar Scanner de java.util
import java.util.Scanner;

// Definir classe Main
public class Main {

    // Definir método main
    static public void main(String[] args) {

        // Declarar scanner
        var scanner = new Scanner(System.in);

        // Inquirir por base do retângulo
        System.out.println("Qual é a base do retângulo?");

        // Declarar base do retângulo
        int base = scanner.nextInt();

        // Inquirir por altura do retângulo
        System.out.println("Qual é a altura do retângulo?");

        // Declarar altura do retângulo
        int altura = scanner.nextInt();

        // Declarar área do retângulo
        int area = base * altura;

        // Declarar perímetro
        double perimetro = (base + altura) * 2.0;

        // Declarar diagonal
        double diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));

        // Declarar área do trinângulo
        double area_triangulo = base * altura / 2.0;

        // Exibir tabela
        System.out.printf("\nRETÂNGULO:\nBase: %d\nAltura: %d\nÁrea: %d\nPerímetro: %.2f\nDiagonal: %.2f\nÁrea do triângulo: %.2f\n",
        base, altura, area, perimetro, diagonal, area_triangulo);

    }

}