package alura.atividade04.questao06;

public class Servico implements Vendavel{
    private String nome;
    private int quantidade;
    private double preco;
    private double desconto = 0;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    private double descontar() {
        double valorDesconto;
        if (quantidade >= 3 && quantidade < 5){
            desconto = 0.2;
            valorDesconto = preco * desconto;
            return valorDesconto;
        } else if (quantidade >= 5){
            desconto= 0.4;
            valorDesconto = preco * desconto;
            return valorDesconto;
        } else {
            desconto = 0.1;
            valorDesconto = preco * desconto;
            return valorDesconto;
        }
    }


    @Override
    public double precoTotal(int quantidade) {
        preco = preco * quantidade;
        return this.preco;
    }

    @Override
    public double aplicarDesconto(int quantidade) {
        this.quantidade = quantidade;
        double desconto = descontar();
        preco = (preco - desconto) * quantidade;
        return preco;
    }
}
