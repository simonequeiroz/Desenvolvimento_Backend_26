package Aula02;

class Animal{
    void emitirSom(){
        System.out.println("O animal emite um som");
    }
}

// Exemplo herança

class Cachorro extends Animal{
    // Polimorfismo
    @Override 
    void emitirSom(){
        System.out.println("O cachorro faz Au au !");
    }

}


class Vaca extends Animal{
    @Override
    void emitirSom(){
        System.out.println("A vaca faz Muu !");
    }
}

// Cria a classe Ex2
 public class Ex2{
    public static void main(String [] args){
        Animal animal1 = new Cachorro();
        Animal animal2 = new Vaca();
        animal1.emitirSom();
        animal2.emitirSom();
    }
 }
