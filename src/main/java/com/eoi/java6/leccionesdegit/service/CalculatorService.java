package com.eoi.java6.leccionesdegit.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }

    public double potencia(int a, int b) {
        return Math.pow(a, b); // ✅ Nueva operación
    }
}
