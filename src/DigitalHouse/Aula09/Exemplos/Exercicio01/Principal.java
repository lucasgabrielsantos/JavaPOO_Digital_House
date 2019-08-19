package DigitalHouse.Aula09.Exemplos.Exercicio01;

public class Principal {

    public static void main(String[] args) {
        Integer soma = 1;

        try {
            Pessoa pessoa = new Pessoa();
            pessoa.setRg(3);
            System.out.println(pessoa.getRg() + 1000);
            System.out.println(soma);

        } catch (NullPointerException ex) {
            System.out.println("Ocorreu um erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            if (soma > 2) {
                System.out.println("A soma é maior que 2");
            } else {
                System.out.println("A soma é menor que 2");
            }
            System.out.println("Lógica feita dentro do finally");
        }
    }
}

