package com.eoi.java6.leccionesdegit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/calculadora")
    public String mostrarCalculadora() {
        return "calculator";
    }

    @GetMapping("/resultado")
    public String calcular(@RequestParam int num1, @RequestParam int num2, Model model) {
        int resultado = num1 + num2;
        model.addAttribute("resultado", resultado); // ✅ Se añadió el modelo para pasar el resultado a la vista
        return "calculator";
    }
}
