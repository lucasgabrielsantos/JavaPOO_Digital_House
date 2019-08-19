package DigitalHouse.Aula01.Exercicio01;


public class Animal {
    private String nomeAnimal;
    private String raca;
    public int idade;
    private Pessoa donoAnimal;

    public Animal(String novoNomeAnimal) {  // Especifico
        nomeAnimal = novoNomeAnimal;
    }

    public Animal() {
        // Padrão
    }

    public void brincar() {
        System.out.println("O animal está brincando? ");
    }


    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa getDonoAnimal() {
        return donoAnimal;
    }

    public void setDonoAnimal(Pessoa novoDonoAnimal) {
        this.donoAnimal = novoDonoAnimal;
    }

    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public void setRaca(String novaRaca) {
        this.raca = novaRaca;
    }

    public void setNomeAnimal(String novoNomeAnimal) {
        this.nomeAnimal = novoNomeAnimal;
    }

}


