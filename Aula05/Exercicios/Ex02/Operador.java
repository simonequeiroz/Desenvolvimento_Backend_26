// Subclasse Operador - herda de Funcionario - Exercício 02
public class Operador extends Funcionario {
    private double horasExtras;
    private double valorHoraExtra;

    // Construtor
    public Operador(String nome, String matricula, double salarioBase, double horasExtras, double valorHoraExtra) {
        super(nome, matricula, salarioBase);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    // Getters e Setters
    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    // Polimorfismo - sobrescreve o método calcularSalario()
    @Override
    public double calcularSalario() {
        return salarioBase + (horasExtras * valorHoraExtra);
    }

    // Polimorfismo - sobrescreve o método exibirDados()
    @Override
    public void exibirDados() {
        System.out.println("=== OPERADOR ===");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário Base: R$ " + String.format("%.2f", salarioBase));
        System.out.println("Horas Extras: " + String.format("%.2f", horasExtras));
        System.out.println("Valor Hora Extra: R$ " + String.format("%.2f", valorHoraExtra));
        System.out.println("Salário Total: R$ " + String.format("%.2f", calcularSalario()));
    }
}
