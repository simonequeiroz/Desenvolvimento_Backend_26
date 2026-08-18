// Cria a classe chamada Carro

package Aula02; // package é por conta da pasta criada

// Criando construtor
class Carro {
// Atributos
// Cria uma variavel marca do tipo String
String marca;
String cor;

// Criando construtor

public Carro(String marcaescolhida, String corescolhida){
    // this para me referir a um atributo de dentro da classe
    this.marca = marcaescolhida;
    this.cor = corescolhida;
}

// Metodo (Ação)

void buzinar(){
    // Exibir mensagem no terminal
    System.out.println("Bibi");
}
    
}






