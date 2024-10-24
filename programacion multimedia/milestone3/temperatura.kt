fun main() {
    // Función principal 'main', punto de entrada del programa.

    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
    // Llama a la función 'printFinalTemperature' para convertir de Celsius a Fahrenheit.
    // Pasa 27.0 grados Celsius, especificando "Celsius" como unidad inicial y "Fahrenheit" como la final.
    // El tercer argumento es una lambda que contiene la fórmula de conversión de Celsius a Fahrenheit: (9/5 * Celsius) + 32.

    printFinalTemperature(350.0, "Kelvin", "Celsius") { it - 273.15 }
    // Llama a la función 'printFinalTemperature' para convertir de Kelvin a Celsius.
    // Pasa 350.0 grados Kelvin, con la fórmula para convertir Kelvin a Celsius: Kelvin - 273.15.

    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }
    // Llama a la función 'printFinalTemperature' para convertir de Fahrenheit a Kelvin.
    // Pasa 10.0 grados Fahrenheit, usando la fórmula de conversión: (5/9 * (Fahrenheit - 32)) + 273.15.
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    // Definición de la función 'printFinalTemperature', que acepta:
    // - 'initialMeasurement': la temperatura inicial.
    // - 'initialUnit': la unidad de medida inicial (Celsius, Fahrenheit, etc.).
    // - 'finalUnit': la unidad a la que se convertirá.
    // - 'conversionFormula': una función lambda que se utiliza para convertir la temperatura.

    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))
    // Se aplica la 'conversionFormula' a 'initialMeasurement' y el resultado se formatea a dos decimales.
    
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
    // Imprime el resultado en el formato deseado, mostrando la temperatura inicial y final con sus respectivas unidades.
}

