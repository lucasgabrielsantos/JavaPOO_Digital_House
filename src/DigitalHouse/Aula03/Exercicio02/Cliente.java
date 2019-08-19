package DigitalHouse.Aula03.Exercicio02;

public class Cliente extends Pessoa {
    public int codigo;


    public Cliente(String nome, String nascimento, int codigo) {

        this.nome = nome;
        this.nascimento = nascimento;
        this.codigo = codigo;
    }

    @Override
    public void imprimeDados(Pessoa cara) {
        System.out.println(cara.nome);
        System.out.println(cara.nascimento);
        System.out.println(codigo);
    }
}

