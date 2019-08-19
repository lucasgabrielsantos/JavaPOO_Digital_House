package DigitalHouse.Aula06.Exercicio01;

import java.util.ArrayList;
import java.util.List;


public class Impressora {


    public List<Tipo> listaTipo = new ArrayList<>();



    public void imprimirTudo() {


        for (int i = 0; i < listaTipo.size(); i++) {
            System.out.println(listaTipo.get(i).toString());

        }
    }

    public void adicionarImprimivel(Imprimivel umImprimivel) {
        listaTipo.add((Tipo) umImprimivel);

    }
}

