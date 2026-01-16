fun main() {

    val producto1 = Producto("Portátil", 899.99, 5)
    val producto2 = Producto("Ratón", 19.95, 20)

    producto1.vender(2)
    producto2.vender(25)      // no hay stock suficiente

    producto1.reabastecer(3)
    producto2.reabastecer(10)

    println(producto1)
    println(producto2)
}
