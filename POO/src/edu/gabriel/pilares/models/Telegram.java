package edu.gabriel.pilares.models;

public class Telegram extends MessengerPadrao {
    @Override
    public void enviarMensagem() {
        validarInternet();
        System.out.println("mensagem enviada pelo Telegram");
        salvarNoHistorico();
    }

    @Override
    public void receberMensagem() {
        System.out.println("mensagem recebida pelo Telegram");
    }
}
