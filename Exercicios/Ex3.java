import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dois números ao usuário
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        // Estrutura de decisão para comparar os números
        if (num1 > num2) {
            System.out.println("O primeiro número (" + num1 + ") é maior.");
        } else if (num2 > num1) {
            System.out.println("O segundo número (" + num2 + ") é maior.");
        } else {
            System.out.println("Os dois números são iguais.");
        }

        scanner.close();
    }
}
