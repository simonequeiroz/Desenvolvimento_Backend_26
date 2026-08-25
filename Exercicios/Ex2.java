import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a idade da pessoa
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        // Estrutura de decisão para verificar a maioridade
        if (idade < 18) {
            System.out.println("Menor de idade");
        } else {
            System.out.println("Maior de idade");
        }

        scanner.close();
    }
}
