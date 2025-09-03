package org.atividade;

import java.util.Scanner;

public class ImparPar {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int numero;

        System.out.print("Digite um valor: ");
        numero = ler.nextInt();

        if (numero % 2 == 0){
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }

    }

}
