// Subclasse Esteira - transporta materiais
public class Esteira extends Maquina {

    private double velocidade; // km/h

    public Esteira(String codigo, String nome, String status, double velocidade) {
        super(codigo, nome, status);
        this.velocidade = velocidade;
    }

    @Override
    public void operar() {
        System.out.println(">>> ESTEIRA EM OPERAÇÃO <<<");
        System.out.println("Transportando materiais na velocidade de " + velocidade + " km/h");
        System.out.println("Status: " + status);
        System.out.println();
    }

    public double getVelocidade() {
        return velocidade;
    }

}
