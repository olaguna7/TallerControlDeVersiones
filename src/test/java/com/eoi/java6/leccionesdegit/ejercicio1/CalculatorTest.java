package com.eoi.java6.leccionesdegit.ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testSumar() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.sumar(2, 3), "El método sumar() debe devolver 5 para (2,3)");
    }

    @Test
    public void testDividir() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.dividir(6, 3), "El método dividir() debe devolver 2 para (6,3)");
    }

    @Test
    public void testDividirPorCero() {
        Calculator calc = new Calculator();
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.dividir(6, 0);
        });
        assertEquals("No se puede dividir por cero", exception.getMessage(), "El método dividir() debe lanzar una excepción cuando el divisor es 0");
    }
}
