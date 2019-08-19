package DigitalHouse.Aula06.Exercicio01;

public class Contrato extends Tipo implements Imprimivel {


    public Contrato(String novoNome, String novoTipo) {
        super(novoNome, novoTipo);
    }


    @Override
    public void imprimivel() {

        System.out.println("Sou um contrato legal " + super.getNome() + super.getTipo());

    }

    @Override
    public String toString() {
        return "Contrato\n" +
                "nome: " + super.getNome() +
                "\nTipo: " + super.getTipo();
    }
}

