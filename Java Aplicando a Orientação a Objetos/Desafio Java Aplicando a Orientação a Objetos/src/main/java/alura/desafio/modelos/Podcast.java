package alura.desafio.modelos;

import alura.desafio.metodosgerais.Avaliacao;

public class Podcast extends Audio implements Avaliacao {
    private Perfil apresentador;
    private int curtida;
    private boolean completouEpisodio = false;

    public void curtir(){
        curtida++;
    }

    public void setApresentador(Perfil apresentador) {
        this.apresentador = apresentador;
    }

    public void telaInf(){
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Apresentador: " + apresentador.getNome());
        System.out.println("Categoria:" + getCategoria());
        System.out.println("Curtidas: " + curtida);
        System.out.println("Finalizado: " + completouEpisodio);
    }

    public void terminarOuvir(){
        completouEpisodio  = true;
    }

    @Override
    public boolean positivaOunao() {
        if (curtida >= 3){
            return true;
        } else {
            return false;
        }

    }
}
