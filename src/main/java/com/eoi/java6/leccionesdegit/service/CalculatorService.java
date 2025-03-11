package com.eoi.java6.leccionesdegit.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CalculatorService {
    private final List<String> historial = new ArrayList<>();

    public int sumar(int a, int b) {
        int resultado = a + b;
        guardarHistorial(a, b, "sumar", resultado);
        return resultado;
    }

    public int restar(int a, int b) {
        int resultado = a - b;
        guardarHistorial(a, b, "restar", resultado);
        return resultado;
    }

    public int multiplicar(int a, int b) {
        int resultado = a * b;
        guardarHistorial(a, b, "multiplicar", resultado);
        return resultado;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        int resultado = a / b;
        guardarHistorial(a, b, "dividir", resultado);
        return resultado;
    }

    public double potencia(int a, int b) {
        double resultado = Math.pow(a, b);
        guardarHistorial(a, b, "potencia", resultado);
        return resultado;
    }

    public double raizCuadrada(int a) {
        if (a < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        double resultado = Math.sqrt(a);
        guardarHistorial(a, 0, "raizCuadrada", resultado);
        return resultado;
    }

    private void guardarHistorial(int a, int b, String operacion, double resultado) {
        historial.add(a + " " + operacion + " " + b + " = " + resultado);
    }

    public List<String> getHistorial() {
        return historial;
    }
}
