package com.eoi.java6.leccionesdegit.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService service = new CalculatorService();

    @Test
    void testSumar() {
        assertEquals(5, service.sumar(2, 3)); // ❌ Fallará porque sumar() no está implementado
    }

    @Test
    void testMultiplicar() {
        assertEquals(6, service.multiplicar(2, 3)); // ❌ Fallará porque multiplicar() no está implementado
    }
}