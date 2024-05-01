package edu.gabriel.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean saoPositivos = numeros.stream().allMatch(n -> n >= 0);

        System.out.println("Todos são positivos?: "+ saoPositivos);
    }
}
