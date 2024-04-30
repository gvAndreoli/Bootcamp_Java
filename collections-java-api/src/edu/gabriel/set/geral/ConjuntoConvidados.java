package edu.gabriel.set.geral;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void addConvidado(String nome, int codigoConvite){
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigoConvite){
        Convidado convidadoRemove = null;
        for (Convidado c: convidados){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoRemove = c;
                break;
            }
        }
        convidados.remove(convidadoRemove);
    }

}
