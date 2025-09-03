package alura.atividade03.questao4;

public class Main {
    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        GeradorPrimo gerador = new GeradorPrimo();
        NumerosPrimos numerosPrimos = new NumerosPrimos();

        verificador.verificarSeEhPrimo(19);
        System.out.println("\n");

        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 19 é: " + proximoPrimo + "\n");


        numerosPrimos.listarPrimos(30);
    }
}
