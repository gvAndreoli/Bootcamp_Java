package edu.gabriel.anatomia;

import java.util.Scanner;

public class Anatomia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // isso aqui é um scanner, serve para permitir o imput

        String var = "apenas uma variavel";
        int inteiro; //também é possivel inicializar uma variavel sem dar um valor a ele
        Integer n1; //isso aqui é uma classe que se comporta como um tipo primitivo

        System.out.print("Digite a nota do fulano: "); //comando para escrever algo no terminal
        n1 = sc.nextInt(); // recebendo o valor do imput em uma variável


        if (n1 >= 7) {                      // estrutura condicional
            var = "Aprovado";
        } else if (n1 >= 4) {
            var = "Recuperação";
        } else {
            var = "Reprovado";
        }

        for (int i = 0; i < n1; i++) {      // estrutura de repetição
            System.out.println(var);
        }

        sc.close(); // SEMPRE FECHE O SCANNER
    }
}
