// Subclasse RoboIndustrial - realiza operação de montagem
public class RoboIndustrial extends Maquina {

    private int bracos; // quantidade de braços robóticos

    public RoboIndustrial(String codigo, String nome, String status, int bracos) {
        super(codigo, nome, status);
        this.bracos = bracos;
    }

    @Override
    public void operar() {
        System.out.println("*** ROBÔ INDUSTRIAL EM OPERAÇÃO ***");
        System.out.println("Realizando operação de montagem com " + bracos + " braços");
        System.out.println("Precisão: Alta | Status: " + status);
        System.out.println();
    }

    public int getBracos() {
        return bracos;
    }

}
