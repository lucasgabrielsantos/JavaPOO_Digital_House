package DigitalHouse.Aula04.Exercicio02;

public class Teste {

    public static void main(String[] args) {
        int opcao1 = 2;
        int opcao2 = 2;

        System.out.println("Escolha se o ingresso é do tipo Normal (1) ou VIP (2)");

        switch (opcao1) {

            case 1:
                System.out.println("Ingresso do tipo Normal");
                Normal normal = new Normal();
                System.out.println("Valor do ingresso Normal é " + normal.imprimirValor());
                break;

            case 2:
                System.out.println("Ingresso do tipo VIP \n " +
                        "Favor Selecionar se é Camarote Superior (1) ou Camarote Inferior (2)");

                switch (opcao2) {

                    case 1:
                        System.out.println("Ingresso do tipo VIP Camarote Superior");
                        CamaroteSuperior superior = new CamaroteSuperior();
                        System.out.println("Valor do ingresso VIP Camarote Superior é " + superior.imprimirValor());
                        break;

                    case 2:
                        System.out.println("Ingresso do tipo VIP Camarote Inferior");
                        CamaroteInferior inferior = new CamaroteInferior();
                        System.out.println("Valor do ingresso VIP Camarote Inferior é " + inferior.imprimirValor());
                        break;
                }
        }
    }
}

