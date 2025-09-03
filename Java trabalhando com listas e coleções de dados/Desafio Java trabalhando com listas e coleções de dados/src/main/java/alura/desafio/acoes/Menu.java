package alura.desafio.acoes;

import alura.desafio.modelos.Cartao;
import alura.desafio.modelos.Produto;

import java.util.*;

public class Menu {
    private String tela = """
                Digite uma operação: 
                1 - Consultar saldo
                2 - Adicionar saldo
                3 - Comprar Leites
                4 - Comprar Carnes
                5 - Comprar Higienicos
                6 - Sair
                """;
    Produto leite = new Produto("Nestlé", 15.90);
    Produto outroLeite = new Produto("Piracanjuba", 16.50);
    Produto carneBovina = new Produto("Picanha", 60);
    Produto carneFrango = new Produto("Asinha", 21.90);
    Produto sabonete = new Produto("Dove", 39.98);
    Produto papelHigienico = new Produto("Neve", 37.39);
    Cartao cartao = new Cartao(1000);
    List<Produto> catalogoCarnes = new ArrayList<>();
    List<Produto> catalogoLeites = new ArrayList<>();
    List<Produto> produtosComprados = new ArrayList<>();
    List<Produto> catalogoHigiene = new ArrayList<>();

    public Menu(){
        this.catalogoHigiene.add(sabonete);
        this.catalogoHigiene.add(papelHigienico);

        this.catalogoCarnes.add(carneBovina);
        this.catalogoCarnes.add(carneFrango);

        this.catalogoLeites.add(leite);
        this.catalogoLeites.add(outroLeite);
    }

    public List<Produto> getCatalogoHigiene() {
        return catalogoHigiene;
    }

    public List<Produto> getCatalogoCarnes() {
        return catalogoCarnes;
    }

    public List<Produto> getCatalogoLeites() {
        return catalogoLeites;
    }

    public void trazerMenu(){
        System.out.println(tela);
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo atual: " + cartao.getSaldo());
    }

    public void adicionarSaldo(){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor para adicionar: ");
        double saldo = ler.nextDouble();
        cartao.adicionarSaldo(saldo);
        System.out.println("Seu novo saldo: " + cartao.getSaldo());
    }

    public void consultarLeites(){
        System.out.println("Leites disponiveis: ");
        List<Produto> catalogoLeites = getCatalogoLeites();
        int codigo = 0;
        for (Produto produto : catalogoLeites){
            System.out.println("Código: " + codigo  + " | " + produto);
            codigo =+ 1;
        }
    }

    public void comprarLeites(){
        Scanner ler = new Scanner(System.in);
        List<Produto> catalogoLeites = getCatalogoLeites();
        int codigo;

        System.out.print("Digite o número do leite que deseja comprar: ");
        codigo = ler.nextInt();

        System.out.println("Comprando " + catalogoLeites.get(codigo).getNome());
        this.produtosComprados.add(catalogoLeites.get(codigo));

        cartao.comprar(catalogoLeites.get(codigo).getPreco());

        consultarSaldo();

    }

    public void consultarCarnes(){
        System.out.println("Carnes disponiveis: ");
        List<Produto> catalogoCarnes = getCatalogoCarnes();
        int codigo = 0;
        for (Produto produto : catalogoCarnes){
            System.out.println("Código: " + codigo  + " | " + produto);
            codigo =+ 1;
        }
    }

    public void comprarCarnes(){
        Scanner ler = new Scanner(System.in);
        List<Produto> catalogoCarnes = getCatalogoCarnes();
        int codigo;

        System.out.print("Digite o número da carne que deseja comprar: ");
        codigo = ler.nextInt();

        System.out.println("Comprando " + catalogoCarnes.get(codigo).getNome());
        this.produtosComprados.add(catalogoCarnes.get(codigo));

        cartao.comprar(catalogoCarnes.get(codigo).getPreco());
        consultarSaldo();

    }

    public void consultarHigiene(){
        System.out.println("Produtos de higiene disponiveis: ");
        List<Produto> catalogoHigiene = getCatalogoHigiene();
        int codigo = 0;
        for (Produto produto : catalogoHigiene){
            System.out.println("Código: " + codigo  + " | " + produto);
            codigo =+ 1;
        }
    }

    public void comprarHigiene(){
        Scanner ler = new Scanner(System.in);
        List<Produto> catalogoHigiene = getCatalogoHigiene();
        int codigo;

        System.out.print("Digite do produto higienico que deseja comprar: ");
        codigo = ler.nextInt();

        System.out.println("Comprando " + catalogoHigiene.get(codigo).getNome());
        this.produtosComprados.add(catalogoHigiene.get(codigo));

        cartao.comprar(catalogoHigiene.get(codigo).getPreco());
        consultarSaldo();

    }

    public void listagemCompras(){
        System.out.println("\n");
        System.out.println("PRODUTOS COMPRADOS: ");
        Collections.sort(this.produtosComprados);
        for (Produto produto : this.produtosComprados){
            System.out.println(produto);
        }
        System.out.println("TOTAL: " + cartao.getGasto());
    }



}
