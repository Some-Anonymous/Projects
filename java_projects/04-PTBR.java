
// Importar Scanner de java.util
import java.util.Scanner;

// Importar Arraylist de java.util
import java.util.ArrayList;

// Definir classe Main
public class Main { 

    // Declarar número de múltiplos
    static int NUMERO_MULTIPLOS = 20;

    // Definir método main
    public static void main(String[] args) {

        // Declarar scanner
        var scanner = new Scanner(System.in);

        // Inquirir por número
        System.out.println("Escolha um número");

        // Declarar número
        var numero = scanner.nextInt();

        // Declarar array de divisores inteiros
        ArrayList<Integer> divisores = new ArrayList<>();

        // Encontrar divisores
        for (int i = 1, n = numero; i <= n; i++) {

            // Adicionar divisor encontrado
            if (n % i == 0) divisores.add(i);

        }

        // Declarar se número é par ou não
        var numeroEPar = numero % 2 == 0 ? true : false;

        // Declarar sucessor
        var sucessor = numero + 1;

        // Declarar antecessor
        var antecessor = numero - 1;

        // Declarar array de múltiplos inteiros
        ArrayList<Integer> multiplos = new ArrayList<>();

        // Encontrar múltiplos
        for (var i = 1; i <= NUMERO_MULTIPLOS; i++) {

            // Adicionar múltiplo encontrado
            multiplos.add(numero * i);

        }

        // Exibir tabela
        System.out.printf("\nNÚMERO:\nValor: %d\nSucessor: %d\nAntecessor: %d\nPar: %b\nDivisores: %s\nMúltiplos: %s\n",
        numero, sucessor, antecessor, numeroEPar, divisores, multiplos);

    }

}