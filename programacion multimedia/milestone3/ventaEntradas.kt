fun main() {
    // Función principal 'main', punto de entrada del programa.

    val child = 5
    // Se define una variable 'child' para representar la edad de un niño (5 años).

    val adult = 28
    // Se define una variable 'adult' para representar la edad de un adulto (28 años).

    val senior = 87
    // Se define una variable 'senior' para representar la edad de un adulto mayor (87 años).

    val isMonday = true
    // Se define una variable booleana 'isMonday' que indica si es lunes o no (true en este caso).

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    // Se imprime el precio del boleto para un niño de 5 años, llamando a la función 'ticketPrice' con la edad del niño y 'isMonday'.

    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    // Se imprime el precio del boleto para un adulto de 28 años, llamando a la función 'ticketPrice' con la edad del adulto y 'isMonday'.

    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
    // Se imprime el precio del boleto para un adulto mayor de 87 años, llamando a la función 'ticketPrice' con la edad del adulto mayor y 'isMonday'.
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    // Definición de la función 'ticketPrice', que toma dos parámetros:
    // 'age' (edad de la persona) y 'isMonday' (si es lunes o no).

    return when(age) {
        in 0..12 -> 15
        // Si la edad está entre 0 y 12 (niños), el precio del boleto es 15.

        in 13..60 -> if (isMonday) 25 else 30
        // Si la edad está entre 13 y 60 (adultos), el precio depende de si es lunes:
        // Si es lunes, el precio es 25; de lo contrario, es 30.

        in 61..100 -> 20
        // Si la edad está entre 61 y 100 (adultos mayores), el precio es 20.

        else -> -1
        // Si la edad no está en ningún rango definido (por ejemplo, una edad negativa o mayor de 100), devuelve -1 (indicando un error).
    }
}
