package Projeto01;
public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Lucas";
        aluno1.idade = 18;
        aluno1.nota1 = 8.0;
        aluno1.nota2 = 7.0;
        aluno1.apresentar();
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println("Situação: " + aluno1.verificarSituacao());
    }

}