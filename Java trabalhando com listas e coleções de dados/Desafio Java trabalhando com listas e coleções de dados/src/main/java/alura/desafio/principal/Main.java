package alura.desafio.principal;

import alura.desafio.acoes.Menu;
import alura.desafio.modelos.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Menu menu = new Menu();
        int operacao = 0;

        while (operacao != 6){
            menu.trazerMenu();
            operacao = ler.nextInt();
            switch (operacao){
                case 1: {
                 menu.consultarSaldo();
                 break;
                }
                case 2: {
                    menu.consultarSaldo();
                    menu.adicionarSaldo();
                    break;
                }
                case 3: {
                    menu.consultarLeites();
                    menu.comprarLeites();
                    break;
                }
                case 4:{
                    menu.consultarCarnes();
                    menu.comprarCarnes();
                    break;
                }
                case 5:{
                    menu.consultarHigiene();
                    menu.comprarHigiene();
                    break;
                }
                case 6:{
                    menu.listagemCompras();
                    break;
                }
                default:{
                    System.out.println("Digite um valor de operação valido!!");
                }
            }

        }

    }
}
