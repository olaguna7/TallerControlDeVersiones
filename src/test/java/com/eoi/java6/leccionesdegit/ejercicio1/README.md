
### 🚀 **Ejercicio 1: Corrección de Métodos en `Calculator`**

---

## **📜 Introducción al Ejercicio**

### **📌 Contexto**
El equipo de desarrollo ha comenzado a implementar una calculadora en Java. Sin embargo, dos desarrolladores han trabajado en **diferentes versiones de la clase `Calculator`**, lo que ha generado **errores en la implementación y conflictos en Git**.

El objetivo de este ejercicio es corregir estos errores y aprender a resolver conflictos cuando dos ramas han modificado la misma clase de manera incompatible.

---

## **🎯 Objetivos**
✅ **Resolver conflictos en Git** al combinar ambas ramas.  
✅ Corregir los **errores en `Calculator.java`** para que los cálculos sean correctos.  
✅ Ejecutar las **pruebas automatizadas** para verificar que la implementación final funciona correctamente.

---

## **🔀 Diferencias entre las ramas en conflicto**
- **`ejercicio1-rama1`**  
  🔹 Corrige el error en `sumar(int, int)`.  
  🔹 Agrega un nuevo método `multiplicar(int, int)`.

- **`ejercicio1-rama2`**  
  🔹 Corrige el error en `dividir(int, int)`.  
  🔹 Agrega un nuevo método `restar(int, int)`.

Cuando intentes fusionarlas, Git **no podrá decidir automáticamente** qué cambios mantener.

