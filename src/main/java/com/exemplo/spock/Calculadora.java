package com.exemplo.spock;

public class Calculadora {

    public int somar(int a, int b) {

        return a + b;
    }

    public int dividir(int a, int b) {

        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não permitida");
        }
        return a + b;
    }
}
