package DigitalHouse.Aula06.Exercicio01;

public class Foto extends Tipo implements Imprimivel {


    public Foto(String novoNome, String novoTipo) {
        super(novoNome, novoTipo);
    }

    @Override
    public void imprimivel() {
        System.out.println("Uma foto de  " + getNome() + " com  qualidade " + getTipo());

    }
}

