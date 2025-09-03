package org.atividade;

public class Aprendizado {
    public static void main(String[] args) {

        char letra = 'p';
        String palavra = letra + "rofessor";


        System.out.println(media());
        System.out.println(casting());
        System.out.println(palavra);
        double valor = valorTotal();
        System.out.println(String.format("O valor é: %.2f", valor));
        System.out.println(dolarReal());
        System.out.println(desconto());

    }

    public static double media(){
        double media = (10 + 7 + 5.7) / 3;
        return media;
    }

    public static int casting(){
        double primeiro_valor = 7.7;
        int conversao = (int) primeiro_valor;
        return conversao;
    }

    public static double valorTotal(){
        double preco = 7.77;
        int quantidade = 5;
        double total = preco * quantidade;
        return total;
    }

    public static double dolarReal(){
        double dolarReal = 4.94;
        int dolares = 20;
        double conversao = dolares * dolarReal;
        return conversao;
    }

    public static double desconto(){
        double precoOriginal = 40.70;
        double valorDesconto = 0.9;
        double desconto = precoOriginal * valorDesconto;
        double precofinal = precoOriginal - desconto;
        return precofinal;

    }

}
