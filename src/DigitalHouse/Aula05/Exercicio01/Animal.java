package DigitalHouse.Aula05.Exercicio01;


public abstract class Animal implements Brincavel {

    private String raca;
    private int idade;
    private String cor;

    public Animal(String novaRaca) {
        this.raca = novaRaca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String novaRaca) {
        this.raca = novaRaca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String novaCor) {
        this.cor = novaCor;
    }

}
