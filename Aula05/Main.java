public class Main {

    // Cria a função principal

    public static void main(String [] args){

        Pessoa pessoa1 = new Consultor("Daniel Vieira", "CON-0095");
        Pessoa pessoa2 = new Cliente("Alpha", "CLI-001", "Industrial", "A");
     pessoa1.exibirInformacoes();
     System.out.println();
     pessoa2.exibirInformacoes();
    
    }
    
}
