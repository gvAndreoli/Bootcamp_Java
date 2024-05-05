package org.example;

public class TransferenciaEntreContas {
    public void transfere(Conta origem, Conta destino, double valor) throws IllegalAccessException {
        if (valor <= 0){
            throw new IllegalAccessException("O valor deve ser maior que zero");
        }
    }
}
