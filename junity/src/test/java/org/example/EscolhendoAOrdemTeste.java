package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoAOrdemTeste {

    @Order(3)
    @Test
    public void validaFluxoA(){
        Assertions.assertTrue(true);
    }

    @Order(4)

    @Test
    public void validaFluxoB(){
        Assertions.assertTrue(true);

    }
    @Order(1)

    @Test
    public void validaFluxoC(){
        Assertions.assertTrue(true);

    }
    @Order(2)

    @Test
    public void validaFluxoD(){
        Assertions.assertTrue(false);

    }
}
