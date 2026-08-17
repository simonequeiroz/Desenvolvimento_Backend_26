// Exemplo de programa em Java

// importando a biblioteca do Scanner

import java.util.Scanner; // Permite capturar as informações digitadas pelo usuario
public class Main {
    
    // cria uma função publica chamada main
    public static void main(String [] args){
        // Criando o objeto scanner que permite capturar as informações digitadas pelo usuario
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");

        String nome = sc.nextLine(); // Armazena o nome do aluno

        System.out.print("Digite a primeira nota: "); // mensagem no terminal
        double nota1 = sc.nextDouble(); // armazena a primeira nota
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble(); // armazena a segunda nota
        double media = (nota1 +nota2)/2;
        System.out.println("\n Aluno: " + nome);
        System.out.println("Média: " + media);

                 if (media >=7){
            System.out.println("Situação: Aprovado");
        }
        else if(media>=5){
            System.out.println("Situação: Recuperação");
        }
        else{

            System.out.print("Situação: Reprovado");
        }
        sc.close();


    }

}