package DigitalHouse.Aula04.Exercicio02;


public class Vip extends Ingresso {

    float adicional = 200;

    public Vip() {

    }

    @Override
    public float imprimirValor() {

        return valor + adicional;
    }
}
