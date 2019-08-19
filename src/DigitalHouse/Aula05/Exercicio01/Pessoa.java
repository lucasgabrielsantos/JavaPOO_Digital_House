package DigitalHouse.Aula05.Exercicio01;


public class Pessoa implements Saudavel, Brincavel {

    @Override
    public void seDivertir() {

    }

    @Override
    public boolean animalSaudavel(String diagnostico) {
        return false;
    }

    @Override
    public int calculoIdadeAnimal(int idade) {
        return 0;
    }
}
