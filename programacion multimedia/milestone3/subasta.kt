fun main() {
    val ofertaGanadora = Oferta(5000, "Coleccionista Privado")

    println("El artículo A se vende por ${precioDeSubasta(ofertaGanadora, 2000)}.")
    println("El artículo B se vende por ${precioDeSubasta(null, 3000)}.")
}

class Oferta(val monto: Int, val oferente: String)

fun precioDeSubasta(oferta: Oferta?, precioMinimo: Int): Int {
    return oferta?.monto ?: precioMinimo
}
