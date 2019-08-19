package DigitalHouse.Aula05.Exercicio01;

public class Cachorro extends Animal implements Saudavel {

    public Cachorro(String novaRaca) {
        super(novaRaca);
    }

    @Override
    public boolean animalSaudavel(String diagnostico) {
        if (diagnostico != null && diagnostico != "") {
            System.out.println("O cachorro " + getRaca() + " " + "não está doente: " + diagnostico);
            return true;
        } else {
            System.out.println("Não possui diagnostico");
            return false;
        }
    }

    @Override
    public int calculoIdadeAnimal(int novaIdade) {
        System.out.println("Somando as idades!");
        return getIdade() + novaIdade;
    }

    @Override
    public void seDivertir() {

    }
}
