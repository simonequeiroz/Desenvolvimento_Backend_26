// Main para demonstrar Herança e Polimorfismo - Exercício 04
import java.util.ArrayList;
import java.util.List;

public class MainEx04 {

    public static void main(String[] args) {

        // Criando lista de máquinas usando referência do tipo Maquina (polimorfismo)
        List<Maquina> linhaProducao = new ArrayList<>();

        // Adicionando máquinas de diferentes tipos
        linhaProducao.add(new Esteira("EST-001", "Esteira Principal", "Ativa", 2.5));
        linhaProducao.add(new RoboIndustrial("RB-001", "Robô de Montagem", "Ativa", 6));
        linhaProducao.add(new Prensa("PRS-001", "Prensa Hidráulica", "Ativa", 150.0));
        linhaProducao.add(new Esteira("EST-002", "Esteira Secundária", "Ativa", 1.8));
        linhaProducao.add(new RoboIndustrial("RB-002", "Robô Soldador", "Ativa", 4));
        linhaProducao.add(new Prensa("PRS-002", "Prensa Manual", "Ativa", 50.0));

        // Exibindo informações de todas as máquinas
        System.out.println("===== LINHA DE PRODUÇÃO - INDÚSTRIA ABC =====\n");

        for (Maquina maquina : linhaProducao) {
            maquina.exibirStatus();
            maquina.operar();
        }

        // Estatísticas
        System.out.println("===== ESTATÍSTICAS DA LINHA =====");
        System.out.println("Total de máquinas: " + linhaProducao.size());
        System.out.println("Máquinas em operação: " + contarMaquinasAtivas(linhaProducao));

        // Explicação sobre Polimorfismo
        System.out.println("\n===== EXPLICAÇÃO SOBRE POLIMORFISMO =====\n");
        System.out.println("Por que objetos de diferentes tipos podem estar em uma lista do tipo Maquina?\n");
        System.out.println("Resposta: Porque Esteira, RoboIndustrial e Prensa HERDAM da classe Maquina.");
        System.out.println("Isso significa que cada objeto dessas subclasses é também uma Maquina.\n");
        System.out.println("Benefícios:");
        System.out.println("1. Uma única lista pode controlar máquinas de diferentes tipos");
        System.out.println("2. O método operar() correto é chamado automaticamente:");
        System.out.println("   - Esteira: transporta materiais");
        System.out.println("   - RoboIndustrial: realiza montagem");
        System.out.println("   - Prensa: executa conformação");
        System.out.println("3. Novo tipos de máquinas podem ser adicionados sem alterar o código");
        System.out.println("4. Mesma interface (operar), comportamentos diferentes!\n");
        System.out.println("===== FIM DO PROGRAMA =====");

    }

    // Método auxiliar para contar máquinas ativas
    private static int contarMaquinasAtivas(List<Maquina> maquinas) {
        int contador = 0;
        for (Maquina maquina : maquinas) {
            if (maquina.getStatus().equalsIgnoreCase("Ativa")) {
                contador++;
            }
        }
        return contador;
    }

}
