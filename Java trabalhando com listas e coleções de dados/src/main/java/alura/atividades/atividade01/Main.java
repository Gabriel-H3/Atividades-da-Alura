package alura.atividades.atividade01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        var pessoa2 = new Pessoa();
        var pessoa3 = new Pessoa();

        pessoa.setNome("João");
        pessoa.setIdade(21);

        pessoa2.setNome("Dom pedro");
        pessoa2.setIdade(300);

        pessoa3.setNome("Neymar Jr.");
        pessoa3.setIdade(50);

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        System.out.println("Quantidade de pessoas: " + pessoas.size());
        System.out.println(pessoas);
        System.out.println("Primeira pessoa: " + pessoas.get(0).getNome());
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println(pessoas.get(i).getNome());
        }
        System.out.println("Lista de Pessoas:");
        for (Object objeto : pessoas) {
            System.out.println(objeto);
        }
    }
}
