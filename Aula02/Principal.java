package aula02;

public class Principal {
    // metodo principal para executar o codigo
    public static void main(String []args){

    // Cria o objeto chamado meuCarro
    Carro meuCarro = new Carro();

    // Atribuindo a cor e a marca ao objeto
    meuCarro.marca = "Fiat";
    meuCarro.cor = "Vermelho";
    // Exibindo informações do veiculo
    System.out.println("Carro marca: " + meuCarro.marca + " cor: " + meuCarro.cor);
    meuCarro.buzinar();

    }
    
}


