package org.atividade;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        int fatorial = 1;
        int multi = 1;

        System.out.print("Digite um número para ter o fatorial: ");
        numero = ler.nextInt();

        for (int i = 0; i < numero; i++) {
            fatorial *= multi;
            multi ++;
        }
        System.out.println("!%d = %d".formatted(numero, fatorial));
    }
}
