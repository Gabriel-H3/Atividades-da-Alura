package org.atividade;

import java.util.Scanner;

public class Calcular {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;
        String mensagem = """
                Escolha opção de cálculo:
                1. Calcular área do quadrado.
                2. Calcular área do circulo.
                """;
        System.out.println(mensagem);
        opcao = ler.nextInt();

        switch (opcao){

            case 1:{
            double lado;
                System.out.print("Digite o lado do quadrado: ");
                lado = ler.nextDouble();
                lado *= lado;
                System.out.println("A área do quadrado é igual a: " + lado);
                break;
            }
            case 2:{
            double raio;
                System.out.print("Digite o raio do circulo: ");
                raio = ler.nextInt();
                raio = (raio * raio) * 3.14;
                System.out.println("A área do circulo é igual a: " + raio);
                break;
            }

        }
    }
}
