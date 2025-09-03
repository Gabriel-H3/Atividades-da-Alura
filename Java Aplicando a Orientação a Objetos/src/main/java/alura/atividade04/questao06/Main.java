package alura.atividade04.questao06;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto();
        Servico servico = new Servico();


        produto.setNome("Mamadeira");
        produto.setPreco(100);
        System.out.println(produto.precoTotal(1));
        System.out.println(produto.aplicarDesconto(2));

        System.out.println("\n");

        servico.setNome("Bater laje");
        servico.setPreco(100);
        //System.out.println(servico.precoTotal(1));
        System.out.println(servico.aplicarDesconto(5));


    }
}
