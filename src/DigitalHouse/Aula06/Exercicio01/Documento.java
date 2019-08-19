package DigitalHouse.Aula06.Exercicio01;

public class Documento extends Tipo implements Imprimivel {

    public Documento(String novoNome, String novoTipo) {
        super(novoNome, novoTipo);
    }

    @Override
    public void imprimivel() {

        System.out.println("Sou um documento Word " + getNome() + getTipo());
    }
}
