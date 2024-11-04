package repasoHerencia;

public class cliente extends padre{
	String ciudad;
	String pais;
	int edad;
	
	//constructor
	public cliente(String nombre, String apellido, String dni, int telefono, int id, String ciudad, String pais,
			int edad) {
		super(nombre, apellido, dni, telefono, id);
		this.ciudad = ciudad;
		this.pais = pais;
		this.edad = edad;
	}

	//getter y setter
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
