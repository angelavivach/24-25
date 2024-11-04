fun main() { 
    // Definición de la función principal 'main', que es el punto de entrada del programa.

    val morningNotification = 51
    // Se declara una variable 'morningNotification' y se le asigna el valor 51, 
    // que representa el número de notificaciones por la mañana.

    val eveningNotification = 135
    // Se declara una variable 'eveningNotification' y se le asigna el valor 135, 
    // que representa el número de notificaciones por la tarde.

    printNotificationSummary(morningNotification)
    // Se llama a la función 'printNotificationSummary' pasando la variable 'morningNotification' (51).
    // Esto imprimirá el resumen de notificaciones de la mañana.

    printNotificationSummary(eveningNotification)
    // Se llama a la función 'printNotificationSummary' pasando la variable 'eveningNotification' (135).
    // Esto imprimirá el resumen de notificaciones de la tarde.
}

fun printNotificationSummary(numberOfMessages: Int) {
    // Definición de la función 'printNotificationSummary' que toma un parámetro 'numberOfMessages' de tipo Int.
    // Este parámetro representa el número de mensajes (o notificaciones) que se desea procesar.

    if (numberOfMessages < 100) {
        // Condición 'if' que verifica si el número de mensajes es menor que 100.
        println("You have ${numberOfMessages} notifications.")
        // Si la condición se cumple (menos de 100 notificaciones), se imprime el mensaje con el número exacto de notificaciones.
    } else {
        // Bloque 'else', que se ejecuta si la condición anterior no se cumple (es decir, si hay 100 o más notificaciones).
        println("Your phone is blowing up! You have 99+ notifications.")
        // Si hay 100 o más notificaciones, se imprime un mensaje general que indica "99+ notificaciones".
    }
}
