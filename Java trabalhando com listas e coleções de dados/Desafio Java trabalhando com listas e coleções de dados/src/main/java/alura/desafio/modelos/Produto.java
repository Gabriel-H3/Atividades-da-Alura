package alura.desafio.modelos;

public class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Produto produto) {
        if (this.preco > produto.getPreco()) {
            return -1;
        } else if (this.preco < produto.getPreco()) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Nome do produto: " + getNome() + " | Preço: " + getPreco();
    }
}
