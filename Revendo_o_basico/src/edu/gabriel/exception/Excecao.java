package edu.gabriel.exception;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Excecao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        while (true) {
            try {
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
                break;

            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Ai não né meu patrão, informa direito");
            }
        }
        sc.close();
    }
}
