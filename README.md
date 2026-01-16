[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/8gPRGAIg)
# Práctica 4.2: Programación orientada a objetos I

Apóyate en los siguientes recursos para realizar la práctica:

[U4: 2. POO I](https://revilofe.github.io/section1/u04/practica/PROG-U4.-Practica002/)

> ATENCIÓN: DURANTE LA DOCUMENTACIÓN DE LA PRÁCTICA, ELIMINA TODO AQUELLO QUE NO APLIQUE. PEEEEEEEROOOOOOO, ANTES DE ELIMINAR ALGO, PIENSA SI APLICA O NO.

---

# Título de la Actividad

## Identificación de la Actividad

- **ID de la Actividad:** Ejercicios POO I
- **Módulo:** PROG
- **Unidad de Trabajo:** U4 POO y estructuras de datos
- **Fecha de Creación:** 16/01/2026
- **Fecha de Entrega:** 17/01/2026
- **Alumno(s):**
  - **Nombre y Apellidos:** Sara Romero Peralta
  - **Correo electrónico:** sromper0610@g.educaand.es
  - **Iniciales del Alumno/Grupo:** SRP

## Descripción de la Actividad

La actividad consiste en realizar 5 actividades de programación orientada a objetos, donde tratamos las clases, los valores públicos o privados, métodos, constructores, etc.

## Instrucciones de Compilación y Ejecución

1. **Requisitos Previos:**

   - Kotlin en su última versión. Se requiere también de la última versión java para poder compilar el código
   - Se puede ejecutar desde terminal de comandos pero se recomienda el uso de una IDE
2. **Pasos para Compilar el Código:**

   ```bash
   kotlinc NombrePrograma.kt -include-runtime -d NombrePrograma
   ```
3. **Pasos para Ejecutar el Código:**

   ```bash
   java -jar NombrePrograma.jar

   ```
4. **Ejecución de Pruebas:**

   No se han realizados pruebas

## Desarrollo de la Actividad

### Descripción del Desarrollo

Para desarrollar la actividad he tenido que realizar 5 actividades distintas, en las que trabajamos la programación orientada a objetos realizando distintas clases, cada ejercicio implementaba nuevos conceptos lo que nos ayudaba a reforzar y practicar conceptos:

- Ejercicio 1: Hacer una clase CuentaBancaria.
- Ejercicio 2: Hacer una clase Vehiculo con su programa principal. Su mayor diferencia con el ejercicio uno es el uso del override para sobrescribir el uso del toString para facilitar su uso.
- Ejercicio 3: Hacer una clase Libro con su programa principal. Se requiere del uso de constructores, a diferencia de los ejercicios anteriores.
- Ejercicio 4: Hacer una clase Estudiante con su programa principal. Necesita del uso del set.
- Ejercicio 5: Hacer una clase Producto con su programa principal. Hace uso del init.
### Código Fuente

- Ejercicio 1:
[CuentaBancaria.kt](src/main/kotlin/CuentaBancaria.kt)
- Ejercicio 2:
Clase: [Vehiculo.kt](src/main/kotlin/Vehiculo.kt) 
Main: [MainVehiculo.kt](src/main/kotlin/MainVehiculo.kt)
- Ejercicio 3:
Clase: [Libro.kt](src/main/kotlin/Libro.kt)
Main: [Libreria.kt](src/main/kotlin/Libreria.kt)
- Ejercicio 4:
Clase: [Estudiante.kt](src/main/kotlin/Estudiante.kt)
Main: [MainEstudiante.kt](src/main/kotlin/MainEstudiante.kt)
- Ejercicio 5:
Clase: [Producto.kt](src/main/kotlin/Producto.kt)
Main: [MainProducto.kt](src/main/kotlin/MainProducto.kt)
### Ejemplos de Ejecución
Cada ejercicio, a excepción del primero ya que solo cuenta con clase sin su programa principal, realiza algunas pruebas para testear el programa
### Resultados de Pruebas

[Aquí se detallará cómo se ha verificado la funcionalidad del código, incluyendo resultados de pruebas automatizadas o manuales, en caso de que las haya.]

## Documentación Adicional

- **Manual de Usuario:** [Enlace a la documentación del usuario, si existe]
- **Autorización de Permisos:** Verificar que el profesor tenga permisos de lectura en el repositorio para revisar el código.

## Conclusiones

[Resumen de las conclusiones alcanzadas al desarrollar la actividad, las lecciones aprendidas, y posibles mejoras que se puedan implementar en futuras entregas.]

## Referencias y Fuentes

[Aquí se listarán las fuentes consultadas para el desarrollo de la actividad, tales como documentación oficial, artículos, o cualquier recurso externo relevante.]

### Notas Adicionales:

1. **Nombres de Archivos y Repositorios:**
   - Asegúrate de que el nombre del archivo o repositorio siga la estructura definida: `XXX-idActividad-Iniciales`.
2. **Permisos:**
   - Verifica que el profesor tenga los permisos necesarios para acceder al repositorio o documento.
3. **Formato:**
   - Si se entrega en formato PDF o Google Docs, asegúrate de cumplir con el mínimo y máximo de folios establecidos.
4. **Compilación y Ejecución:**
   - Detalla claramente cómo compilar y ejecutar el código, incluyendo las instrucciones en el archivo `README.md`.
