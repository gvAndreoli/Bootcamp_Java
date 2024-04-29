package edu.gabriel.desafio;

import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        for (int i = 0; i < 10; i++) {
            double saque = scanner.nextDouble();
            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }else if (limiteDiario >= saque){
                limiteDiario -= saque;
                System.out.printf("Saque realizado. Limite restante: %.1f%n", limiteDiario);
            }else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }
        }
        scanner.close();
    }
}
