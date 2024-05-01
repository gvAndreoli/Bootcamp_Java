package edu.gabriel.desafios;



import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int maiorPrimo = numeros.stream().filter(Desafio14::ehPrimo).max(Comparator.naturalOrder()).orElse(0);

        System.out.println(maiorPrimo);
    }

    private static boolean ehPrimo(Integer num){
        if (num <= 1) {
            return  false;
        } for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
