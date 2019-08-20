package DigitalHouse.Teste.Exer01;

public class Conta {
    private double numConta, saldo;
    private Cliente titular;

    public double getNumConta() {
        return numConta;
    }

    public void setNumConta(double numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void Deposito(double quantia) {

        this.setSaldo(getSaldo() + quantia + getSaldo());
        System.out.println("Deposito realizado com sucesso. " + "\n" + getSaldo());

    }

    public void Saque(double quantia) {


        if (this.getSaldo() > quantia) {
            this.setSaldo(getSaldo() - quantia);
            System.out.println("Saque realizado " + getSaldo());
        } else
            System.out.println("Saldo indisponivel para saque solicitado. ");

    }
}
