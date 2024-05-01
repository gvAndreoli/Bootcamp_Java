package edu.gabriel.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> imparesX3 = numeros.stream().filter(n -> n % 2 == 1).filter(n -> n % 3 == 0).toList();
        List<Integer> imparesX5 = numeros.stream().filter(n -> n % 2 == 1).filter(n -> n % 5 == 0).toList();

        List<Integer> resultado = Stream.concat(imparesX3.stream(), imparesX5.stream()).toList();
        System.out.println(resultado);
    }
}
