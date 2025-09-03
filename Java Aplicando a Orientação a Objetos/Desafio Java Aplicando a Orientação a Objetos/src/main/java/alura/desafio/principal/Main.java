package alura.desafio.principal;

import alura.desafio.metodosgerais.RecomendarTela;
import alura.desafio.modelos.Musica;
import alura.desafio.modelos.Perfil;
import alura.desafio.modelos.Podcast;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Podcast podcast = new Podcast();
        Perfil apresentador = new Perfil();
        Perfil cantor = new Perfil();
        Musica musica = new Musica();
        RecomendarTela recomendarTela = new RecomendarTela();

        apresentador.setNome("Fish ball cast");
        apresentador.setObra(podcast);
        apresentador.setAvaliacao(2);


        cantor.setNome("Yun li");
        cantor.setObra(musica);
        cantor.setAvaliacao(10);

        podcast.setTitulo("Fish Ball Cast #000 (piloto)");
        podcast.setDuracaoMinutos(120);
        podcast.setCategoria("História e aprendizado");
        podcast.setApresentador(apresentador);
        podcast.reproduzir();
        podcast.pausar();
        podcast.reproduzir();
        podcast.curtir();
        podcast.curtir();
        podcast.curtir();
        podcast.terminarOuvir();

        musica.setTitulo("Joias da Familia");
        musica.setCategoria("Hip hop");
        musica.setCantor(cantor);
        musica.setDuracaoMinutos(4);
        musica.setLetra("Depressaooooo");
        musica.reproduzir();
        musica.repetirAutomatico();
        musica.repetirAutomatico();
        musica.reproduzir();
        musica.repetirAutomatico();

        System.out.println("\n");
        musica.telaInfo();
        recomendarTela.telaPrincipal(musica);

        System.out.println("\n");
        podcast.telaInf();
        recomendarTela.telaPrincipal(podcast);

        System.out.println("\n");

        apresentador.telaInfo();
        recomendarTela.telaPrincipal(apresentador);

        System.out.println("\n");
        cantor.telaInfo();
        recomendarTela.telaPrincipal(cantor);
    }
}