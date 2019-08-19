package DigitalHouse.Aula07.Listas;

import java.util.HashSet;
import java.util.Set;

public class HashSets {

    public static void main(String[] args) {

        Set<String> conjunto = new HashSet<>();

        conjunto.add("Lucas");
        conjunto.add("Gabriel");
        conjunto.add("Dos");
        conjunto.add("Santos");
        conjunto.add("aaaaaaaaaaaaaaaaaaaaaa");

        //conjunto.remove("Dos");

        for (String valor : conjunto) {
            System.out.println(valor);
        }
    }
}


