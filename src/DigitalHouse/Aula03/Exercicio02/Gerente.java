package DigitalHouse.Aula03.Exercicio02;


public class Gerente extends Funcionario {
    public String area;


    public void calculaImposto() {
        this.salario = this.salario * 0.95;

    }

    @Override
    public void imprimeDados(Pessoa cara) {
        super.imprimeDados(cara);
    }
}

