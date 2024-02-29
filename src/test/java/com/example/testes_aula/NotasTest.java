package com.example.testes_aula;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotasTest {

    @Test
    public void mediaDasNotasDeveSer7() {
        Notas notas = new Notas();
        double mediaCalculada = notas.calcularMedia(8, 6, 7);
        assertEquals(mediaCalculada, 7);

    }
}
