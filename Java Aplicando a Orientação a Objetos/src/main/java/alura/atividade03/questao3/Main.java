package alura.atividade03.questao3;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

       contaCorrente.depositarSaldo(200);
       contaCorrente.consultarSaldo();
       contaCorrente.sacarSaldo(3000);
       contaCorrente.sacarSaldo(100);
       contaCorrente.cobrarTarifa();
       contaCorrente.consultarSaldo();

    }
}
