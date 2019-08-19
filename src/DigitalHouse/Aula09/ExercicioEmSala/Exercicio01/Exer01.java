package DigitalHouse.Aula09.ExercicioEmSala.Exercicio01;


import java.util.ArrayList;
import java.util.List;

public class Exer01 {

    public static void main(String[] args) {
        try {
            List<String> lista = new ArrayList<>();

            lista.add("Pato");
            lista.add("Cachorro");
            lista.add("Gato");
            //lista.add("Ave");
            ;
            System.out.println(lista.get(3));

        } catch (Exception teste) {
            System.out.println("Ocorreu um erro " + teste.getMessage());
            teste.printStackTrace();
        }
    }
}

