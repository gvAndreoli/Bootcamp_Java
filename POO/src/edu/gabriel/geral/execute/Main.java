package edu.gabriel.geral.execute;

import edu.gabriel.geral.model.Adulto;
import edu.gabriel.geral.model.EstadoBrasileiro;
import edu.gabriel.geral.model.Pessoa;
import edu.gabriel.geral.model.Bebe;

public class Main {
    public static void main(String[] args) {
//        Pessoa p = new Pessoa("João", 15);
//        p.setAltura(1.75);
//        p.falar();
//
//        Pessoa b = new Bebe("Carlinhos", 1);
//        b.falar();
//
//        Pessoa a = new Adulto("Tulio", 40, 1.78, "Programador",
//                7000);
//        a.setAltura(1.83);
//        a.falar();

//        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
//            System.out.println(e.getSigla() + " - " + e.getNome());
//        }

        EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.gerNomeMaiusculo());

    }
}
