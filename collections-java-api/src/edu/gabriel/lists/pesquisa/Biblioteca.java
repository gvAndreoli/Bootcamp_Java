package edu.gabriel.lists.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(String nome, String autor, int anoPublicacao){
        Livro livro = new Livro(nome, autor, anoPublicacao);
        livros.add(livro);
    }

    public List<Livro> pesquisarAutor(String autor){
        List<Livro> listaDoAutor = new ArrayList<>();
        if (!livros.isEmpty()){
            for (Livro l: livros){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    listaDoAutor.add(l);
                }
            }
        }
        return listaDoAutor;
    }

    public List<Livro> pesquisaPorIntervalo(int anoInicial, int anoFinal){
        List<Livro> listaDeLivros = new ArrayList<>();
        if (!livros.isEmpty()){
            for (Livro l: livros){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    listaDeLivros.add(l);
                }
            }
        }
        return listaDeLivros;
    }

    public Livro pesquisaTitulo(String titulo){
        if (!livros.isEmpty()){
            for (Livro l: livros){
                if (l.getAutor().equalsIgnoreCase(titulo)){
                    return l;
                }
            }
        }
        return null;
    }

}
