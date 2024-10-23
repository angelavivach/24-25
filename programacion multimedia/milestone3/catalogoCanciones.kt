fun main() {
    val ladyGagaCancion = Cancion("Alejandro", "Lagy Gaga", 2014, 2_500_000)
   ladyGagaCancion.printDescripcion()
    println(ladyGagaCancion.popular)
}
class Cancion(
    val titulo: String,
    val autor: String,
    val añoPublicacion: Int,
    val playCount: Int
){
    val popular: Boolean
        get() = playCount >= 2000

    fun printDescripcion() {
        println("$titulo, performed by $autor, was released in $añoPublicacion.")
    }
}
