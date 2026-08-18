// Exemplo classe calculadora notas 

public class CalculadoraNotas {

    // Criando o primeiro metodo

    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

 // Cria o metodo paa verificar a situação

public static String verificarSituacao(double media) {
    if(media >=7){
        return "Aprovado";
    } else {
        return "Reprovado";
    }
}




// Cria metodo chamado exibir resultados

public static void exibirResultado(String nome, double media, String situacao){
        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
    }

 // Cria o metodo void main
    public static void main(String[] args){
        String nome = "Mariana ";
        double nota1 = 8.0;
        double nota2 = 6.5;
        double media = calcularMedia(nota1, nota2);
        String situacao = verificarSituacao(media);
        exibirResultado(nome, media, situacao);

}


}