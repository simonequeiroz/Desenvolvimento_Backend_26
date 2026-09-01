import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe o cardápio exatamente como está no slide
        System.out.println("=== CARDÁPIO ===");
        System.out.println("1 - Hambúrguer    R$ 20,00");
        System.out.println("2 - Pizza         R$ 35,00");
        System.out.println("3 - Cachorro-quente R$ 15,00");
        System.out.println("4 - Refrigerante  R$ 8,00");
        System.out.println("=================");
        
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        // Utilizando o switch exigido pelo professor
        switch (opcao) {
            case 1:
                System.out.println("Produto: Hambúrguer");
                System.out.println("Preço: R$ 20.00");
                break;
            case 2:
                System.out.println("Produto: Pizza");
                System.out.println("Preço: R$ 35.00");
                break;
            case 3:
                System.out.println("Produto: Cachorro-quente");
                System.out.println("Preço: R$ 15.00");
                break;
            case 4:
                System.out.println("Produto: Refrigerante");
                System.out.println("Preço: R$ 8.00");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}
