package edu.gabriel.geral.model;

public class Adulto extends Pessoa {
    private String trabalho;
    private double salario;
    public Adulto(String nome, int idade, double altura,
                  String trabalho, double salario){
        super(nome, idade);
        this.trabalho = trabalho;
        this.salario = salario;
    }

    public String getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void falar() {
        System.out.printf("Me chamo %s, trabalho com %s e ganho %.2f ," +
                "tenho %d anos e to trabalhando tanto que aparento ter " +
                "%d hahahahahahaha...%n", getNome(), getTrabalho(), getSalario(),
                getIdade(), getIdade() + 16);
    }
}
