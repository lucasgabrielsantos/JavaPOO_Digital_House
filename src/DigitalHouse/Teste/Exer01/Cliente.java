package DigitalHouse.Teste.Exer01;

import com.sun.security.ntlm.Client;

public class Cliente {

private String nome, sobrenome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }



}
