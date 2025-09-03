package alura.atividade04.questao05;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro();
        ProdutoFisico produto = new ProdutoFisico();

        livro.setNome("Alice no País das Maravilhas");
        livro.setQuantidade(2);
        livro.setPreco(100);
        System.out.println(livro.calcularPrecoFinal());

        produto.setNome("Caneta");
        produto.setPreco(5);
        produto.setQuantidade(3);
        System.out.println(produto.calcularPrecoFinal());

    }
}
