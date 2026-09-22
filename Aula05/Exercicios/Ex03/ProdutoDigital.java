// Subclasse ProdutoDigital - herda de Produto - Exercício 03
public class ProdutoDigital extends Produto {

    // Construtor
    public ProdutoDigital(String codigo, String nome, double preco) {
        super(codigo, nome, preco);
    }

    // Polimorfismo - sobrescreve o método calcularFrete()
    // Produto digital não possui custo de frete
    @Override
    public double calcularFrete() {
        return 0;
    }

    // Polimorfismo - sobrescreve o método exibirInformacoes()
    @Override
    public void exibirInformacoes() {
        System.out.println("=== PRODUTO DIGITAL ===");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + String.format("%.2f", preco));
        System.out.println("Frete: R$ " + String.format("%.2f", calcularFrete()) + " (Sem frete)");
    }
}
