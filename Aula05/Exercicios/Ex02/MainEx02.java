// Main para demonstrar Herança e Polimorfismo - Exercício 02
import java.util.ArrayList;
import java.util.List;

public class MainEx02 {

    public static void main(String[] args) {

        // Criando objetos usando referências do tipo Funcionario (polimorfismo)
        List<Funcionario> funcionarios = new ArrayList<>();

        // Adicionando Operador
        funcionarios.add(new Operador("João Silva", "OP-001", 2500.00, 10, 50.00));
        funcionarios.add(new Operador("Maria Santos", "OP-002", 2500.00, 5, 50.00));

        // Adicionando Supervisor
        funcionarios.add(new Supervisor("Carlos Oliveira", "SUP-001", 4000.00, 800.00));
        funcionarios.add(new Supervisor("Ana Costa", "SUP-002", 4000.00, 600.00));

        // Exibindo dados de todos os funcionários (demonstrando polimorfismo)
        System.out.println("===== SISTEMA DE CÁLCULO DE SALÁRIOS - INDÚSTRIA =====\n");

        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirDados();
            System.out.println();
        }

        System.out.println("===== FIM DO RELATÓRIO =====");

    }

}
