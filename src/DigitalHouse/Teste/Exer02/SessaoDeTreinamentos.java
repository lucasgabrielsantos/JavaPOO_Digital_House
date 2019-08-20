package DigitalHouse.Teste.Exer02;

public class SessaoDeTreinamentos {
    private int xp;

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void TreinarA(JogadorDeFutebol Euzebio) {
        Euzebio.Correr();
        Euzebio.fazerGol();
        Euzebio.Correr();
        setXp(getXp() + 1);

        System.out.println("Experiencia Final: " + getXp());
    }
}

