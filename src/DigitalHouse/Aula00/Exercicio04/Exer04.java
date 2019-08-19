package DigitalHouse.Aula00.Exercicio04;


import java.util.ArrayList;

public class Exer04 {

    public static void main(String[] args) {

        ArrayList<Integer> pares = new ArrayList<Integer>();

        for (int i = 0; i <= 100; i += 2) {
            pares.add(i);
        }
        System.out.println("Pares: " + pares);
    }
}
