
# 🚀 **Taller de Resolución de Conflictos en Git**

## 📌 **Introducción**
Este taller está diseñado para ayudarte a **comprender y resolver conflictos en Git** de manera práctica y progresiva.  
Trabajarás en una aplicación **Spring Boot con Thymeleaf**, donde cada ejercicio te presentará un conflicto realista que deberás solucionar.

Al finalizar el taller, habrás adquirido habilidades clave para manejar conflictos de manera eficiente en entornos de desarrollo colaborativo.

---

## 🎯 **Objetivos del Taller**
✅ Aprender a identificar y resolver **conflictos en Git**.  
✅ Aplicar buenas prácticas en **control de versiones**.  
✅ Familiarizarse con **IntelliJ IDEA** como entorno de desarrollo.  
✅ Asegurar la funcionalidad de la aplicación a través de **tests automatizados**.

---

## 🛠 **Requisitos Previos**
Antes de comenzar, asegúrate de tener instalados los siguientes programas en tu equipo:

- **Git**
- **IntelliJ IDEA** (versión Community o Ultimate)
- **Java 17+**
- **Maven**
- **Spring Boot**

Si aún no los tienes instalados, puedes descargarlos desde sus sitios oficiales.

---

## 📌 **Cómo Clonar el Proyecto**
Para obtener el proyecto en tu computadora, sigue estos pasos en **IntelliJ IDEA**:

1️⃣ **Abre IntelliJ IDEA**  
2️⃣ **Selecciona `Get from VCS` en la pantalla de inicio**  
3️⃣ **Elige `Git` como sistema de control de versiones**  
4️⃣ **Introduce la URL del repositorio:**
   ```
   https://github.com/JacaScript/leccionesdegit.git
   ```
5️⃣ **Haz clic en `Clone` y espera a que IntelliJ descargue el proyecto.**

---

## 📂 **Estructura del Proyecto**
```
📂 leccionesdegit
 ├── 📂 src
 │   ├── 📂 main
 │   │   ├── 📂 java/com/eoi/java6/leccionesdegit
 │   │   │   ├── 📂 controller     (Controladores Spring)
 │   │   │   ├── 📂 service        (Lógica de negocio)
 │   │   │   ├── 📂 model          (Modelos de datos)
 │   │   │   ├── 📂 repository     (Acceso a datos si fuera necesario)
 │   │   │   ├── 📄 Calculator.java  (Clase de lógica matemática)
 │   │   ├── 📂 resources
 │   │       ├── 📂 templates      (Vistas Thymeleaf)
 │   │       ├── 📂 static         (CSS, JS, imágenes)
 │   │       └── 📄 application.properties  (Configuración)
 │   ├── 📂 test
 │       ├── 📂 java/com/eoi/java6/leccionesdegit
 │       │   ├── 📂 controller  (Tests de controladores)
 │       │   ├── 📂 service     (Tests de lógica)
 │       │   ├── 📄 CalculatorServiceTest.java
 ├── 📄 README.md
 ├── 📄 pom.xml  (Archivo Maven)
 └── 📄 .gitignore
```

✅ **Cada ejercicio en el taller se basa en una rama de Git diferente que contiene un conflicto intencional.**

---

## 🚀 **Cómo Ejecutar el Proyecto**
Desde **IntelliJ IDEA**, sigue estos pasos:

1️⃣ **Abre el proyecto**  
2️⃣ **Ejecuta `LeccionesDeGitApplication` desde el panel de ejecución**  
3️⃣ **Accede a la aplicación en el navegador:**
   ```
   http://localhost:8080
   ```

Si todo está correcto, verás la interfaz de la calculadora en funcionamiento.

---

## 🔄 **Cómo Resolver los Ejercicios**
Cada ejercicio tiene su propio conflicto de Git y se encuentra en una rama específica.

Para comenzar con un ejercicio, cambia a la rama correspondiente:
```bash
git checkout ejercicio1-rama1
```
Luego, intenta fusionarlo con la rama que genera el conflicto:
```bash
git merge ejercicio1-rama2
```
Cuando Git detecte el conflicto, usa IntelliJ IDEA para resolverlo.

---

## 📌 **Lista de Ejercicios**
A continuación, se detallan los ejercicios que resolverás en este taller:

| #  | Ejercicio | Descripción |
|----|----------|------------|
| 1  | Corrección de Métodos | Resolver conflictos en la clase `Calculator.java` |
| 2  | Creación de Controladores | Implementar un controlador REST en Spring Boot |
| 3  | Configuración de Spring Boot | Ajustar la configuración de la aplicación |
| 4  | Lógica de Servicios | Separar la lógica en `CalculatorService` |
| 5  | Integración de Vistas | Crear una vista Thymeleaf para la calculadora |
| 6  | Conexión Frontend-Backend | Conectar la interfaz con el backend |
| 7  | Operaciones Avanzadas | Agregar más funcionalidades matemáticas |
| 8  | Manejo de Errores | Implementar validaciones en la calculadora |
| 9  | Estilos CSS | Aplicar estilos a la interfaz |
| 10 | Historial de Cálculos | Implementar un sistema de historial |

Cada ejercicio tiene un **README.md** con instrucciones detalladas para resolver el conflicto correspondiente.

---

## 🛠 **Herramientas y Comandos Útiles**
Aquí tienes algunos comandos útiles para trabajar con Git en este taller:

🔹 **Ver el estado del repositorio:**
```bash
git status
```

🔹 **Ver las ramas disponibles:**
```bash
git branch
```

🔹 **Cambiar a una rama específica:**
```bash
git checkout <nombre-de-la-rama>
```

🔹 **Fusionar una rama en la actual (provoca conflicto si hay cambios en las mismas líneas):**
```bash
git merge <rama-a-fusionar>
```

🔹 **Guardar cambios y continuar después:**
```bash
git stash
```

🔹 **Mostrar historial de commits:**
```bash
git log --oneline --graph --all
```

---

## 🎯 **Conclusión**
Al finalizar el taller, habrás adquirido experiencia práctica en **resolución de conflictos en Git**, manejo de ramas y fusión de cambios en un proyecto real.

Si tienes dudas, consulta la documentación oficial de Git o pregunta a tus compañeros e instructores.

📌 **¡Buena suerte y que comience el taller! 🚀🔥**

