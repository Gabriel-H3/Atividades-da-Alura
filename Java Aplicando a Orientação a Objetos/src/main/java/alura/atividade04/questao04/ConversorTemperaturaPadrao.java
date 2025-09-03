package alura.atividade04.questao04;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public double celsiusFahrenheit(double celsius) {
        double fahrenheit;
        fahrenheit = (celsius * 1.8) +32;
        return fahrenheit;
    }

    @Override
    public double fahrenheitCelsius(double fahrenheit) {
        double celsius;
        celsius = (fahrenheit - 32) / 1.8;
        return celsius;
    }
}
