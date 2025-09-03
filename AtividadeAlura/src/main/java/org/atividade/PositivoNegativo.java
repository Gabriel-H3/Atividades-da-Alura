package org.atividade;

import java.util.Scanner;

public class PositivoNegativo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        System.out.print("Digite um valor: ");
        numero = ler.nextInt();
        if (numero > 0){
            System.out.println("Este número é positivo");
        } else if (numero < 0) {
            System.out.println("Este número é negativo");
        } else {
            System.out.println("Este número é um zero, fi");
        }
    }

}
