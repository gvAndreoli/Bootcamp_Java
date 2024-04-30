package edu.gabriel.pilares.models;

public abstract class MessengerPadrao {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarInternet(){
        System.out.println("Validado");
    }

    protected void salvarNoHistorico(){
        System.out.println("Salvo");
    }
}
