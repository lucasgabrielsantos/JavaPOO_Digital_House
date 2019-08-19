package DigitalHouse.Aula08.Exercicio02;

public class Coca {

    private Integer tamanho;
    private double preco;

    public double getPreco() {
        return preco;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public Coca(Integer novoTamanho, double novoPreco) {

        this.preco = novoPreco;
        this.tamanho = novoTamanho;

    }

    @Override
    public boolean equals(Object c1) {
        if (this.tamanho == ((Coca) c1).getTamanho()) {
            return true;
        } else {
            return false;
        }
    }
}
