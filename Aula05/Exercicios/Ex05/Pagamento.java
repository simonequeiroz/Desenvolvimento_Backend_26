// Classe base para diferentes formas de pagamento
public class Pagamento {

    protected double valor;
    protected String data;

    public Pagamento(double valor, String data) {
        this.valor = valor;
        this.data = data;
    }

    public void processarPagamento() {
        System.out.println("Processando pagamento...");
    }

    public double calcularTaxa() {
        return 0.0;
    }

    public void exibirResumo() {
        System.out.println("Valor: R$ " + valor);
        System.out.println("Data: " + data);
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

}
