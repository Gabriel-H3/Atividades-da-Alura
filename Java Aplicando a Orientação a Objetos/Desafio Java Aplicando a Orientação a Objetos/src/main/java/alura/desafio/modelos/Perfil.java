package alura.desafio.modelos;

import alura.desafio.metodosgerais.Avaliacao;

public class Perfil implements Avaliacao {
    private String nome;
    private double avaliacao;
    private Audio obra;
    private int avaliacaoqtd;

    public void telaInfo(){
        System.out.println("Nickname: " + nome);
        System.out.println("Estrelas: " + (int) avaliacao);
        System.out.println("Principal obra: " + obra.getTitulo());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAvaliacao(double avaliacao) {
        avaliacao = avaliacao/2;
        avaliacaoqtd++;
        this.avaliacao = avaliacao/avaliacaoqtd;
    }

    public Audio getObra() {
        return obra;
    }

    public void setObra(Audio obra) {
        this.obra = obra;
    }

    @Override
    public boolean positivaOunao() {
        if (avaliacao >= 4){
            return true;
        } else {
            return false;
        }
    }
}
