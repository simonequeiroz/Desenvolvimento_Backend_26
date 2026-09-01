import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o saldo inicial exigido pelo professor
        System.out.print("Digite o saldo inicial da conta: R$ ");
        double saldo = scanner.nextDouble();

        // Apresenta o menu de opções
        System.out.println("\n=== ATENDIMENTO BANCÁRIO ===");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");
        System.out.println("============================");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                // Opção 1: Exibir o saldo atual
                System.out.println("Saldo atual: R$ " + saldo);
                break;

            case 2:
                // Opção 2: Solicitar o valor do depósito (deve ser maior que zero)
                System.out.print("Digite o valor do depósito: R$ ");
                double deposito = scanner.nextDouble();
                if (deposito > 0) {
                    saldo += deposito; // saldo = saldo + deposito
                    System.out.println("Depósito realizado com sucesso!");
                    System.out.println("Novo saldo: R$ " + saldo);
                } else {
                    System.out.println("Valor inválido");
                }
                break;

            case 3:
                // Opção 3: Solicitar o valor do saque (deve ser > 0 e <= saldo)
                System.out.print("Digite o valor do saque: R$ ");
                double saque = scanner.nextDouble();
                if (saque <= 0) {
                    System.out.println("Valor inválido");
                } else if (saque > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= saque; // saldo = saldo - saque
                    System.out.println("Saque realizado com sucesso!");
                    System.out.println("Novo saldo: R$ " + saldo);
                }
                break;

            case 4:
                // Opção 4: Exibir programa encerrado
                System.out.println("Programa encerrado.");
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}
