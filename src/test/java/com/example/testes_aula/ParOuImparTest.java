package com.example.testes_aula;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParOuImparTest {
    @Test
    public void numeroDeveSerPar() {
        ParOuImpar parOuImpar = new ParOuImpar();
        boolean ehPar = parOuImpar.indicaNumeroPar(8);
        assertTrue(ehPar);

    }

    @Test
    public void numeroDeveSerImpar() {
        ParOuImpar parOuImpar = new ParOuImpar();
        boolean naoEhPar = parOuImpar.indicaNumeroPar(5);
        assertFalse(naoEhPar);
    }

}