// Classe base para Produto - Exercício 03
public class Produto {
    protected String codigo;
    protected String nome;
    protected double preco;

    // Construtor
    public Produto(String codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para calcular frete (será sobrescrito nas subclasses)
    public double calcularFrete() {
        return 0;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("=== PRODUTO ===");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + String.format("%.2f", preco));
        System.out.println("Frete: R$ " + String.format("%.2f", calcularFrete()));
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
