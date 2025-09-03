package alura.atividade02;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade(){
        if(idade < 18){
            System.out.println("%s é menor de idade!".formatted(nome));
        } else{
            System.out.println("%s é maior de idade!".formatted(nome));
        }
    }
}
