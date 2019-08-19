package DigitalHouse.Aula01.Exercicio02;


import java.util.ArrayList;

public class Operadores4 {

    public static void main(String[] args) {

        ArrayList<Integer> pares = new ArrayList<Integer>();

        for (int i = 0; i <= 100; i += 2) {
            pares.add(i);
        }
        System.out.println("Pares: " + pares);
    }
}
