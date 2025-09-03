package alura.atividades.atividade04.questao04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>();
        List<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        arraylist.add(6);

        System.out.println(linkedlist);
        System.out.println(arraylist);
    }
}
