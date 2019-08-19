package DigitalHouse.Aula07.Listas;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {

        List<String> Pessoa = new java.util.ArrayList<>();

        Pessoa.add("Lucas");
        Pessoa.add("Gabriel");
        Pessoa.add("dos");
        Pessoa.add("Santos");

        //Pessoa.remove("dos");

        for (String percorre : Pessoa) {
            //System.out.println("Lista: " + percorre);

        }
        //System.out.println(Pessoa.get(1));
        System.out.println(Pessoa.indexOf("Santos"));
    }
}

