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
    public String calcular(@RequestParam int num1, @RequestParam int num2, @RequestParam String operacion, Model model) {
        int resultado = 0;
        String error = null;

        if (operacion.equals("dividir") && num2 == 0) {
            error = "Error: No se puede dividir por cero";
        } else {
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
                    resultado = calculatorService.dividir(num1, num2);
                    break;
            }
        }

        model.addAttribute("resultado", resultado);
        model.addAttribute("error", error);
        return "calculator";
    }
}
