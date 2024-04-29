package edu.gabriel.geral.model;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void falar(){
        System.out.printf("Olá, tudo bem?, me chamo %s%n" +
                "tenho %d anos e %.2f cm de altura%n", getNome(), getIdade(),
                getAltura());
    }
}
