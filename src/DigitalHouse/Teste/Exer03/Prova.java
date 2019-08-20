package DigitalHouse.Teste.Exer03;

public class Prova {
    private int energiaNecessaria;
    private int dificuldade;

    public Prova(int energiaNecessaria, int dificuldade) {
        this.energiaNecessaria = energiaNecessaria;
        this.dificuldade = dificuldade;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public int getEnergiaNecessaria() {
        return energiaNecessaria;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public void setEnergiaNecessaria(int energiaNecessaria) {
        this.energiaNecessaria = energiaNecessaria;
    }

    public void podeRealizar(Atleta atleta) {

        if (atleta.getNivel() >= getDificuldade() &&
                atleta.getEnergia() >= getEnergiaNecessaria()) {
            System.out.println("PODE TREINAR FDP");
            System.out.println(true);

        } else
            System.out.println("TA DE RESSACA NÉ FDP");
            System.out.println(false);

    }
}
