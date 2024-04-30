package edu.gabriel.pilares.models;

public class MSNMessenger extends MessengerPadrao {
    @Override
    public void enviarMensagem() {
        validarInternet();
        System.out.println("mensagem enviada pelo MSNMenssager");
        salvarNoHistorico();
    }

    @Override
    public void receberMensagem() {
        System.out.println("mensagem recebida pelo MSNMenssager");
    }
}
