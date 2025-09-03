package alura.atividades.atividade02;

public class ProdutoPericivel extends Produto{

    private int dataValidade;

    public ProdutoPericivel(String nome, double preco, int quantidade, int dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public int getDataValidade() {
        return dataValidade;
    }
}
