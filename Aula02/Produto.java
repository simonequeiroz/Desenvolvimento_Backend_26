package Aula02;

public class Produto {
    // Características do produto (Atributos)
    String nome;
    double preco;
    int quantidade;

    // Ações que o produto pode fazer (Métodos)
    public void mostrarDetalhes() {
        System.out.println("Produto: " + nome);
    }

    // Ponto de entrada do programa (Adicionado o 'static')
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 2500.00;
        p1.mostrarDetalhes();
    }
}