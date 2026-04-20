
// Importar Scanner de java.util
import java.util.Scanner;

// Definir classe Main
public class Main {

    // Definir método main
    public static void main(String[] args) {

        // Verificar se número de argumentos é correto
        if (args.length != 1) {

            System.out.println("Uso: java 01-PTBR.java [infomação-adicional]");

        }

        // Executar resto do código
        else {

            // Declarar scanner
            var scanner = new Scanner(System.in);

            // Inquirir por nome
            System.out.println("Qual é o seu nome?");

            // Declarar nome
            var nome = scanner.next();

            // Inquirir por lugar
            System.out.println("De onde você é?");

            // Declarar lugar
            var lugar = scanner.next();

            // Inquirir por ano de nascimento
            System.out.println("Qual é seu ano de nascimento?");

            // Declarar idade
            var idade = 2026 - scanner.nextInt();

            // Inquirir por trabalho
            System.out.println("Você está trabalhando?");

            // Declarar se está trabalhando ou não
            var estaTrabalhando = scanner.nextBoolean();

            // Inquirir por parceiro
            System.out.println("Você tem parceiro?");

            // Declarar se tem parceiro ou não
            var temParceiro = scanner.nextBoolean();

            // Declarar informações adicionais
            var informacoesAdicionais = args[0];

            // Quebra de linha
            System.out.println();

            // Exibir mensagem
            System.out.printf("Olá, %s de %s sua idade é %s e está trabalhando (%s) tem parceiro (%s). Informações adicionais: %s\n", nome, lugar, idade, estaTrabalhando, temParceiro, informacoesAdicionais);

            // Exibir tabela
            System.out.printf("\nInformações:\nNome: %s\nLugar: %s\nIdade: %s\nTrabalhando: %s\nTem parceiro: %s\nInformações adicionais: %s\n", nome, lugar, idade, estaTrabalhando, temParceiro, informacoesAdicionais);

        }

    }

}