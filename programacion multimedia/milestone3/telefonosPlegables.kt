open class Telefono(var pantallaEncendida: Boolean = false) {
    open fun encender() {
        pantallaEncendida = true
    }

    fun apagar() {
        pantallaEncendida = false
    }

    fun verificarPantallaTelefono() {
        val estadoPantalla = if (pantallaEncendida) "encendida" else "apagada"
        println("La pantalla del teléfono está $estadoPantalla.")
    }
}

class TelefonoPlegable(var plegado: Boolean = true): Telefono() {
    override fun encender() {
        if (!plegado) {
            pantallaEncendida = true
        }
    }

    fun plegar() {
        plegado = true
    }

    fun desplegar() {
        plegado = false
    }
}

fun main() {
    val nuevoTelefonoPlegable = TelefonoPlegable()

    nuevoTelefonoPlegable.encender()
    nuevoTelefonoPlegable.verificarPantallaTelefono()
    nuevoTelefonoPlegable.desplegar()
    nuevoTelefonoPlegable.encender()
    nuevoTelefonoPlegable.verificarPantallaTelefono()
}
