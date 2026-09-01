// Subclasse PagamentoBoleto: cobra taxa de 1%
public class PagamentoBoleto extends Pagamento {

    private String codigoBarras;

    public PagamentoBoleto(double valor, String data, String codigoBarras) {
        super(valor, data);
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento() {
        System.out.println("=== PAGAMENTO POR BOLETO ===");
        System.out.println("Valor: R$ " + valor);
        System.out.println("Data: " + data);
        System.out.println("Código de barras: " + codigoBarras);
        System.out.println("Status: Boleto gerado com sucesso");
    }

    @Override
    public double calcularTaxa() {
        return valor * 0.01;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

}
