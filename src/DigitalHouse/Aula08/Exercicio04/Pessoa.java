package DigitalHouse.Aula08.Exercicio04;

public class Pessoa {
    private String nome;
    private Integer RG;

    public String getNome() {
        return nome;
    }

    public Integer getRG() {
        return RG;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRG(Integer RG) {
        this.RG = RG;
    }

    public Pessoa(String novoNome, Integer novoRG) {
        this.nome = novoNome;
        this.RG = novoRG;
    }

    @Override
    public boolean equals(Object Pessoa1) {
        if (this.RG == ((Pessoa) Pessoa1).getRG()) {
            return true;
        } else {
            return false;
        }
    }
}
