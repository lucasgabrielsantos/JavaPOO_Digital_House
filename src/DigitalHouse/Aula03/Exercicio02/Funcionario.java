package DigitalHouse.Aula03.Exercicio02;

public class Funcionario extends Pessoa {

    public double salario;


    public void calculaImposto() {

        this.salario = this.salario * 0.97;

    }

    @Override
    public void imprimeDados(Pessoa cara) {

    }
}

