package DigitalHouse.Aula09.ExercicioEmSala.Exercicio03;

public class Main {

    public static void main(String[] args) {

        CalculoMatematico calc = new CalculoMatematico();
        try {
            calc.Divisao(4, 0);
        } catch (ArithmeticException ex) {
            System.out.println("Zero erro");
            System.out.println(ex.getMessage());
        }
    }
}

