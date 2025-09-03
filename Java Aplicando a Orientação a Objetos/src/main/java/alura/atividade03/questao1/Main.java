package alura.atividade03.questao1;

public class Main {
    public static void main(String[] args) {
        Uno uno = new Uno();

        uno.setCor("Azul");
        uno.setModelo("Civic");
        uno.setPrecos(15000, 15000, 13000);
        uno.exibirInfo();
        System.out.println("Cor: " + uno.getCor());
    }
}
