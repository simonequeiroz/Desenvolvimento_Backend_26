// Subclasse PagamentoCartao: cobra taxa de 3%
public class PagamentoCartao extends Pagamento {

    private String numeroCartao;
    private int parcelas;

    public PagamentoCartao(double valor, String data, String numeroCartao, int parcelas) {
        super(valor, data);
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }

    @Override
    public void processarPagamento() {
        System.out.println("=== PAGAMENTO POR CARTÃO ===");
        System.out.println("Valor: R$ " + valor);
        System.out.println("Data: " + data);
        System.out.println("Número do cartão: " + numeroCartao);
        System.out.println("Parcelas: " + parcelas);
        System.out.println("Status: Cartão autorizado");
    }

    @Override
    public double calcularTaxa() {
        return valor * 0.03;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public int getParcelas() {
        return parcelas;
    }

}
