package DigitalHouse.Aula01.Exercicio02;

public class Operadores {

    public static void main(String[] args) {

        int A = 10;
        int B = 20;
        int C = 1;

        if( A > B && A > C ){
            System.out.println(A);
        }
        if( B > A && B > C ){
            System.out.println(B);
        }
        if ( C > A && C > B ){

            System.out.println(C);
        }

    }
}
