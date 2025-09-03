package alura.desafio.modelos;

public class Audio {
    private String titulo;
    private int duracaoMinutos;
    private int totalReproducao;
    private String categoria;

    public void reproduzir(){
        System.out.println("Você está ouvindo " + this.titulo);
        this.totalReproducao++;
    }

    public void pausar(){
        System.out.println("Você pausou " + this.titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
