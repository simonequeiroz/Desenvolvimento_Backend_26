// Subclasse ProdutoFisico - herda de Produto - Exercício 03
public class ProdutoFisico extends Produto {
    private double peso;

    // Construtor
    public ProdutoFisico(String codigo, String nome, double preco, double peso) {
        super(codigo, nome, preco);
        this.peso = peso;
    }

    // Getters e Setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Polimorfismo - sobrescreve o método calcularFrete()
    // Frete = peso × 8.0
    @Override
    public double calcularFrete() {
        return peso * 8.0;
    }

    // Polimorfismo - sobrescreve o método exibirInformacoes()
    @Override
    public void exibirInformacoes() {
        System.out.println("=== PRODUTO FÍSICO ===");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + String.format("%.2f", preco));
        System.out.println("Peso: " + String.format("%.2f", peso) + " kg");
        System.out.println("Frete: R$ " + String.format("%.2f", calcularFrete()));
    }
}
