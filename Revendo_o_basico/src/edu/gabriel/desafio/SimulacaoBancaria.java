package edu.gabriel.desafio;

import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        boolean continuar = true;
        while (continuar) {

            int opcao = scanner.nextInt();
            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            switch (opcao){
                case 0:
                    continuar = false;
                    System.out.println("Programa encerrado.");
                    break;

                case 1:
                    saldo += scanner.nextDouble();
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;

                case 2:
                    double saque = scanner.nextDouble();
                    if (saldo >= saque){
                        saldo -= saque;
                        System.out.printf("Saldo atual: %.1f%n", saldo);
                    } else{
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3:
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;

                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
