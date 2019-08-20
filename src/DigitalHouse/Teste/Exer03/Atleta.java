package DigitalHouse.Teste.Exer03;


public class Atleta {

    private String nome;
    private int energia, nivel;

    public String getNome() {
        return nome;
    }

    public int getEnergia() {
        return energia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Atleta(String nome, int energia, int nivel) {
        this.nome = nome;
        this.energia = energia;
        this.nivel = nivel;
    }


}
