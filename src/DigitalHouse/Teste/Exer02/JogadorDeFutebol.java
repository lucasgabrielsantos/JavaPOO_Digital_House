package DigitalHouse.Teste.Exer02;

public class JogadorDeFutebol {
    private String nome;
    private int alegria, experiencia, gols, energia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public JogadorDeFutebol(String nome, int alegria, int experiencia, int gols, int energia) {
        this.nome = nome;
        this.alegria = alegria;
        this.experiencia = experiencia;
        this.gols = gols;
        this.energia = energia;
    }

    public void fazerGol() {

        this.setEnergia(getEnergia() - 5);
        this.setAlegria(getAlegria() + 10);
        this.setGols(getGols() + 1);
        gols++;
        System.out.println("GOOOOOOOOOOOOOOOOOOOOOOOOOOOOL DO DANIEL ALVESSSSSSS PORRAAAAAAAAAAAAAAAA");
    }

    public void Correr() {
        this.setEnergia(getEnergia() - 10);
        System.out.println("MORRI");
    }
}
