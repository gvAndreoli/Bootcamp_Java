package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;

public class AssumptionsTeste {

    @Test
    public void validarAlgoSomenteNoUsuarioWillyan(){
        Assumptions.assumeTrue("root".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5);
    }
}
