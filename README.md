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

- Ejercicio 1: Hacer una clase CuentaBancaria con su programa principal.
- Ejercicio 2: Hacer una clase Vehiculo con su programa principal. Su mayor diferencia con el ejercicio uno es el uso del override para sobrescribir el uso del toString para facilitar su uso.
- Ejercicio 3: Hacer una clase Libro con su programa principal. Se requiere del uso de constructores, a diferencia de los ejercicios anteriores.
- Ejercicio 4: Hacer una clase Estudiante con su programa principal. Necesita del uso del set.
- Ejercicio 5: Hacer una clase Producto con su programa principal. Hace uso del init.
### Código Fuente

- Ejercicio 1:
Clase: [CuentaBancaria.kt](src/main/kotlin/CuentaBancaria.kt)
Main: [MainCuentaBancaria.kt](src/main/kotlin/MainCuentaBancaria.kt)
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
Cada ejercicio cuenta con sus propios casos de prueba/ejecución, el usuario no debe escribir nada. Si se quisiese añadir otro caso de prueba a cada actividad habría que añadir al código del main:
- Ejercicio 1: 
```bash
  val cuenta = CuentaBancaria(nombre)
  cuenta.ingresar(cantidad)
  cuenta.retirar(cantidad)
  ```
- Ejercicio 2:
```bash
  vehiculo.registrarViaje(kilometros)
  ```
- Ejercicio 3:
```bash
  val libro1 = Libro(nombre, autor, paginas, estado)
  libro1.marcarComoLeido()
  ```
o
```bash
  val libro2 = Libro(nombre, autor)
  ```
- Ejercicio 4:
```bash
  val estudiante1 = Estudiante(nombre)
  estudiante1.asignarNota(nota)
  ```
- Ejercicio 5:
```bash
  val producto1 = Producto(nombre, precio, cantidad)  
  producto1.vender(cantidad)
  producto1.reabastecer(cantidad)
  ```
### Resultados de Pruebas
Si se añaden casos como los especificados anteriormente, los resultados deberían ser:
- Ejercicio 1:
    ```bash
    Ingreso realizado. Saldo actual: saldo
    Retiro realizado. Saldo actual: saldo
    Error de operación: Saldo insuficiente. Saldo actual: saldo // En caso de que fuese incorrecto
    ```
- Ejercicio 2:
    ```bash
    Vehículo(marca = marca, modelo = modelo, kilometraje = kilometraje)
    ```
- Ejercicio 3:
    ```bash
    Libro: nombre por autor, Páginas: paginas, Leído: estado
    Error al crear el libro: El título no puede estar vacío //En caso de error de datos
    ```
- Ejercicio 4:
    ```bash
    Estudiante: nombre, Nota: nota
    ```
- Ejercicio 5:
    ```bash
    Producto: nombre, Precio: precio, Stock: cantidad
    ```
## Conclusiones

Gracias a estos ejercicios hemos podido poner en práctica todos nuestros conocimientos sobre la programación orientada a objetos, he afianzado los conceptos previos que tenía y aprendido cosas nuevas, como por ejemplo el uso del set(value). Los ejercicios también me han hecho pensar sobre los valores privados o públicos, ya que nos pedía hacerlos todos privados pero en ocasiones yo pensaba que era más correcto que fuesen datos públicos ya que el usuario debería poder acceder a ellos.
