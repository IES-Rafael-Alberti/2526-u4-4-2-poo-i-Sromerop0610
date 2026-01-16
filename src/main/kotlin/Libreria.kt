fun main() {
    try {
        val libro1 = Libro("1984", "George Orwell", 328, false)
        val libro2 = Libro("El Principito", "Antoine de Saint-Exupéry")

        libro1.marcarComoLeido()

        println(libro1)
        println(libro2)

        // Error intencionado
        val libroError = Libro("", "Autor Desconocido")
        println(libroError)

    } catch (e: IllegalArgumentException) {
        println("Error al crear el libro: ${e.message}")
    }
}
