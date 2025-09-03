package alura.atividade04.questao05;

public class Livro implements Calculavel{

    private String nome;
    private double taxa = 0.2;
    private int quantidade;
    private double preco;

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    private double taxar(double preco){
        double valor;
        valor = preco * taxa;
        return valor;
    }

    @Override
    public double calcularPrecoFinal() {
        double valorFinal = (preco + taxar(preco)) * quantidade;
        return valorFinal;
    }
}
