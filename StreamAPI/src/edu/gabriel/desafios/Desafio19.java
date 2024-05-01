package edu.gabriel.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> divisivel3 = numeros.stream().filter(n -> n % 3 == 0).toList();
        List<Integer> divisivel5 = numeros.stream().filter(n -> n % 5 == 0).toList();

        int soma = Stream.concat(divisivel3.stream(), divisivel5.stream()).reduce(0, Integer::sum);
        System.out.println(soma);
    }
}
