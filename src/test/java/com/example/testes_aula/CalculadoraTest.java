package com.example.testes_aula;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    public void somaDoisNumeros() {
        Calculadora calculadora = new Calculadora();
        double somaCalculada = calculadora.soma(2, 3);
        assertEquals(somaCalculada, 5);
    }

    @Test
    public void subtraiDoisNumeros() {
        Calculadora calculadora = new Calculadora();
        double subtracaoCalculada = calculadora.subtrai(10, 4);
        assertEquals(subtracaoCalculada, 6);
    }

    @Test
    public void multiplicaDoisNumeros() {
        Calculadora calculadora = new Calculadora();
        double multiplicacaoCalculada = calculadora.multiplica(5, 4);
        assertEquals(multiplicacaoCalculada, 20);
    }

    @Test
    public void divideDoisNumeros() throws Exception {
        Calculadora calculadora = new Calculadora();
        double divisaoCalculada = calculadora.divide(8, 4);
        assertEquals(divisaoCalculada, 2);
    }

    @Test
    public void divisaoPorZero() {
        Calculadora calculadora = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.divide(7.0, 0);
        });
    }


}