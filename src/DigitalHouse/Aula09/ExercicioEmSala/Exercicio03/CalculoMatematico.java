package DigitalHouse.Aula09.ExercicioEmSala.Exercicio03;

public class CalculoMatematico {

    public int Divisao(int divisor, int numero2) throws ArithmeticException {
        int Divisao = 0;

        if (divisor == 0) {
            throw new ArithmeticException("Estou lancando um ArithmeticException");
        } else {
            Divisao = divisor / numero2;
        }
        return Divisao;
    }
}
