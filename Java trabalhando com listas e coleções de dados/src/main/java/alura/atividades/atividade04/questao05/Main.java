package alura.atividades.atividade04.questao05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> listaPolimofismo = new ArrayList<>();
        listaPolimofismo.add(4);
        listaPolimofismo.add(5);
        listaPolimofismo.add(6);

        System.out.println(listaPolimofismo);

        listaPolimofismo = new LinkedList<>();
        listaPolimofismo.add(1);
        listaPolimofismo.add(2);
        listaPolimofismo.add(3);

        System.out.println(listaPolimofismo);

    }
}
