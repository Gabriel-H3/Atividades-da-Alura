package alura.atividades.atividade04.questao03;

public class Titulo implements Comparable<Titulo>{
    private String nome;

    public Titulo(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return getNome();
    }

    @Override
    public int compareTo(Titulo titulo) {
        return getNome().compareTo(titulo.getNome());
    }
}
