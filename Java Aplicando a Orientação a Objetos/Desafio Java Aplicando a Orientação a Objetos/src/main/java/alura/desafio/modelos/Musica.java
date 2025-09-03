package alura.desafio.modelos;

import alura.desafio.metodosgerais.Avaliacao;

public class Musica extends Audio implements Avaliacao {
    private String letra;
    private Perfil cantor;

    public void repetirAutomatico(){
        reproduzir();
    }

    public void telaInfo(){
        System.out.println("Título: " + getTitulo());
        System.out.println("Cantor: " + cantor.getNome());
        System.out.println("Duração: " + getDuracaoMinutos());
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public void setCantor(Perfil cantor) {
        this.cantor = cantor;
    }

    @Override
    public boolean positivaOunao() {
        if (getTotalReproducao() >= 5){
            return true;
        } else {
            return false;
        }
    }
}
