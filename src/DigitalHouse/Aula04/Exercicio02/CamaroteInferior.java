package DigitalHouse.Aula04.Exercicio02;

public class CamaroteInferior extends Vip {
    public CamaroteInferior() {

    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    String localizacao;

    public void ImprimirLocal(CamaroteInferior inferior) {
        System.out.println(localizacao);
    }


}


