package org.atividade;

import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius;
        System.out.println("Passe o valor de Celsius: ");
        celsius = sc.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Em Fahrenheit: " + fahrenheit);
        int conversao = (int) fahrenheit;
        System.out.println("Arredondando: " + conversao);

    }
}
