fun main() {

    val producto1 = Producto("Portátil", 899.99, 5)
    val producto2 = Producto("Ratón", 19.95, 20)

    try {
        producto1.vender(2)       // venta correcta
        producto2.vender(25)      // no hay stock suficiente
    } catch (e: IllegalArgumentException) {
        println("Error de argumento: ${e.message}")
    } catch (e: IllegalStateException) {
        println("Error de stock: ${e.message}")
    }

    try {
        producto1.reabastecer(3)  // reabastecer correcto
        producto2.reabastecer(10)
    } catch (e: IllegalArgumentException) {
        println("Error de argumento: ${e.message}")
    }

    println(producto1)
    println(producto2)
}
