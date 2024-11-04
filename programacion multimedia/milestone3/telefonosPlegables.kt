open class Telefono(var pantallaEncendida: Boolean = false) {
    // Definición de la clase base 'Telefono', que tiene una propiedad 'pantallaEncendida' con valor inicial 'false'.
    // La clase está marcada como 'open', lo que significa que puede ser heredada por otras clases.

    open fun encender() {
        // Método 'open', lo que significa que puede ser sobrescrito en clases derivadas.
        pantallaEncendida = true
        // Cuando se llama, enciende la pantalla del teléfono (establece 'pantallaEncendida' a 'true').
    }

    fun apagar() {
        // Método para apagar la pantalla del teléfono.
        pantallaEncendida = false
        // Cuando se llama, apaga la pantalla del teléfono (establece 'pantallaEncendida' a 'false').
    }

    fun verificarPantallaTelefono() {
        // Método para verificar el estado de la pantalla del teléfono.
        val estadoPantalla = if (pantallaEncendida) "encendida" else "apagada"
        // Asigna a 'estadoPantalla' el valor "encendida" si 'pantallaEncendida' es 'true', 
        // o "apagada" si es 'false'.

        println("La pantalla del teléfono está $estadoPantalla.")
        // Imprime el estado de la pantalla en la consola.
    }
}

class TelefonoPlegable(var plegado: Boolean = true): Telefono() {
    // Definición de la clase derivada 'TelefonoPlegable', que hereda de 'Telefono'.
    // Tiene una propiedad adicional 'plegado', que indica si el teléfono está plegado. 
    // Por defecto, el teléfono está plegado (true).

    override fun encender() {
        // Sobrescribe el método 'encender' de la clase base.
        if (!plegado) {
            // Verifica si el teléfono no está plegado (es decir, desplegado).
            pantallaEncendida = true
            // Si no está plegado, enciende la pantalla.
        }
    }

    fun plegar() {
        // Método que pliega el teléfono.
        plegado = true
        // Establece 'plegado' a 'true', indicando que el teléfono está plegado.
    }

    fun desplegar() {
        // Método que despliega el teléfono.
        plegado = false
        // Establece 'plegado' a 'false', indicando que el teléfono está desplegado.
    }
}

fun main() {
    // Función principal 'main', punto de entrada del programa.

    val nuevoTelefonoPlegable = TelefonoPlegable()
    // Se crea una instancia de 'TelefonoPlegable' llamada 'nuevoTelefonoPlegable'. 
    // Por defecto, estará plegado.

    nuevoTelefonoPlegable.encender()
    // Intenta encender la pantalla del teléfono plegable. 
    // Como el teléfono está plegado, la pantalla no debería encenderse.

    nuevoTelefonoPlegable.verificarPantallaTelefono()
    // Verifica el estado de la pantalla y lo imprime en la consola. 
    // Debería decir que la pantalla está apagada, ya que el teléfono estaba plegado.

    nuevoTelefonoPlegable.desplegar()
    // Despliega el teléfono, estableciendo 'plegado' a 'false'.

    nuevoTelefonoPlegable.encender()
    // Ahora intenta encender la pantalla del teléfono, y como el teléfono no está plegado, la pantalla debería encenderse.

    nuevoTelefonoPlegable.verificarPantallaTelefono()
    // Verifica nuevamente el estado de la pantalla y lo imprime. 
    // Esta vez debería decir que la pantalla está encendida.
}

