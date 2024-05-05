package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ExceptionTeste {

    @Test
    public void validarCenarioDeExcecaoTransferencia(){
        Conta origem = new Conta("12341", 0);
        Conta destino = new Conta("716241", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntreContas.transfere(origem, destino, -1));
    }
}
