package alura.atividades.atividade03.questao01;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Pedro");
        nomes.add("Victor");
        nomes.add("Oberon");

       nomes.forEach(nome -> System.out.println(nome));

       for(String nome: nomes){
           System.out.println(nome);
       }
    }
}
