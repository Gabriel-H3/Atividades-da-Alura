package alura.atividade04.questao01;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public double converterDolarReal(double dolar) {
        double valorDolar = 5.67;
        double real = dolar * valorDolar;
        return real;
    }

}
