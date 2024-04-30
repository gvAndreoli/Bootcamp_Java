package edu.gabriel.lists.geral;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void addTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t: tarefas){
            if (t.getDescricao().equals(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroDeTarefas(){
        return tarefas.size();
    }

    public void obterTarefas(){
        System.out.println(tarefas);
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        System.out.println("numero total de elementos presentes na lista: "
                + lista.obterNumeroDeTarefas());

    }
}