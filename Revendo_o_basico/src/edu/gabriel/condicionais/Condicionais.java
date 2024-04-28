package edu.gabriel.condicionais;

import java.util.Random;

public class Condicionais {
    public static void main(String[] args) {
        Random random = new Random();
        try {
            int variavel = random.nextInt(0, 10);
            System.out.println(variavel);

            if (variavel >= 7) {
                System.out.println("aprovado");
            } else if (variavel >= 4) {
                System.out.println("recuperação");
            } else {
                System.out.println("reprovado");
            }

            int variavel2 = random.nextInt(0, 10);
            System.out.println(variavel2);

            String resultado = variavel > variavel2 ? "A maior é a variavel 1" : "A maior é a variavel 2";
            System.out.println(resultado);

            int x = 8 / 0;

            switch (x) {
                case 1:
                    System.out.println("algo");
                    break;
                case 6:
                    System.out.println("o certo");
                    break;
                default:
                    System.out.println("Tá tudo errado");
            }

        } catch (Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Acabei");
        }
    }
}
