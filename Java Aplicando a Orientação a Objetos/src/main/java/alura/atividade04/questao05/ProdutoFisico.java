package alura.atividade04.questao05;

public class ProdutoFisico implements Calculavel{

    private String nome;
    double desconto = 0.2;
    private int quantidade;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    private double descontarFinal(double preco, int quantidade){
        double valor;
        valor = (preco * quantidade) * desconto;
        return valor;
    }

    @Override
    public double calcularPrecoFinal() {
        double valorFinal = (preco * quantidade) - descontarFinal(preco, quantidade);
        return valorFinal;
    }
}
