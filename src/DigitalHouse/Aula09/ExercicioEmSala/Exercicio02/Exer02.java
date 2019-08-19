package DigitalHouse.Aula09.ExercicioEmSala.Exercicio02;

import java.util.List;

public class Exer02 {
    public static void main(String[] args) {

        try {
            List<String> lista2 = null;

//            lista2.add("");
//            lista2.add("");
//            lista2.add("");

            System.out.println(lista2.get(5));
        } catch (NullPointerException teste) {
            System.out.println("Ocorreu um erro grave " + teste.getMessage());
            teste.printStackTrace();


        } catch (IndexOutOfBoundsException teste2) {
            System.out.println(" Controlando a exceção " + teste2.getMessage());
            teste2.printStackTrace();
        }
    }
}

