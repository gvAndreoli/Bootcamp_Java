package edu.gabriel.map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agenda;

    public AgendaEventos() {
        this.agenda = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome atracao);
        agenda.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> agendaEventos = new TreeMap<>(agenda);
        System.out.println(agendaEventos);
    }
}
