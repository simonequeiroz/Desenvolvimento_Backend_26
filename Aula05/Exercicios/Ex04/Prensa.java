// Subclasse Prensa - executa processo de conformação
public class Prensa extends Maquina {

    private double forca; // toneladas

    public Prensa(String codigo, String nome, String status, double forca) {
        super(codigo, nome, status);
        this.forca = forca;
    }

    @Override
    public void operar() {
        System.out.println("<<< PRENSA EM OPERAÇÃO >>>");
        System.out.println("Executando processo de conformação com força de " + forca + " toneladas");
        System.out.println("Ciclo de prensagem ativo | Status: " + status);
        System.out.println();
    }

    public double getForca() {
        return forca;
    }

}
