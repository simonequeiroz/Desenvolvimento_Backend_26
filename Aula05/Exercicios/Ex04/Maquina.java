// Classe base para máquinas da indústria
public class Maquina {

    protected String codigo;
    protected String nome;
    protected String status;

    public Maquina(String codigo, String nome, String status) {
        this.codigo = codigo;
        this.nome = nome;
        this.status = status;
    }

    public void operar() {
        System.out.println("Máquina " + nome + " operando...");
    }

    public void exibirStatus() {
        System.out.println("=== " + nome.toUpperCase() + " ===");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Status: " + status);
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getStatus() {
        return status;
    }

}
