import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // Criamos o scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome ao usuário
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        // Exibe o nome digitado no terminal
        System.out.println("Nome digitado: " + nome);

        // Fecha o leitor para liberar memória
        scanner.close();
    }
}
