package DigitalHouse.Aula08.Exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Lucas", 12);
        Aluno a2 = new Aluno("Lucas", 11);
        Aluno a3 = new Aluno("Lucas", 13);
        Aluno a4 = new Aluno("Lucas", 13);


        List<Aluno> listaDeAlunos = new ArrayList<>();

        listaDeAlunos.add(a1);
        listaDeAlunos.add(a2);
        listaDeAlunos.add(a3);

        //System.out.println(a1.equals(a2));
        System.out.println(listaDeAlunos.contains(a4));

    }
}
