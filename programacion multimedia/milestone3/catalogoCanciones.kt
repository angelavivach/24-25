fun main() { 
    // Declaración de la función principal, punto de entrada del programa.
    
    val ladyGagaCancion = Cancion("Alejandro", "Lady Gaga", 2014, 2_500_000)
    // Se crea un objeto de la clase 'Cancion' llamado 'ladyGagaCancion'. 
    // Se le pasa el título "Alejandro", el autor "Lady Gaga", el año 2014, y un playCount de 2.5 millones.

    ladyGagaCancion.printDescripcion()
    // Llama al método 'printDescripcion()' del objeto 'ladyGagaCancion', 
    // el cual imprimirá una descripción de la canción.

    println(ladyGagaCancion.popular)
    // Imprime el valor de la propiedad 'popular' de la canción. 
    // Esto mostrará si la canción es popular en función del número de reproducciones (playCount).
}

class Cancion(
    val titulo: String,
    val autor: String,
    val añoPublicacion: Int,
    val playCount: Int
) {
    // Definición de la clase 'Cancion', que tiene cuatro propiedades: 'titulo', 'autor', 'añoPublicacion', y 'playCount'.
    // Estas son todas propiedades 'val', lo que significa que son inmutables una vez asignadas.

    val popular: Boolean
        get() = playCount >= 2000
    // Definición de una propiedad calculada llamada 'popular'.
    // Devuelve 'true' si el número de reproducciones (playCount) es mayor o igual a 2000, lo que indica si la canción es popular.

    fun printDescripcion() {
        println("$titulo, performed by $autor, was released in $añoPublicacion.")
        // Método de la clase 'Cancion' que imprime una descripción de la canción en formato: 
        // "Título, performed by Autor, was released in AñoPublicacion."
    }
}

