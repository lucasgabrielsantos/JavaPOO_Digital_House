package DigitalHouse.Aula03.Exercicio01;

public class Main {
    public static void main(String[] args) {

        Crianca bebe = new Crianca("Lucas", "Masculino");
        System.out.println(bebe.getNome() + "\n" + bebe.getSexo());
        bebe.Estudar(false);
        System.out.println("-------------------------------");


    }
}

