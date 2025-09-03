package alura.desafio.modelos;

public class Cartao {
    private double saldo;
    private double gasto;

    public Cartao(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getGasto(){
        return this.gasto;
    }

    public double adicionarSaldo(double saldo){
        return this.saldo = getSaldo() + saldo;
    }

    public void comprar(double preco){
        if (preco > getSaldo()){
            System.out.println("Não é possível realizar esta compra!");
        } else {
            this.saldo = getSaldo() - preco;
            this.gasto = getGasto() + preco;
        }
    }
}
