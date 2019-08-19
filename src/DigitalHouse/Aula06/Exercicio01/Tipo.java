package DigitalHouse.Aula06.Exercicio01;

public abstract class Tipo {
    private String nome;
    private String tipo;

    //construtor
    public Tipo(String novoNome, String novoTipo) {
        nome = novoNome;
        tipo = novoTipo;

    }

    //gets & setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

