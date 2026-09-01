// Subclasse FilmeAcao - herda de Filme
public class FilmeAcao extends Filme {
    private String nivelViolencia;

    // Construtor
    public FilmeAcao(String titulo, int duracao, String classificacao, String nivelViolencia) {
        super(titulo, duracao, classificacao);
        this.nivelViolencia = nivelViolencia;
    }

    // Getters e Setters
    public String getNivelViolencia() {
        return nivelViolencia;
    }

    public void setNivelViolencia(String nivelViolencia) {
        this.nivelViolencia = nivelViolencia;
    }

    // Polimorfismo - sobrescreve o método exibirDetalhes()
    @Override
    public void exibirDetalhes() {
        System.out.println("=== FILME DE AÇÃO ===");
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Classificação: " + classificacao);
        System.out.println("Nível de Violência: " + nivelViolencia);
    }

}
