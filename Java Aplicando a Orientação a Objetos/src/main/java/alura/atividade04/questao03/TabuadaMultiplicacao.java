package alura.atividade04.questao03;

public class TabuadaMultiplicacao implements Tabuada{

    private int resultado;

    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i < 11; i++) {
            resultado = numero * i;
            System.out.println("%d X %d = %d".formatted(numero, i, resultado));
        }
    }
}
