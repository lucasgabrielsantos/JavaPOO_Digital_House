package DigitalHouse.Aula03.Exercicio02;


public abstract class Pessoa {
    public String nome;
    public String nascimento;

    public abstract void imprimeDados(Pessoa cara);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
}

