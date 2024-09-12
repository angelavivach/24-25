package ejer2;

//Clase Reporte implementando la interfaz Imprimible
public class reporte implements imprimible {
private String titulo;
private String cuerpo;

public reporte(String titulo, String cuerpo) {
   this.titulo = titulo;
   this.cuerpo = cuerpo;
}


public void imprimir() {
   System.out.println("Imprimiendo reporte:");
   System.out.println("Título: " + titulo);
   System.out.println("Cuerpo: " + cuerpo);
}

}
