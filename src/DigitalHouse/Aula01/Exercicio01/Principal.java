package DigitalHouse.Aula01.Exercicio01;

public class Principal {
    public static void main(String[] args) {
        Animal animalMamifero = new Animal("Bidu");

        Animal animalDomestico = new Animal();
        animalDomestico.setNomeAnimal("Pe de Pano");
        System.out.println(animalDomestico);
        System.out.println(animalDomestico.getNomeAnimal());
        System.out.println("__________________________");

        Pessoa pessoaJovem = new Pessoa("Erika");
        System.out.println(pessoaJovem.getNomePessoa());

        animalDomestico.setDonoAnimal(pessoaJovem);
        System.out.println(animalDomestico.getDonoAnimal().getNomePessoa());

        Pessoa pessoaIdosa = new Pessoa("Geralda");
        animalDomestico.setDonoAnimal(pessoaJovem);

    }
}
