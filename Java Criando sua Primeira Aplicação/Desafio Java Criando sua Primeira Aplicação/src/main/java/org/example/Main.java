package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome = "Josuke Higashikata";
        String tipoConta = "Corrente";
        double saldo = 1518.52;
        int operacao;
        boolean loop = true;
        String perfil = """
                *************************************************
                Bem-vindo ao Banco do Amor!
                Nome do cliente: %s
                Tipo de conta: %s
                Saldo atual: %.2f
                *************************************************
                """.formatted(nome, tipoConta, saldo);
        String menu = """
                Operações:
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;


        System.out.println(perfil);

        while (loop){

            System.out.println(menu);
            operacao = ler.nextInt();
            switch (operacao) {
                case 1: {
                    System.out.println("Seu saldo atual: " + saldo);
                    break;
                }
                case 2: {
                    double receber;
                    System.out.print("Digite o valor que deseja receber: ");
                    receber = ler.nextDouble();
                    saldo = saldo + receber;
                    System.out.println("Novo saldo: " + saldo);
                    break;
                }
                case 3: {
                    double transferir;
                    System.out.print("Digite o valor que deseja transferir: ");
                    transferir = ler.nextDouble();
                    saldo = Transferir(transferir, saldo);
                    break;
                }
                case 4: {
                    System.out.println("Saindo...");
                    loop = false;
                    break;
                }
                default: {
                    System.out.println("Digite uma operação válida!");
                    break;
                }
            }
        }

    }

        public static double Transferir (double transferir, double saldo){

            if(transferir > saldo){
                System.out.println("Não há saldo o suficiente para esta transação!");

            }
            else{
                saldo = saldo - transferir;
                System.out.println("Transferido");
                System.out.println("Novo saldo: " + saldo);
            }

            return  saldo;


        }
}