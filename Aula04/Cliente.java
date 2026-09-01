// Classe cliente 
/*
Nesta primeira etapa o nivel do cliente é um número
1 - Nivel A, 2 - Nivel B, 3 Nivel C
 */
public class Cliente {
    // Encapsulamento : os atributos ficam protegidos com o private
    private String codigoCti;
    private String segmento;
    private int nivel;
    private String faixaFaturamento;
    private Consultor consultorResponsavel;

    // Cria o construtor com o setter para validar os dados

    public Cliente(
            String codigoCti,
            String segmento,
            int nivel,
            String faixaFaturamento,
            Consultor consultorResponsavel) {
        setCodigoCti(codigoCti);
        setSegmento(segmento);
        setNivel(nivel);
        setFaixaFaturamento(faixaFaturamento);
        setConsultorResponsavel(consultorResponsavel);
    }

    // Getter : para consultar o codigo do cliente

    public String getCodigoCti() {
        return codigoCti;
    }

    // Setter para guardar o valor recebido

    public void setCodigoCti(String codigoCti) {
        this.codigoCti = codigoCti;
    }

    // Getter com o segmento

    public String getSegmento() {
        return segmento;
    }

    // Setter para configurar o segmento

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    // Getter do nivel numerico

    public int getNivel() {
        return nivel;
    }

    // Setter com validação usando apenas valore numéricos
    // Os valores são 1,2 e 3

    public void setNivel(int nivel) {
        if (nivel >= 1 && nivel <= 3) {
            this.nivel = nivel;
        } else {
            System.out.println("Erro o nivel deve ser 1,2 ou 3");
        }

    }

    public String getFaixaFaturamento() {
        return faixaFaturamento;
    }

    public void setFaixaFaturamento(String faixaFaturamento) {
        this.faixaFaturamento = faixaFaturamento;
    }

    public Consultor getConsultorResponsavel() {
        return consultorResponsavel;
    }

    public void setConsultorResponsavel(Consultor consultorResponsavel) {
        this.consultorResponsavel = consultorResponsavel;
    }

    /*
     * Metodo de negocio: Atualiza o nivel usando a mesma regra do setter
     */

    public void atualizarNivel(int novoNivel) {
        setNivel(novoNivel);
    }

    /*
     * 
     * Exibe os dados principais do cliente
     */

    public void exibirResumo() {
        System.out.println("\n --- Resumo do cliente CTI ---");
        System.out.println("Codigo CTI: " + codigoCti);
        System.out.println("Segmento: " + segmento);
        System.out.println("Nivel numerico: " + nivel);
        System.out.println("Faixa de faturamento: " + faixaFaturamento);
        System.out.println("Consultor: " + consultorResponsavel.getNome());
    }

}
