package DigitalHouse.Teste.Exer03;

public class Main {
    public static void main(String[] args) {


        Atleta jogador1 = new Atleta("Lucas", 10, 50);
        Atleta jogador2 = new Atleta("Gabriel", 100, 100);

        Prova prova1 = new Prova(90, 60);
        Prova prova2 = new Prova(10, 20);

        prova2.podeRealizar(jogador1);
    }
}
