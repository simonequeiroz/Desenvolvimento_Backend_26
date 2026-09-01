// Main para demonstrar Herança e Polimorfismo - Exercício 05
import java.util.ArrayList;
import java.util.List;

public class MainEx05 {

    public static void main(String[] args) {

        List<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new PagamentoPix(250.00, "31/08/2026", "simone@pix.com"));
        pagamentos.add(new PagamentoCartao(1200.00, "31/08/2026", "1234 5678 9012 3456", 3));
        pagamentos.add(new PagamentoBoleto(800.50, "31/08/2026", "00190.00009 00500.000123 45600.000789 0 12345678901234"));

        System.out.println("===== LOJA VIRTUAL - PROCESSAMENTO DE PAGAMENTOS =====\n");

        for (Pagamento pagamento : pagamentos) {
            pagamento.processarPagamento();
            System.out.printf("Taxa aplicada: R$ %.2f%n", pagamento.calcularTaxa());
            System.out.println("--------------------------------------------------");
            System.out.println();
        }

        System.out.println("===== EXPLICAÇÃO SOBRE POLIMORFISMO =====");
        System.out.println("Objetos de diferentes subclasses podem ser armazenados em uma lista do tipo Pagamento.");
        System.out.println("Isso acontece porque PagamentoPix, PagamentoCartao e PagamentoBoleto herdam da classe Pagamento.");
        System.out.println("Assim, o método processarPagamento() e calcularTaxa() são chamados de forma correta");
        System.out.println("de acordo com o tipo real do objeto armazenado.");
        System.out.println("\n===== FIM DO PROGRAMA =====");
    }
}
