
# 🚀 **Taller de Resolución de Conflictos en Git**

## 📌 **Introducción**
Bienvenido al **Taller de Resolución de Conflictos en Git**, diseñado para ayudarte a **comprender y resolver conflictos de Git en un entorno realista**.

Git es una de las herramientas más utilizadas en el desarrollo de software para gestionar versiones de código y facilitar el trabajo colaborativo. Sin embargo, cuando varios desarrolladores trabajan en el mismo proyecto, es común que surjan **conflictos en la fusión de cambios**.

En este taller, aprenderás:  
✅ Cómo identificar y resolver **conflictos de Git** de manera efectiva.  
✅ Cómo usar **IntelliJ IDEA** para gestionar conflictos sin necesidad de línea de comandos.  
✅ Buenas prácticas en **control de versiones** para evitar problemas en equipos de desarrollo.  
✅ La importancia de los **tests automatizados** para validar los cambios después de resolver conflictos.

El objetivo es que al finalizar el taller, te sientas cómodo resolviendo conflictos en proyectos colaborativos y puedas aplicar estas habilidades en el mundo real.

---

## 🛠 **Requisitos Previos**
Antes de comenzar, asegúrate de tener instalados los siguientes programas en tu equipo:

- **Git** → [Descargar aquí](https://git-scm.com/downloads)
- **IntelliJ IDEA** (versión Community o Ultimate) → [Descargar aquí](https://www.jetbrains.com/idea/download/)
- **Java 17+** → [Descargar aquí](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- **Maven** → [Descargar aquí](https://maven.apache.org/download.cgi)
- **Spring Boot** (se ejecutará automáticamente desde IntelliJ con Maven)

Si aún no los tienes instalados, puedes descargarlos desde sus sitios oficiales antes de continuar.

---

## 🔄 **Cómo Obtener el Proyecto**
Para realizar el taller, primero debes hacer un **fork** del repositorio original.

### ✅ **Paso 1: Hacer un Fork del Repositorio en GitHub**
1️⃣ **Ve al siguiente enlace:**  
👉 [https://github.com/ateixeiramunoz/leccionesdegit](https://github.com/ateixeiramunoz/leccionesdegit)  
2️⃣ **Haz clic en el botón `Fork` (arriba a la derecha).**  
3️⃣ **Selecciona tu cuenta de GitHub o una organización donde quieras guardar el fork.**

Esto creará una copia del repositorio en tu cuenta, donde podrás trabajar sin afectar el original.

---

### ✅ **Paso 2: Clonar el Proyecto en IntelliJ IDEA**
💡 **Trabajaremos exclusivamente desde IntelliJ IDEA**, así que sigue estos pasos para clonar el proyecto correctamente:

1️⃣ **Abre IntelliJ IDEA**  
2️⃣ **En la pantalla de inicio, selecciona `Get from VCS`**  
3️⃣ **En `Version Control`, elige `Git`**  
4️⃣ **Introduce la URL de tu fork del repositorio:**
   ```
   https://github.com/TU-USUARIO/leccionesdegit.git
   ```
5️⃣ **Haz clic en `Clone` y espera a que IntelliJ descargue el proyecto.**  
6️⃣ **Una vez clonado, IntelliJ detectará automáticamente que es un proyecto Maven.**  
7️⃣ **Ejecuta el comando `mvn install` desde la terminal de IntelliJ o usa la opción de `Reload Maven Project`.**

✅ **Ahora estás listo para empezar el taller.**

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

## 🚀 **Git Cheat Sheet - Comandos Útiles**
Aquí tienes algunos comandos esenciales de Git que te ayudarán durante el taller:

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

🔹 **Fusionar una rama en la actual (puede generar conflictos):**
```bash
git merge <rama-a-fusionar>
```

🔹 **Ver el historial de commits de forma gráfica:**
```bash
git log --oneline --graph --all
```

🔹 **Ver qué cambios se han hecho antes de confirmar un commit:**
```bash
git diff
```

🔹 **Guardar cambios temporalmente sin hacer commit (stash):**
```bash
git stash
```

🔹 **Aplicar los cambios guardados con stash:**
```bash
git stash pop
```

🔹 **Deshacer un commit antes de hacer push:**
```bash
git reset --soft HEAD~1
```

🔹 **Descartar todos los cambios en archivos no confirmados:**
```bash
git checkout -- .
```

🔹 **Borrar una rama localmente después de haberla fusionado:**
```bash
git branch -d <nombre-de-la-rama>
```

🔹 **Borrar una rama remota después de haberla fusionado:**
```bash
git push origin --delete <nombre-de-la-rama>
```

🔹 **Actualizar tu fork con los cambios del repositorio original:**
```bash
git remote add upstream https://github.com/ateixeiramunoz/leccionesdegit.git
git fetch upstream
git merge upstream/main
git push origin main
```

✅ **Estos comandos te ayudarán a moverte cómodamente por el proyecto y resolver conflictos de manera efectiva.**

---

## 🎯 **Conclusión**
Al finalizar el taller, habrás adquirido experiencia práctica en **resolución de conflictos en Git**, manejo de ramas y fusión de cambios en un proyecto real.

Si tienes dudas, consulta la documentación oficial de Git o pregunta a tus compañeros e instructores.

📌 **¡Buena suerte y que comience el taller! 🚀🔥**

