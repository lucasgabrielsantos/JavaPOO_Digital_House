package DigitalHouse.Teste.Exer02;

public class Main {
    public static void main(String[] args) {

        JogadorDeFutebol jogador = new JogadorDeFutebol
                ("Lucas",100,50,10,100);
        SessaoDeTreinamentos treino = new SessaoDeTreinamentos();
        treino.TreinarA(jogador);

    }
}
