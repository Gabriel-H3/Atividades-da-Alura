package org.atividade;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;

        System.out.print("Digite um valor: ");
        numero = ler.nextInt();

        for (int i = 1; i < 11; i++) {
            int tabuada = numero * i;
            System.out.println("%d x %d = %d".formatted(numero, i, tabuada));
        }
    }
}
