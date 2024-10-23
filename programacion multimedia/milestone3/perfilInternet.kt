fun main() {
    val angela = Persona("Angela", 20, "gimnasio", null)
    val alba = Persona("Alba", 20, "padel", angela)

    angela.showProfile()
    alba.showProfile()
}

class Persona(val name: String, val age: Int, val hobby: String?, val referrer: Persona?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if(hobby != null) {
            print("Algo que te guste $hobby. ")
        }
        if(referrer != null) {
            print("Referido al nombre ${referrer.name}")
            if(referrer.hobby != null) {
                print(", que te gusta ${referrer.hobby}.")
            } else {
                print(".")
            }
        } else {
            print("No se a que te refieres.")
        }
        print("\n\n")
    }
}
