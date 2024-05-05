package org.example;

public class Conta {
    private String numeroDaConta;
    private double saldo;

    public Conta(String numeroDaConta, double saldo) {
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
