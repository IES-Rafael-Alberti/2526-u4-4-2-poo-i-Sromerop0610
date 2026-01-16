class Libro(
    private val titulo: String,
    private val autor: String,
    private val numPaginas: Int,
    private var leido: Boolean
) {

    init {
        require(titulo.isNotBlank()) { "El título no puede estar vacío" }
        require(autor.isNotBlank()) { "El autor no puede estar vacío" }
        require(numPaginas in 1..5000) { "El número de páginas debe estar entre 1 y 5000" }
    }

    constructor(titulo: String, autor: String) :
            this(titulo, autor, 100, false)

    fun marcarComoLeido() {
        leido = true
    }

    override fun toString(): String {
        val leidoTexto = if (leido) "Sí" else "No"
        return "Libro: $titulo por $autor, Páginas: $numPaginas, Leído: $leidoTexto"
    }
}