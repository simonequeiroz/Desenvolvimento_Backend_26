// Classe base para Funcionário - Exercício 02
public class Funcionario {
    protected String nome;
    protected String matricula;
    protected double salarioBase;

    // Construtor
    public Funcionario(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Método para calcular salário (será sobrescrito nas subclasses)
    public double calcularSalario() {
        return salarioBase;
    }

    // Método para exibir dados (será sobrescrito nas subclasses)
    public void exibirDados() {
        System.out.println("=== FUNCIONÁRIO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário Base: R$ " + String.format("%.2f", salarioBase));
        System.out.println("Salário Total: R$ " + String.format("%.2f", calcularSalario()));
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
