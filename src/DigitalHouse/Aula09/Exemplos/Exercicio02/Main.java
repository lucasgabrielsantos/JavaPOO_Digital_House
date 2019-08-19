package DigitalHouse.Aula09.Exemplos.Exercicio02;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try {
            ArrayList<String> lista = new ArrayList<>();

            lista.add("Lucas");
            lista.add("Gabriel");
            lista.add("Santos");

            System.out.println(lista.get(3));
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro" + ex.getMessage());
            //e.printStackTrace();
        }
    }
}

