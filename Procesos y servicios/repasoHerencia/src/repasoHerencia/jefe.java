package repasoHerencia;

public class jefe extends padre{
	String departamento;
	int claveAcceso;
	
	public jefe(String nombre, String apellido, String dni, int telefono, int id, String departamento,
			int claveAcceso) {
		super(nombre, apellido, dni, telefono, id);
		this.departamento = departamento;
		this.claveAcceso = claveAcceso;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getClaveAcceso() {
		return claveAcceso;
	}
	public void setClaveAcceso(int claveAcceso) {
		this.claveAcceso = claveAcceso;
	}
	
	

}
