package edu.gabriel.pilares.models;

public class FacebookMessenger extends MessengerPadrao {

    @Override
    public void enviarMensagem() {
        validarInternet();
        System.out.println("mensagem enviada pelo FcMenssager");
        salvarNoHistorico();
    }

    @Override
    public void receberMensagem() {
        System.out.println("mensagem recebida pelo FcMenssager");
    }
}
