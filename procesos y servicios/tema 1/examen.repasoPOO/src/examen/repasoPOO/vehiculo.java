package examen.repasoPOO;

public class vehiculo {
	private String marca;
	private String modelo;
	private int año;
	private String propietario;
	
	public vehiculo(String marca, String modelo, int año, String i) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.propietario = i;
		
	}
	
	


	




	public String getPropietario() {
		return propietario;
	}









	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}









	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	protected static void contador() {
		
	}









	@Override
	public String toString() {
		return "vehiculo [marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", propietario=" + propietario
				+ "]";
	}

    
	

}
