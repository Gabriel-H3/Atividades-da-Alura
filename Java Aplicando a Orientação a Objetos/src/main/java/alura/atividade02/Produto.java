package alura.atividade02;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(double desconto){
        double precoInicial = preco;
        desconto = desconto/100;
        double precoFinal = precoInicial * desconto;
        precoFinal = precoInicial - precoFinal;
        return precoFinal;
    }
}
