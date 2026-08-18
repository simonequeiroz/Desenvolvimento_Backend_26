import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Olá!, " + nome);

        sc.close();
    }

}