package edu.gabriel.operadores;

public class Operadores {
    public static void main(String[] args) {
        // (+, -, *, /) aritiméticos básicos
        // (%, )
        // (++, --, -=, +=, /=, *=) atribuição com incremento ou outras funções aritiméticas
        // (==, !=, >=, <=, <, >) operadores de comparação
        // (!, &&, ||) operadores lógicos
        // (=) operador de atribuição

        String str = "Linguagem "+"Java";

        int valor = str == "Linguagem Java"? 10 : 5; //usando um ternario

        int valor2 = false? 10 : 5;

        System.out.println(valor);
        System.out.println(valor2);
    }
}
