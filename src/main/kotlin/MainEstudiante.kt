fun main() {
    val estudiante1 = Estudiante("Ana")
    val estudiante2 = Estudiante("Luis")

    estudiante1.asignarNota(8.5)
    estudiante2.asignarNota(12.0) // fuera de rango

    println(estudiante1)
    println(estudiante2)
}