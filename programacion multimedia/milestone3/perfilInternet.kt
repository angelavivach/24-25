fun main() {
    // Función principal 'main', punto de entrada del programa.

    val angela = Persona("Angela", 20, "gimnasio", null)
    // Se crea un objeto de la clase 'Persona' llamado 'angela'. 
    // Tiene nombre "Angela", 20 años, el hobby "gimnasio", y no tiene un "referrer" (referido es null).

    val alba = Persona("Alba", 20, "padel", angela)
    // Se crea un objeto de la clase 'Persona' llamado 'alba'. 
    // Tiene nombre "Alba", 20 años, el hobby "padel", y el "referrer" es la persona 'angela'.

    angela.showProfile()
    // Llama al método 'showProfile()' para el objeto 'angela', 
    // que imprime su perfil con nombre, edad, y hobby (si tiene).

    alba.showProfile()
    // Llama al método 'showProfile()' para el objeto 'alba', 
    // que imprime su perfil con nombre, edad, hobby, y también el nombre y hobby de su "referrer" (angela).
}

class Persona(val name: String, val age: Int, val hobby: String?, val referrer: Persona?) {
    // Definición de la clase 'Persona' con cuatro propiedades: 
    // 'name' (nombre), 'age' (edad), 'hobby' (intereses o actividades que disfruta) y 'referrer' (referido a otra Persona).

    fun showProfile() {
        // Definición del método 'showProfile()' que imprime la información del perfil de la persona.

        println("Name: $name")
        // Imprime el nombre de la persona.

        println("Age: $age")
        // Imprime la edad de la persona.

        if(hobby != null) {
            // Verifica si el campo 'hobby' no es nulo, es decir, si la persona tiene un hobby asignado.
            print("Algo que te guste $hobby. ")
            // Si tiene un hobby, lo imprime.
        }

        if(referrer != null) {
            // Verifica si la persona tiene un 'referrer' (referido).
            print("Referido al nombre ${referrer.name}")
            // Si existe un 'referrer', imprime su nombre.

            if(referrer.hobby != null) {
                // Verifica si el 'referrer' también tiene un hobby asignado.
                print(", que te gusta ${referrer.hobby}.")
                // Si el 'referrer' tiene un hobby, lo imprime.
            } else {
                print(".")
                // Si el 'referrer' no tiene hobby, solo imprime un punto final.
            }
        } else {
            print("No se a que te refieres.")
            // Si no hay un 'referrer', imprime que no hay un referido.
        }
        
        print("\n\n")
        // Imprime dos líneas en blanco para separar perfiles visualmente.
    }
}

