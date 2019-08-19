package DigitalHouse.Aula04.Exercicio01;

public abstract class Pessoa {
    protected String nome, sobrenome;
    private String cpf;
    protected String sexo;


    //Overloading...
    public abstract void respirar(String nome);

    public void cadastroPessoa(String nome, String sobrenome){
        System.out.println("Dados da pessoa " + nome + " " + sobrenome);

    }

    public void cadastroPessoa(String nome, String sobrenome, String sexo){
        System.out.println("Dados da pessoa atualizado " + nome + " " + sobrenome +
                "\n " + "Sexo: " + sexo);
    }

    public  void cadastroPessoa(String nome){
        System.out.println("Dados simples: " + nome);
    }


    public Pessoa(String novoNome, String novoSexo){
        this.nome = novoNome;
        this.sexo = novoSexo;
    }
    public boolean Estudar(boolean status){
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String  getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }




}
