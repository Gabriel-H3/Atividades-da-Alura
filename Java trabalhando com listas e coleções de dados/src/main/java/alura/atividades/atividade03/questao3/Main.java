package alura.atividades.atividade03.questao3;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cachorro();

        if (animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
            System.out.println("É cachorro");
        } else {
            System.out.println("Não é cachorro...");
        }
    }
}
