package edu.gabriel.estruturaDeRepeticao;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("oi " + i);
            if (i >= 5){
                break;
            }
        }

        int c = 0;
        while (true){
            c++;
            if (c == 5){
                break;
            }
        }

        do {
            c++;
        } while (c != 10);

        String[] alunos = {"Gabriel", "Marcos", "Felipe", "Arthur"};

        for (String nome: alunos){
            System.out.println(nome);
        }
    }
}
