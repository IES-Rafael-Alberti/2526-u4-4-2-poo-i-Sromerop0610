class CuentaBancaria(private val titular: String) {

    private var saldo: Double = 0.0

    fun ingresar(cantidad: Double) {
        if (cantidad <= 0) {
            throw IllegalArgumentException("No se puede ingresar una cantidad menor o igual a 0")
        }

        saldo += cantidad
        println("Ingreso realizado. Saldo actual: $saldo €")
    }

    fun retirar(cantidad: Double) {
        if (cantidad <= 0) {
            throw IllegalArgumentException("No se puede retirar una cantidad menor o igual a 0")
        }

        if (cantidad > saldo) {
            throw IllegalStateException("Saldo insuficiente. Saldo actual: $saldo €")
        }

        saldo -= cantidad
        println("Retiro realizado. Saldo actual: $saldo €")
    }
}
