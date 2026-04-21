
// Importar Scanner de java.util
import java.util.Scanner;

// Importar Locale de java.util
import java.util.Locale;

// Definir classe Main
public class Main {

    // Definir método main
    public static void main(String[] args) {

        // Declarar scanner
        var scanner = new Scanner(System.in);

        // Asseverar Locale
        scanner.useLocale(Locale.US);

        // Inquirir por massa
        System.out.println("Qual é a sua massa?");

        // Declarar massa
        var massa = scanner.nextInt();

        // inquirir por altura
        System.out.println("Qual é a sua altura?");

        // Declarar altura
        float altura = scanner.nextFloat();

        // Declarar imc
        double imc = massa / Math.pow(altura, 2.0);

        // Declarar resultado
        String resultado = imc < 18.5 ? "Abaixo do peso"
                             : imc < 25 ? "Peso ideal"
                             : imc < 30 ? "Sobrepeso"
                             : imc < 37.5 ? "Obesidade"
                             : "Obesidade mórbida";

        // Exibir resultado
        System.out.println(resultado);


    }

}