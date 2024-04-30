package edu.gabriel.lists.pesquisa;

public class Livro {
    private String nome;
    private String autor;
    private int anoPublicacao;

    public Livro(String nome, String autor, int dataPublicacao) {
        this.nome = nome;
        this.autor = autor;
        this.anoPublicacao = dataPublicacao;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString(){
        return getNome() + " - " + getAutor() + " - " + getAnoPublicacao();
    }
}
