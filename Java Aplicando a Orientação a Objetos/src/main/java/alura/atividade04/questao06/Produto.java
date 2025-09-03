package alura.atividade04.questao06;

public class Produto implements Vendavel{

    private String nome;
    private double preco;
    private double taxa = 0.4;
    private double desconto = 0.1;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    private double taxar(double preco){
        this.preco = preco * taxa;
        return this.preco;
    }

    private double descontar() {
        double valorDesconto = preco * desconto;
        return valorDesconto;
    }

    @Override
    public double precoTotal(int quantidade) {
        preco = (preco + taxar(preco)) * quantidade;
        return this.preco;
    }

    @Override
    public double aplicarDesconto(int quantidade) {
        preco = (preco * quantidade)- descontar();
        return preco;
    }


}
