package edu.gabriel.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemplo {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Kotlin", "python",
                "Javascript", "c", "go", "ruby");

        //Predicate<String> maisDe5Letras = str -> str.length() > 5;

        palavras.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);
    }
}
