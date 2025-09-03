package alura.atividades.atividade02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Neymar de pelucia", 100.90, 90) ;
        var outroProduto = new Produto("Lego", 5000, 1 );
        var maisProduto = new Produto("Pista hotwheels", 200, 20);
        var produtoPericivel = new ProdutoPericivel("Leite", 14.50, 3, 2026);


        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto);
        produtos.add(outroProduto);
        produtos.add(maisProduto);
        produtos.add(produtoPericivel);
        System.out.println("Tamanho: " + produtos.size());
        System.out.println("Produto: " + produtos.get(0).getNome());

        System.out.println("Lista de produtos:");
        for (Object objeto: produtos) {
            System.out.println(objeto);
        }

    }
}
