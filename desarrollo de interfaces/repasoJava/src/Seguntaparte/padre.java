package Seguntaparte;

public class padre {
	String DNI,nombre,apellidos;
	int salario;
	
	//constructor
	public padre(String dNI, String nombre, String apellidos, int salario) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
	}

	//getter y setter
	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "padre [DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario + "]";
	}
	
	


	

}
