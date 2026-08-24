import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CÁLCULO DE IMC ===");

        // Solicita os dados (use vírgula no terminal se der erro com ponto)
        System.out.print("Digite o seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura (em metros): ");
        double altura = scanner.nextDouble();

        // Realiza o cálculo do IMC
        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        // Classificação do resultado baseada nas regras do slide
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Classificação: Peso normal");
        } else if (imc <= 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }

        scanner.close();
    }
}
