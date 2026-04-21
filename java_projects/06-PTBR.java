
// Importar Scanner de java.util
import java.util.Scanner;

// Definir classe Main
public class Main {

    // Definir método main
    public static void main(String[] args) {

        // Declarar scanner
        var scanner = new Scanner(System.in);

        // Inquirir por primeiro número
        System.out.println("Escolha o primeiro número");

        // Declarar primeiro número
        var primeiro_numero = scanner.nextInt();

        // Declarar segundo número
        int segundo_numero;

        // Encontrar segundo número
        do {

            // Inquirir por segundo número
            System.out.println("Escolha o segundo número (maior que o primeiro)");

            // Atribuir segundo número
            segundo_numero = scanner.nextInt();

        } while (segundo_numero <= primeiro_numero);

        // Inquirir por preferência por pares a ímpares e vice-versa
        System.out.println("Você prefere números pares? (s/n)");

        // Declarar preferência
        boolean numerosPares = scanner.next().equalsIgnoreCase("s");

        // Encontrar números requisitados
        for (int i = primeiro_numero, n =    segundo_numero; i <= n; i += 1) {

            // Verificar paridade e preferência
            if ((i % 2 == 0) && numerosPares) System.out.println(i);
            else if (i % 2 != 0 && !numerosPares) System.out.println(i);

        }

    }

}