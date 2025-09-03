package alura.desafio.metodosgerais;

public class RecomendarTela {
    public void telaPrincipal(Avaliacao avaliacao){
        if (avaliacao.positivaOunao() == true){
            System.out.println("Está voando entre os usuários");
        } else {
            System.out.println("Talvez você deva dar uma chance!");
        }
    }
}
