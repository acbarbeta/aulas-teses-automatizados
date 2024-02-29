package com.example.testes_aula;

public class Calculadora {

    public double soma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double subtrai(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public double multiplica(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public double divide(double numero1, double numero2) throws Exception {
        if (numero2 == 0) {
            throw new IllegalArgumentException("Não existe divisão por 0");
        } else {

            return numero1 / numero2;
        }
    }
}