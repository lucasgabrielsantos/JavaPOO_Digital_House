package DigitalHouse.Aula06.Exercicio01;


public class Main {
    public static void main(String[] args) {

        Contrato contrato1 = new Contrato("Lucas ","PGM");
        Foto foto1 = new Foto("Paisagem", "4k");
        Impressora impressora1 = new Impressora();

        contrato1.imprimivel();
        impressora1.adicionarImprimivel(contrato1);
        impressora1.imprimirTudo();

        System.out.println("\n<><><><><><><><>\n");
        foto1.imprimivel();


    }
}

