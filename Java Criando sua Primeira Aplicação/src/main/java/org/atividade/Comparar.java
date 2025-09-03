package org.atividade;

import java.util.Scanner;

public class Comparar {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numeroA;
        int numeroB;

        System.out.print("Digite o primeiro valor: ");
        numeroA = ler.nextInt();

        System.out.print("Digite o segundo valor: ");
        numeroB = ler.nextInt();

        if (numeroA == numeroB){
            System.out.println("São valores iguais.");
        } else if (numeroA > numeroB) {
            System.out.println("São valores diferentes, e o primeiro número é maior");
        } else {
            System.out.println("São valores diferentes, e o segundo número é maior");
        }
    }

}
