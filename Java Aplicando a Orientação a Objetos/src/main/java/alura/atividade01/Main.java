package alura.atividade01;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Calculadora calc = new Calculadora();
        Musica musica = new Musica();
        Carro carro = new Carro();
        Aluno aluno = new Aluno();

        musica.titulo = "Barbie Girl";
        musica.artista = "Aqua";
        musica.anoLancamento = 1997;

        carro.modelo = "picape";
        carro.ano = 1890;
        carro.cor = "preto";

        aluno.nome = "Joaozinho";
        aluno.idade = 17;


        pessoa.cumprimentar();
        System.out.printf("\n");

        System.out.println(calc.dobrar(6));
        System.out.printf("\n");

        musica.avaliarMusica(8);
        musica.avaliarMusica(10);
        musica.avaliarMusica(9);
        musica.calcularMediaNota();
        musica.exibirFichea();
        System.out.printf("\n");

        carro.exibirFicha();
        System.out.println("Idade do carro: " + carro.calcularIdade());
        System.out.printf("\n");

        aluno.exibirInfo();

    }
}