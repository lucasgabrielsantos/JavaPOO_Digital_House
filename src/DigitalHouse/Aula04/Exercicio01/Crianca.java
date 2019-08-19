package DigitalHouse.Aula04.Exercicio01;


public class Crianca extends Pessoa {


    public Crianca(String novoNome, String novoSexo) {
        super(novoNome, novoSexo);

    }

    @Override
    public void respirar(String nome) {
        System.out.println("A Pessoa está respirando " + nome);
    }

    @Override
    public boolean Estudar(boolean status) {
        return super.Estudar(status);

    }
}