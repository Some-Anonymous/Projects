
// Importar Scanner de java.util
import java.util.Scanner;

// Definir classe Main
public class Main {

    // Definir método main
    static public void main(String[] args) {

        // Declarar scanner
        var scanner = new Scanner(System.in);

        // Inquirir por lado do quadrado
        System.out.println("Qual é o lado do quadrado?");

        // Declarar lado
        int lado = scanner.nextInt();

        // Declarar área
        double area = Math.pow(lado, 2);

        // Declarar perímetro
        int perimetro = 4 * lado;

        // Declarar diagonal
        double diagonal = lado * Math.sqrt(2);

        // Declarar apótema
        double apotema = lado / 2;

        // Declarar raio da circunferência inscrita
        double raioInscrito = lado / 2;

        // Declarar raio da circunferência circunscrita
        double raioCircunscrito = lado / Math.sqrt(2);

        // Exibir tabela
        System.out.printf("\nQUADRADO:\nLado: %d\nÁrea: %.0f\nPerímetro: %d\nDiagonal: %.2f\nApótema: %.2f\nRaio da circunferência inscrita: %.2f\nRaio da circunferência circunscrita: %.2f",
        lado, area, perimetro, diagonal, apotema, raioInscrito, raioCircunscrito);

    }

}