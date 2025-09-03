package org.atividade;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner ler = new Scanner(System.in);
        int valor = random.nextInt(100);
        int tentativas = 0;
        int chute;

      while (tentativas < 5){
          tentativas++;
          System.out.print("Digite um valor entre 1 e 100: ");
          chute = ler.nextInt();
         if (chute == valor){
             System.out.println("Você acertou em cheio em apenas %d tentativas!".formatted(tentativas));
             break;
         } else if (chute < valor) {
             System.out.println("O valor que você digitou é menor!!");
          } else {
             System.out.println("O valor que você digitou é maior!!");
         }

         if (tentativas == 5){
             System.out.println("Suas tenativas acabaram... o Valor era: " + valor);
             System.out.println("It's over, betinha...");
         }

      }

    }

}
