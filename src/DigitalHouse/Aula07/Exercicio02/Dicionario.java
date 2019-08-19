package DigitalHouse.Aula07.Exercicio02;

import java.util.ArrayList;
import java.util.List;


public class Dicionario {

    public static void main(String[] args) {

        List<Integer> dicionario = new ArrayList<>();

        dicionario.add(0);
        dicionario.add(1);
        dicionario.add(5);
        dicionario.add(5);
        dicionario.add(6);
        dicionario.add(7);
        dicionario.add(8);
        dicionario.add(8);
        dicionario.add(8);

        for (Integer percorre : dicionario) ;
        System.out.println("Numeros da Lista: " + dicionario);
    }
}

