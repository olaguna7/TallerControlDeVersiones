
# 📄 **EXAMEN FINAL - GitConflicts**

## 🎯 **Evaluación Final: Simulación de un Proyecto Real en Git**

📌 **Objetivo:**  
Este examen evalúa tu capacidad para **gestionar un flujo de trabajo en Git**, **resolver conflictos**, **usar ramas correctamente**, **crear y configurar GitHub Actions**, **validar cambios antes de fusionarlos**, y **ejecutar pruebas automáticas en GitHub**.

📌 **Reglas:**  
✔️ **Tienes 2 horas para completarlo.**  
✔️ **Trabaja en un repositorio privado en GitHub.**  
✔️ **Usa ramas y commits organizados.**  
✔️ **Configura GitHub Actions para automatizar validaciones.**  
✔️ **Asegúrate de que la aplicación compile y pase los tests.**  
✔️ **Entrega tu código mediante un `Pull Request`.**

---

## 📌 **1️⃣ Creación del Proyecto en Java con Maven**

📌 **Ejercicio 1: Inicializar el Proyecto**  
✔️ **Crea un nuevo repositorio privado en GitHub llamado `examen-gitconflicts`.**  
✔️ **Crea un proyecto Maven en Java con estructura estándar (`src/main/java`).**  
✔️ **Incluye la clase `Calculator.java` con un método básico `multiplicar()`.**  
✔️ **Sube el código inicial a GitHub en la rama `main` y crea la rama `develop`.**

📌 **Código base (`Calculator.java` inicial)**
```java
package com.eoi.gitconflicts;

import java.util.Scanner;

public class Calculator {
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = scanner.nextInt();
        Calculator calculator = new Calculator();
        System.out.println("Resultado: " + calculator.multiply(a, b));
    }
}
```

---

## 📌 **2️⃣ Creación de Funcionalidades en Ramas**

📌 **Ejercicio 2: Implementar Métodos en `Calculator.java`**  
✔️ **Crea dos ramas a partir de `develop`:**
- `feature/agregar-suma`
- `feature/agregar-resta`

✔️ **En `feature/agregar-suma`, agrega el siguiente método:**
```java
public int sumar(int a, int b) {
    return a + b;
}
```

✔️ **En `feature/agregar-resta`, agrega este método:**
```java
public int restar(int a, int b) {
    return a - b;
}
```

✔️ **Cada funcionalidad debe ser implementada y commiteada en su propia rama.**

---

## 📌 **3️⃣ Resolución de Conflictos**

📌 **Ejercicio 3: Merge y Resolución de Conflictos**  
✔️ **Fusiona `feature/agregar-suma` en `develop`.**  
✔️ **Intenta fusionar `feature/agregar-resta` en `develop` y resuelve el conflicto generado en `Calculator.java`.**  
✔️ **Asegúrate de que `sumar()` y `restar()` existan correctamente en `develop`.**

📌 **El código final de `Calculator.java` debe verse así después de resolver el conflicto:**
```java
package com.eoi.gitconflicts;

import java.util.Scanner;

public class Calculator {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
```

---

## 📌 **4️⃣ Aplicación de un Hotfix en Producción**

📌 **Ejercicio 4: Corregir un problema en producción**  
✔️ **Crea una rama `hotfix/corregir-multiplicacion` desde `main` y corrige el método `multiply()`.**  
📌 **Corrección esperada:**
```java
public int multiply(int a, int b) {
    return Math.abs(a * b);
}
```
✔️ **Fusiona el hotfix en `main` y en `develop` para evitar regresiones.**

---

## 📌 **5️⃣ Validación del Código con Pruebas Unitarias**

📌 **Ejercicio 5: Ejecutar y Validar Pruebas**  
✔️ **Crea una nueva rama `feature/tests`.**  
✔️ **Añade las siguientes pruebas en `CalculatorTest.java`.**

📌 **Código de `CalculatorTest.java`:**
```java
package com.eoi.gitconflicts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testSumar() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.sumar(5, 3));
    }

    @Test
    void testRestar() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.restar(5, 3));
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
    }
}
```

✔️ **Verifica que todos los tests pasen antes de fusionar en `develop`.**

---

## 📌 **6️⃣ Obtener la Clave Secreta con GitHub Actions**

📌 **Ejercicio 6: Leer la Clave Secreta**  
✔️ **Haz un `push` en `develop` para activar GitHub Actions.**  
✔️ **Revisa los logs en GitHub Actions y encuentra la clave secreta en Base64.**  
✔️ **Decodifica la clave usando Git Bash:**
```sh
echo "TU_CLAVE_EN_BASE64" | base64 --decode
```
✔️ **Guarda la clave obtenida en `mensaje_final.txt`.**  
✔️ **Haz commit del archivo.**

---

## 📌 **7️⃣ Validar el Último Commit con GitHub Actions**

📌 **Ejercicio 7: Validar la clave y los tests antes de fusionar**  
✔️ **Abre un `Pull Request` para fusionar `develop` en `main`.**  
✔️ **Si la clave en `mensaje_final.txt` es correcta y los tests pasan, GitHub aprobará la fusión.**  
✔️ **Si la clave es incorrecta o los tests fallan, GitHub bloqueará la fusión hasta que se corrijan los errores.**

---

## 🎯 **Entrega del Examen**

✔️ **Entrega en el sistema de evaluación:**
- **El enlace a tu repositorio privado en GitHub.**
- **El enlace al Pull Request final en la rama main**

📌 **Da acceso a los instructores para la revisión del código.**
