package alura.atividade04.questao02;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    @Override
    public double calcularArea(double altura, double largura) {
        double areaRetangulo;
        areaRetangulo = altura * largura;
        return areaRetangulo;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        double perimetroRetangulo;
        perimetroRetangulo = 2 * (altura + largura);
        return perimetroRetangulo;
    }
}
