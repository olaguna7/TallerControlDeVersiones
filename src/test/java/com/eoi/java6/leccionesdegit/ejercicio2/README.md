# 🚀 **Ejercicio 2: Creación de un Controlador con Thymeleaf en Spring Boot**

---

## **📜 Introducción al Ejercicio**

### **📌 Contexto**
Hasta ahora, hemos trabajado con la lógica de la calculadora dentro de una clase Java. Para mejorar la experiencia del usuario, el equipo de desarrollo ha decidido crear una **interfaz web con Thymeleaf** para que los usuarios puedan introducir valores y ver los resultados en el navegador.

Sin embargo, dos desarrolladores han trabajado en **diferentes versiones del controlador**, lo que ha generado **conflictos que deben resolverse**.

---

## **🎯 Objetivos**
✅ Crear un **controlador en Spring Boot** (`CalculatorController.java`) que muestre una página con Thymeleaf.  
✅ Servir una **vista HTML (`calculator.html`)** desde el backend.  
✅ Resolver **conflictos en Git** cuando dos desarrolladores hagan cambios incompatibles en el controlador.  
✅ **Ejecutar pruebas unitarias** para verificar que el controlador devuelve la vista correcta.

---

## **🔀 Diferencias entre las ramas en conflicto**
Dos desarrolladores han hecho cambios incompatibles en `CalculatorController.java`:

- **`ejercicio2-rama1`**  
  🔹 Muestra la vista de la calculadora desde **`/calculadora`**.  
  🔹 Usa la plantilla **`calculator.html`**.

- **`ejercicio2-rama2`**  
  🔹 Muestra la vista de la calculadora desde **`/home`**.  
  🔹 Usa la plantilla **`home.html`**.

Cuando intentes fusionarlas, Git **no podrá decidir automáticamente** qué versión del controlador debe mantenerse.

---

