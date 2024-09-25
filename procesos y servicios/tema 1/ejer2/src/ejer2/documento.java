package ejer2;

//Clase Documento implementando la interfaz Imprimible
public class documento implements imprimible {
 private String contenido;

 public documento(String contenido) {
     this.contenido = contenido;
 }

 public void imprimir() {
     System.out.println("Imprimiendo documento:");
     System.out.println(contenido);
 }
}

