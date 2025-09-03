package alura.atividades.atividade03.questao4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto cereal = new Produto("Sucrilhos", 50.19);
        Produto iogurte = new Produto("Danone", 17.99);
        Produto cremeDental = new Produto("Colgate", 24.76);
        double media = 0;

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(cereal);
        produtos.add(iogurte);
        produtos.add(cremeDental);

        int tamanho = produtos.size();

        for (int i = 0; i < produtos.size(); i++) {
            double preco = produtos.get(i).getPreco();
            media = (media + preco);
        }
        System.out.println("Média: " + media / tamanho);

    }
}
