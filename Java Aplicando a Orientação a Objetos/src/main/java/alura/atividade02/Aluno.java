package alura.atividade02;

public class Aluno {
    private String nome;
    private double notas;
    private int quantidadeNotas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas += notas;
        quantidadeNotas++;
    }

    public double calcularMedia(){
        double media = notas / quantidadeNotas;
        return media;
    }
}
