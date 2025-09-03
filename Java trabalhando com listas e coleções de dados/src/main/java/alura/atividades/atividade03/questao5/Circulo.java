package alura.atividades.atividade03.questao5;

public class Circulo implements Forma{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double area = 3.14 * (raio * raio);
        return area;
    }
}
