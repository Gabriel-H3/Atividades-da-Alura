package alura.atividade01;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numeroAvaliacao;
    double notas;

    void exibirFichea(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Nota de Avaliação: " + avaliacao);
    }

    double avaliarMusica(double nota){
        notas += nota;
        numeroAvaliacao++;
        return notas;
    }

    double calcularMediaNota(){
        avaliacao = notas / numeroAvaliacao;
        return avaliacao;
    }
}
