package alura.atividade03.questao1;

public class Carro {
    private String modelo;
    private double preco1;
    private double preco2;
    private double preco3;

    public void setModelo (String modelo){
        this.modelo = modelo;
    }

    public void setPrecos(double preco1, double preco2, double preco3){
        this.preco1 = preco1;
        this.preco2 = preco2;
        this.preco3 = preco3;
    }

    public double menorPreco(){
        double menor = preco1;

        if (preco2 < menor){
            menor = preco2;
        } else if (preco3 < menor){
            menor = preco3;
        }

        return menor;
    }

    public double maiorPreco(){
        double maior = preco1;

        if (preco2 > maior){
            maior = preco2;
        } else if (preco3 > maior){
            maior = preco3;
        }

        return maior;
    }

    public void exibirInfo(){
        System.out.println("Nome do modelo: " + modelo);
        System.out.println("Preço no primeiro ano: " + preco1);
        System.out.println("Preço no segundo ano: " + preco2);
        System.out.println("Preço no terceiro ano: " + preco3);
        System.out.println("Menor preço: " + menorPreco());
        System.out.println("Maior preço: " + maiorPreco());
    }
}
