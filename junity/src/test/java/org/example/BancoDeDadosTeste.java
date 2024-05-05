package org.example;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class BancoDeDadosTeste {
    @BeforeAll
    static void configurarConexao(){
        BancoDeDados.iniciarConexao();
    }

    @Test
    public void validarDados(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }
}
