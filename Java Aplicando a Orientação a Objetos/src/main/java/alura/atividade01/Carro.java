package alura.atividade01;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFicha(){
        System.out.println("Modelo do carro: " +modelo);
        System.out.println("Ano do carro: " + ano);
        System.out.println("Cor: " + cor);
    }
    int calcularIdade(){
        int idade = 2025 - ano;
        return idade;
    }
}
