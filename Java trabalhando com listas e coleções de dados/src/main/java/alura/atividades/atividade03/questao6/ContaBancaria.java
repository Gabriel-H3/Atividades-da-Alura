package alura.atividades.atividade03.questao6;

public class ContaBancaria {
    private String nome;
    private double saldo;

    public ContaBancaria(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Titular: " + nome + "| Saldo: " + saldo;
    }
}
