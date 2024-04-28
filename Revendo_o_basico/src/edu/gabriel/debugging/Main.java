package edu.gabriel.debugging;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aqui se inicia a execução do programa");
        A();
        System.out.println("Aqui se encerra a execução do programa");
    }

    public static void A(){
        System.out.println("Aqui se inicia a execução do método A");
        B();
        System.out.println("Aqui se encerra a execução do método A");
    }

    public static void B(){
        System.out.println("Aqui se inicia a execução do método B");
        C();
        System.out.println("Aqui se encerra a execução do método B");
    }

    public static void C(){
        System.out.println("Aqui se inicia a execução do método C");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        D();
        System.out.println("Aqui se encerra a execução do método C");
    }

    public static void D(){
        System.out.println("Aqui se inicia a execução do método D");

        System.out.println("Aqui se encerra a execução do método D");
    }
}
