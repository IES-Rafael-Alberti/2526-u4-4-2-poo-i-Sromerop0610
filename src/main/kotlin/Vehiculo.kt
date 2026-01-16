class Vehiculo(private val marca: String, private val modelo: String) {

    private var kilometraje: Double = 0.0

    fun registrarViaje(kilometros: Double): Unit{
        this.kilometraje += kilometros
    }

    override fun toString(): String {
        return "Vehículo(marca = $marca, modelo = $modelo, kilometraje = $kilometraje)"
    }
}