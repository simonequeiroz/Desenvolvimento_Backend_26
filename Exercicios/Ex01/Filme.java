// Classe base para Filme - Exercício 01
public class Filme {
    protected String titulo;
    protected int duracao;
    protected String classificacao;

    // Construtor
    public Filme(String titulo, int duracao, String classificacao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    // Método para exibir detalhes (será sobrescrito nas subclasses)
    public void exibirDetalhes() {
        System.out.println("=== FILME ===");
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Classificação: " + classificacao);
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                ", classificacao='" + classificacao + '\'' +
                '}';
    }
}
