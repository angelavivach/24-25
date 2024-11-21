package ejer2;

public class usoImprimible {

	  public static void main(String[] args) {
	        documento documento = new documento("Este es el contenido del documento...");
	        reporte reporte = new reporte("Reporte Mensual", "Este es el contenido del reporte...");

	        // Utilizando polimorfismo a través de la interfaz Imprimible
	        imprimirdocumento(documento);
	        imprimirreporte(reporte);
	    }

	    // Método genérico que acepta cualquier objeto que implemente Imprimible
	    public static void imprimirdocumento(imprimible  imprimible) {
	        imprimible.imprimir();
	        System.out.println(); // Salto de línea para separar las impresiones
	    }

	    // Método adicional para imprimir un Reporte
	    public static void imprimirreporte(imprimible imprimible) {
	        imprimible.imprimir();
	        System.out.println(); // Salto de línea para separar las impresiones
	    }
}