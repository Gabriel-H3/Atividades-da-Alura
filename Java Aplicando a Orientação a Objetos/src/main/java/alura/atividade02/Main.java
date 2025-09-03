package alura.atividade02;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        IdadePessoa idadePessoa = new IdadePessoa();
        Produto produto = new Produto();
        Aluno aluno = new Aluno();
        Livro livro = new Livro();

        conta.setSaldo(150000);
        conta.setNumeroConta(1409);
        conta.titular = "João Maldade";

        idadePessoa.setIdade(16);
        idadePessoa.setNome("Giorno Giovanna");

        produto.setNome("Brinquedo Peppa Pig");
        produto.setPreco(178.90);

        aluno.setNome("Pedrinho da Silva");
        aluno.setNotas(10);
        aluno.setNotas(5);
        aluno.setNotas(7);

        livro.setTitulo("Assassinato no Expresso do Oriente");
        livro.setAutor("Agatha Christie");

        System.out.println("Titular: " + conta.titular);
        System.out.println("Número da conta: " +  conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo() + "\n");

        System.out.println("Nome: " + idadePessoa.getNome());
        System.out.println("Idade: " + idadePessoa.getIdade());
        idadePessoa.verificarIdade();
        System.out.printf("\n");

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getPreco());
        System.out.println("Valor com desconto: " + produto.aplicarDesconto(50) + "\n");

        System.out.println("A média do aluno %s foi: %.2f \n".formatted(aluno.getNome(), aluno.calcularMedia()));

        livro.exibirDetalhes();

    }
}
