// Main para demonstrar Herança e Polimorfismo - Exercício 01
import java.util.ArrayList;
import java.util.List;

public class MainEx01 {

    public static void main(String[] args) {

        // Criando objetos usando referências do tipo Filme (polimorfismo)
        List<Filme> catalogoFilmes = new ArrayList<>();

        // Adicionando FilmeAcao
        catalogoFilmes.add(new FilmeAcao("Explosão em Metrópolis", 128, "14 anos", "Alto"));
        catalogoFilmes.add(new FilmeAcao("Resgate Extremo", 115, "12 anos", "Moderado"));

        // Adicionando FilmeDocumentario
        catalogoFilmes.add(new FilmeDocumentario("Vida Selvagem", 85, "Livre", "Natureza"));
        catalogoFilmes.add(new FilmeDocumentario("História da Tecnologia", 102, "Livre", "Tecnologia"));

        // Exibindo detalhes de todos os filmes (demonstrando polimorfismo)
        System.out.println("===== CATÁLOGO DE FILMES - PLATAFORMA DE STREAMING =====\n");

        for (Filme filme : catalogoFilmes) {
            filme.exibirDetalhes();
            System.out.println();
        }

        System.out.println("===== FIM DO CATÁLOGO =====");

    }

}
