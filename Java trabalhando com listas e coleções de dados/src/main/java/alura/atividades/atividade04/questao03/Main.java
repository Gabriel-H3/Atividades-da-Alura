package alura.atividades.atividade04.questao03;

import alura.atividades.atividade04.questao02.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        alura.atividades.atividade04.questao02.Titulo transformers = new alura.atividades.atividade04.questao02.Titulo("Transformers One");
        alura.atividades.atividade04.questao02.Titulo jojo = new alura.atividades.atividade04.questao02.Titulo("JoJo:  Diamond is Unbreakable");
        alura.atividades.atividade04.questao02.Titulo lol = new alura.atividades.atividade04.questao02.Titulo("Arcane");

        List<Titulo> titulos = new ArrayList<>();
        titulos.add(transformers);
        titulos.add(jojo);
        titulos.add(lol);

        Collections.sort(titulos);

        System.out.println(titulos);

    }
}
