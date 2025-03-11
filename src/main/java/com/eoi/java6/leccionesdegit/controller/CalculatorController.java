package com.eoi.java6.leccionesdegit.controller;

import com.eoi.java6.leccionesdegit.service.CalculatorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    private final CalculatorService calculatorService = new CalculatorService();

    @GetMapping("/calculadora")
    public String mostrarCalculadora() {
        return "calculator";
    }

    @GetMapping("/resultado")
    public String calcular(@RequestParam(required = false) Integer num1, 
                           @RequestParam(required = false) Integer num2, 
                           @RequestParam String operacion, 
                           Model model) {

        if (num1 == null || (num2 == null && !operacion.equals("raizCuadrada"))) {
            model.addAttribute("error", "Por favor, ingrese valores válidos.");
            return "calculator";
        }

        int resultado = 0;
        String error = null;

        try {
            switch (operacion) {
                case "sumar":
                    resultado = calculatorService.sumar(num1, num2);
                    break;
                case "restar":
                    resultado = calculatorService.restar(num1, num2);
                    break;
                case "multiplicar":
                    resultado = calculatorService.multiplicar(num1, num2);
                    break;
                case "dividir":
                    if (num2 == 0) {
                        throw new ArithmeticException("No se puede dividir por cero.");
                    }
                    resultado = calculatorService.dividir(num1, num2);
                    break;
                case "potencia":
                    resultado = (int) calculatorService.potencia(num1, num2);
                    break;
                case "raizCuadrada":
                    if (num1 < 0) {
                        throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo.");
                    }
                    resultado = (int) calculatorService.raizCuadrada(num1);
                    break;
                default:
                    error = "Operación no válida.";
            }
        } catch (ArithmeticException e) {
            error = e.getMessage();
        }

        if (error != null) {
            model.addAttribute("error", error);
        } else {
            model.addAttribute("resultado", resultado);
        }
        return "calculator";
    }
}
