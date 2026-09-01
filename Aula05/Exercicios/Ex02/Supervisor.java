// Subclasse Supervisor - herda de Funcionario - Exercício 02
public class Supervisor extends Funcionario {
    private double bonus;

    // Construtor
    public Supervisor(String nome, String matricula, double salarioBase, double bonus) {
        super(nome, matricula, salarioBase);
        this.bonus = bonus;
    }

    // Getters e Setters
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Polimorfismo - sobrescreve o método calcularSalario()
    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }

    // Polimorfismo - sobrescreve o método exibirDados()
    @Override
    public void exibirDados() {
        System.out.println("=== SUPERVISOR ===");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário Base: R$ " + String.format("%.2f", salarioBase));
        System.out.println("Bônus: R$ " + String.format("%.2f", bonus));
        System.out.println("Salário Total: R$ " + String.format("%.2f", calcularSalario()));
    }
}
