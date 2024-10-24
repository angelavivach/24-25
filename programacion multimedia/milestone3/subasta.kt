fun main() { 
    // Función principal 'main', punto de entrada del programa.

    val ofertaGanadora = Oferta(5000, "Coleccionista Privado")
    // Se crea un objeto de la clase 'Oferta' llamado 'ofertaGanadora'. 
    // Tiene un monto de 5000 y el oferente es "Coleccionista Privado".

    println("El artículo A se vende por ${precioDeSubasta(ofertaGanadora, 2000)}.")
    // Llama a la función 'precioDeSubasta' pasando la 'ofertaGanadora' y un precio mínimo de 2000.
    // Imprime el resultado de la función, que será el monto de la oferta o el precio mínimo dependiendo de la oferta.

    println("El artículo B se vende por ${precioDeSubasta(null, 3000)}.")
    // Llama a la función 'precioDeSubasta' pasando 'null' como oferta y un precio mínimo de 3000.
    // Como la oferta es 'null', la función debería devolver el precio mínimo (3000).
}

class Oferta(val monto: Int, val oferente: String)
    // Definición de la clase 'Oferta', que representa una oferta en una subasta.
    // Tiene dos propiedades: 'monto' (cantidad ofertada) y 'oferente' (nombre del oferente).

fun precioDeSubasta(oferta: Oferta?, precioMinimo: Int): Int {
    // Función que calcula el precio final de una subasta.
    // Toma dos parámetros: una 'Oferta?' (puede ser nula) y un 'precioMinimo' de tipo Int.

    return oferta?.monto ?: precioMinimo
    // Usa el operador de acceso seguro '?.' para acceder al monto de la oferta, solo si no es 'null'.
    // Si 'oferta' es 'null', el operador Elvis '?:' devuelve el 'precioMinimo'.
}

