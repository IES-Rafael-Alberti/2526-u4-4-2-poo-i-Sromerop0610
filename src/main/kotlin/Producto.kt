class Producto(
    private val nombre: String,
    private val precio: Double,
    private var stock: Int
) {

    init {
        require(precio > 0) { "El precio debe ser positivo" }
        require(stock >= 0) { "El stock no puede ser negativo" }
    }

    fun vender(cantidad: Int) {
        require(cantidad >= 0) { "La cantidad a vender debe ser positiva" }

        if (cantidad <= stock) {
            stock -= cantidad
        } else {
            throw IllegalStateException("No hay suficiente stock para vender $cantidad unidades de $nombre")
        }
    }

    fun reabastecer(cantidad: Int) {
        require(cantidad >= 0) { "La cantidad a reabastecer debe ser positiva" }
        stock += cantidad
    }

    override fun toString(): String {
        return "Producto: $nombre, Precio: $precio€, Stock: $stock"
    }
}