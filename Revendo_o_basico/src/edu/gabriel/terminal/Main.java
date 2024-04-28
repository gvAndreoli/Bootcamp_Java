package edu.gabriel.terminal;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.printf("Oi, meu nome é %s %s, tenho %d e minha altura é %.2f cm"
                , nome, sobrenome, idade, altura);

        sc.close();
    }
}
