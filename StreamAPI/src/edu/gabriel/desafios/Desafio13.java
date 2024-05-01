package edu.gabriel.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio13 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int inicio = 5;
        int fim = 10;

        List<Integer> dentroDoIntervalo = numeros.stream().filter(n -> n >= inicio).filter(n -> n <= fim).toList();

        System.out.println(dentroDoIntervalo);
    }
}
