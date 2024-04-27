package edu.gabriel.metodos;

public class Metodos {
    // <visibilidade> <tipo-de-retorno> <nome><parametros>{ <retorno>}

    public int somar(int x, int y){
        return x + y;
    }

    public static double dividir(double x, double y){
        return x / y;
    }

    public static void main(String[] args) {
        double resultado = dividir(4, 0);
        System.out.println(resultado);
    }
}
