package DigitalHouse.Aula07.Listas;


import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {

        Map<Integer, String> mapa = new java.util.HashMap<>();

        mapa.put(10, "Lucas Gabriel");
        mapa.put(15, "Bruna Lais");
        mapa.put(25, "Sala de Aula");
        mapa.put(25, "Sala de Aulaa");
        //mapa.remove(25);

        for (Integer chave : mapa.keySet()) {
            String valor = mapa.get(chave);
            System.out.println("Indicador: " + chave);
            System.out.println("Conteúdo: " + valor);
        }
    }
}

