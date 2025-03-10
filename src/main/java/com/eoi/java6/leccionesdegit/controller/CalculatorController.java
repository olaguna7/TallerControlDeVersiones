package com.eoi.java6.leccionesdegit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalculatorController {

    @GetMapping("/calculadora")
    public String mostrarCalculadora() {
        return "calculator"; // ✅ Se corrigió el error: ahora devuelve la vista Thymeleaf correctamente
    }
}
