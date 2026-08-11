package aula02;

public class Principal {
    // metodo principal para executar o codigo
    public static void main(String []args){

    // Cria o objeto chamado meuCarro
    Carro meuCarro = new Carro("Fiat","vermelho");
     System.out.println("Carro marca: " + meuCarro.marca + " cor: " + meuCarro.cor);
    // Atribuindo a cor e a marca ao objeto
    meuCarro.marca = "Nissan";
    meuCarro.cor = "azul";
    // Exibindo informações do veiculo
    System.out.println("Carro marca: " + meuCarro.marca + " cor: " + meuCarro.cor);
    meuCarro.buzinar();

    }
    
}
