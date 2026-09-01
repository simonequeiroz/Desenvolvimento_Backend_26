import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor da compra
        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        double porcentagemDesconto = 0.0;

        // Regras de desconto baseadas no slide
        if (valorCompra <= 100.0) {
            porcentagemDesconto = 0.0;
        } else if (valorCompra <= 500.0) {
            porcentagemDesconto = 0.10; // 10%
        } else {
            porcentagemDesconto = 0.15; // 15%
        }

        // Cálculos finais
        double valorDesconto = valorCompra * porcentagemDesconto;
        double valorFinal = valorCompra - valorDesconto;

        // Exibe os resultados exigidos pelo professor
        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Valor final: R$ " + valorFinal);

        scanner.close();
    }
}
