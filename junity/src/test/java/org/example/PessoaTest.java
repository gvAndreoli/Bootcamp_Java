package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    public void validarCalculoIdade(){
        Pessoa p = new Pessoa("Gabriel", LocalDate.of(2004,12,9));
        Assertions.assertEquals(19, p.getIdade());
    }
    @Test
    public void deveSerMaiorDeIdade(){
        Pessoa p = new Pessoa("Larissa", LocalDate.of(2006,8,21));
        Assertions.assertFalse(p.getIdade() >= 18);
    }
}
