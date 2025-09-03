package alura.atividade03.questao2;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        gato.emitirSom();
        gato.arranharMoveis();
        System.out.println("\n");
        cachorro.emitirSom();
        cachorro.abanarRabo();
    }
}
