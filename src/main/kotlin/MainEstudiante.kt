fun main() {
    val estudiante1 = Estudiante("Ana")
    val estudiante2 = Estudiante("Luis")
    val estudiante3 = Estudiante("Pepe")

    estudiante1.asignarNota(8.5)
    estudiante2.asignarNota(12.0) // fuera de rango
    estudiante3.asignarNota(-1.0) //fuera de rango

    println(estudiante1)
    println(estudiante2)
    println(estudiante3)
}