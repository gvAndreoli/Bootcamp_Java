package edu.gabriel.geral.model;

public class Bebe extends Pessoa{
    public Bebe(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void falar() {
        System.out.println("BUUUUAAAAAAAAAAA");
    }
}
