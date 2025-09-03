package alura.atividade03.questao3;

public class ContaBancaria {
    protected double saldo;

    public void sacarSaldo(double saldo){
        if (this.saldo < saldo){
            System.out.println("Saldo de %.2f insuficiente para o saque!".formatted(this.saldo));
        } else {
            this.saldo -= saldo;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    public void depositarSaldo(double saldo){
        this.saldo += saldo;
        System.out.println("Depósito realizado com sucesso!");
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo atual é: %.2f".formatted(saldo));
    }
}
