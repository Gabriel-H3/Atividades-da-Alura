package alura.atividades.atividade03.questao6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var conta1 = new ContaBancaria("Bruce Wayne", 1000);
        var conta2 = new ContaBancaria("Tony Stark", 980);
        var conta3 = new ContaBancaria("Peter Park", 100000);
        double valorFinal = 0;
        ContaBancaria contaMaior = null;

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        for (ContaBancaria contaBancaria : contas){
            double maior = contaBancaria.getSaldo();
            if (maior > valorFinal){
                valorFinal = maior;
                contaMaior = contaBancaria;
            }
        }

        System.out.println(contaMaior);


    }
}
