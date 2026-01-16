fun main() {
    val cuenta = CuentaBancaria("Sara")

    try {
        cuenta.ingresar(100.0)  // Ingreso correcto
        cuenta.retirar(50.0)    // Retiro correcto
        cuenta.retirar(100.0)   // Retiro que supera el saldo
    } catch (e: IllegalArgumentException) {
        println("Error de operación: ${e.message}")
    } catch (e: IllegalStateException) {
        println("Error de operación: ${e.message}")
    }
}