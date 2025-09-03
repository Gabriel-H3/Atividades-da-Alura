package alura.atividades.atividade03.questao5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(15);
        Circulo circulo = new Circulo(14);
        Quadrado novoQuadrado = new Quadrado(13);
        Circulo novoCirculo = new Circulo(3.4);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(quadrado);
        formas.add(circulo);
        formas.add(novoQuadrado);
        formas.add(novoCirculo);

        for (Forma forma: formas){
            System.out.println(forma.calcularArea());
        }
    }
}
