package repasoHerencia;

public class administrador extends padre{
    String cargo;
    String duracion;
    
 //constructor 
	public administrador(String nombre, String apellido, String dni, int telefono, int id, String cargo, String duracion) {
		super(nombre, apellido, dni, telefono, id);
		this.cargo = cargo;
		this.duracion = duracion;
	}
	
	//getter y setter
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
    
    
}