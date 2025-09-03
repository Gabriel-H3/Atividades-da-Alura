package alura.atividade03.questao3;

public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal = 2.90;

    public double cobrarTarifa(){
        this.saldo -= tarifaMensal;
        return this.saldo;
    }
}
