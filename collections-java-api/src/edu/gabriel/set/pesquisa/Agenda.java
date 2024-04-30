package edu.gabriel.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class Agenda {
    private Set<Contato> lista;

    public Agenda() {
        this.lista = new HashSet<>();
    }

    public void addContato(String nome, int idade){
        lista.add(new Contato(nome, idade));
    }

    public void exibirContatos(){
        System.out.println(lista);
    }

    public Set<Contato> pesquisaPorNomes(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : lista){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c: lista){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}
