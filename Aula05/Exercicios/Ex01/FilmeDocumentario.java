// Subclasse FilmeDocumentario - herda de Filme - Exercício 01
public class FilmeDocumentario extends Filme {
    private String tema;

    // Construtor
    public FilmeDocumentario(String titulo, int duracao, String classificacao, String tema) {
        super(titulo, duracao, classificacao);
        this.tema = tema;
    }

    // Getters e Setters
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    // Polimorfismo - sobrescreve o método exibirDetalhes()
    @Override
    public void exibirDetalhes() {
        System.out.println("=== FILME DOCUMENTÁRIO ===");
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Classificação: " + classificacao);
        System.out.println("Tema: " + tema);
    }
}
