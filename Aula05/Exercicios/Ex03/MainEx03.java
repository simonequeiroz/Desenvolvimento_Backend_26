// Main para demonstrar Herança e Polimorfismo - Exercício 03
import java.util.ArrayList;
import java.util.List;

public class MainEx03 {

    public static void main(String[] args) {

        // Criando objetos usando referências do tipo Produto (polimorfismo)
        List<Produto> carrinhoProdutos = new ArrayList<>();

        // Adicionando ProdutoFisico
        carrinhoProdutos.add(new ProdutoFisico("PF-001", "Notebook", 3500.00, 2.5));
        carrinhoProdutos.add(new ProdutoFisico("PF-002", "Mouse", 85.00, 0.1));

        // Adicionando ProdutoDigital
        carrinhoProdutos.add(new ProdutoDigital("PD-001", "Software Office", 299.99));
        carrinhoProdutos.add(new ProdutoDigital("PD-002", "E-book", 49.99));

        // Exibindo informações de todos os produtos (demonstrando polimorfismo)
        System.out.println("===== E-COMMERCE: CÁLCULO DE FRETE =====\n");

        for (Produto produto : carrinhoProdutos) {
            produto.exibirInformacoes();
            System.out.println();
        }

        // A resposta detalhada da pergunta do exercício está em RespostaEx03.txt
        System.out.println("===== FIM DO PROGRAMA =====");

    }

}
