package edu.gabriel.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numeroPares = numeros.stream().filter(n -> n % 2 == 0).toList();
        List<Integer> numeroImpares = numeros.stream().filter(n -> n % 2 == 1).toList();

        System.out.println(numeroPares);
        System.out.println(numeroImpares);
    }
}
