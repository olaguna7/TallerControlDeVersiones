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
    public String calcular(@RequestParam int num1, @RequestParam int num2, Model model) {
        int resultado = calculatorService.sumar(num1, num2);
        model.addAttribute("resultado", resultado);
        return "calculator";
    }
}
