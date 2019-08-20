package DigitalHouse.Teste.Exer04;

public class Tripe {
    private boolean dobrado;
    private int AlturaMin, AlturaMax, AlturaAtual;

    public Tripe(boolean dobrado, int alturaMin, int alturaMax, int alturaAtual) {
        this.dobrado = dobrado;
        AlturaMin = alturaMin;
        AlturaMax = alturaMax;
        AlturaAtual = alturaAtual;
    }

    public boolean getDobrado() {
        return dobrado;
    }

    public void setDobrado(boolean dobrado) {
        this.dobrado = dobrado;
    }

    public int getAlturaMin() {
        return AlturaMin;
    }

    public void setAlturaMin(int alturaMin) {
        AlturaMin = alturaMin;
    }

    public int getAlturaMax() {
        return AlturaMax;
    }

    public void setAlturaMax(int alturaMax) {
        AlturaMax = alturaMax;
    }

    public int getAlturaAtual() {
        return AlturaAtual;
    }

    public void setAlturaAtual(int alturaAtual) {
        AlturaAtual = alturaAtual;
    }

    public void Altura(Integer novaAltura) {
        this.AlturaAtual = novaAltura;
    }

    public void dobrar() {
        this.dobrado = true;
        System.out.println("Dobrado");
    }

    public void desdobrado() {
        this.dobrado = false;
        System.out.println("Desdobrado");

    }

    public void guardar(boolean guardar) {
        if (dobrado = true && getAlturaAtual() > 0) ;
        System.out.println("O tripe está guardado. \n");

    }


}
