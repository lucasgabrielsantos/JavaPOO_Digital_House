package DigitalHouse.Aula01.Exercicio01;

public class Pessoa {
    private String nomePessoa;

    public Pessoa(String novoNome) {
        nomePessoa = novoNome;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomeNome) {
        this.nomePessoa = nomeNome;
    }
}