public class TelemetriaErro extends Telemetria{

    private String mensagemErro;
    // construtor 

    public TelemetriaErro(String evento, String status, String mensagemErro){
        super(evento, status);
        this.mensagemErro = mensagemErro;

    }

    public String getMensagemErro(){
        return mensagemErro;
    }

    // polimorfismo

    @Override
    public void exibirTelemetria(){
        super.exibirTelemetria();
        System.out.println("Mensagem de erro: " + mensagemErro);
        System.out.println("Tipo: Falha na execução");
    }
}
