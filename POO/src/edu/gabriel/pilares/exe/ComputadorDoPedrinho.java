package edu.gabriel.pilares.exe;

import edu.gabriel.pilares.models.FacebookMessenger;
import edu.gabriel.pilares.models.MSNMessenger;
import edu.gabriel.pilares.models.MessengerPadrao;
import edu.gabriel.pilares.models.Telegram;

public class ComputadorDoPedrinho {
    public static void main(String[] args) {
        MessengerPadrao smi = null;

        String appEscolhido="msn";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();


        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
