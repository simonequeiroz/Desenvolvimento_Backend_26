// Subclasse PagamentoPix: não cobra taxa
public class PagamentoPix extends Pagamento {

    private String chavePix;

    public PagamentoPix(double valor, String data, String chavePix) {
        super(valor, data);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento() {
        System.out.println("=== PAGAMENTO VIA PIX ===");
        System.out.println("Valor: R$ " + valor);
        System.out.println("Data: " + data);
        System.out.println("Chave PIX: " + chavePix);
        System.out.println("Status: Pagamento aprovado via PIX");
    }

    @Override
    public double calcularTaxa() {
        return 0.0;
    }

    public String getChavePix() {
        return chavePix;
    }

}
