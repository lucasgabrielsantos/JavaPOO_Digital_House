package DigitalHouse.Aula05.Exercicio01;

public class Main {

    public static void main(String[] args) {

        Cachorro Marley = new Cachorro("Golden");
        Marley.animalSaudavel("Deu bom");

        int idadeAnimal = Marley.calculoIdadeAnimal(50);
        Marley.setIdade(15);
        System.out.println("A idade é de: " + idadeAnimal);
    }

}

