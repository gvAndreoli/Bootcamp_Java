package edu.gabriel.set.geral;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas(){
        this.palavras = new HashSet<>();
    }

    public void addPalavra(String palavra){
        palavras.add(palavra);
    }

    public void removePalavra(String palavra){
        if (verificaPalavra(palavra)){
            palavras.remove(palavra);
        }
    }

    public boolean verificaPalavra(String palavra){
        for (String p: palavras){
            if (p.equalsIgnoreCase(palavra)){
                return true;
            }
        }
        return false;
    }

    public void exibePalavras(){
        for (String p: palavras){
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.addPalavra("oi");
        conjunto.addPalavra("ola");
        conjunto.addPalavra("oi");
        conjunto.addPalavra("oa");
        conjunto.addPalavra("oláaa");
        conjunto.addPalavra("fala");
        conjunto.addPalavra("oi");

        conjunto.exibePalavras();
    }
}
