package Exercicio1;

public class Banco {
    public String nome;
    public String cpf;
    public double saldo;

    public Banco(String nome, String cpf, double saldo){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;

    }
    public Banco(){
        this.nome = "Sem nome";
        this.cpf = "0000";
        this.saldo = 0;
    }
    public String getNome(){
        return this.nome =nome;
    }
    public String getCpf(){
        return this.cpf =cpf;

    }
}
