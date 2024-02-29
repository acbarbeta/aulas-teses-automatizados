package com.example.testes_aula;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusTest {
    @Test
    public void deveReceber5PorcentoBonus() {
        Bonus bonus = new Bonus();
        double bonusRecebido = bonus.calcularBonus(20, 6, 1000);
        assertEquals(bonusRecebido, 50);
    }

    @Test
    public void deveReceber10PorcentoBonus() {
        Bonus bonus = new Bonus();
        double bonusRecebido = bonus.calcularBonus(31, 12, 1000);
        assertEquals(bonusRecebido, 100);
    }

    @Test
    public void naoRecebeBonus() {
        Bonus bonus = new Bonus();
        double bonusRecebido = bonus.calcularBonus(19, 5, 1000);
        assertEquals(bonusRecebido, 0);
    }

}