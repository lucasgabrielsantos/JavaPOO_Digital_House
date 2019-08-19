package DigitalHouse.Aula04.Exercicio02;


public class CamaroteSuperior extends Vip {

    float valorsuperior = 500;

    public CamaroteSuperior() {
    }


    @Override
    public float imprimirValor() {
        super.imprimirValor();

        return valor + adicional + valorsuperior;


    }
}

