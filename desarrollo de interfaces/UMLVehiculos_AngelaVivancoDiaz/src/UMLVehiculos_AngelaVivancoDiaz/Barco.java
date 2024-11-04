package UMLVehiculos_AngelaVivancoDiaz;

public class Barco extends Vehiculo{
	private int eslora;
	private int calado;
	private String tipoBarco; //v=vela , p=pesca, pj=pasajeros
	
	//constructor
	public Barco(String marca, String color, String nBastidor, int kilometros, int aFabricacion, int eslora, int calado,
			String tipoBarco) {
		super(marca, color, nBastidor, kilometros, aFabricacion);
		this.eslora = eslora;
		this.calado = calado;
		this.tipoBarco = tipoBarco;
	}

	//gettter y setter
	public int getEslora() {
		return eslora;
	}

	public void setEslora(int eslora) {
		this.eslora = eslora;
	}

	public int getCalado() {
		return calado;
	}

	public void setCalado(int calado) {
		this.calado = calado;
	}

	

	public String getTipoBarco() {
		return tipoBarco;
	}

	public void setTipoBarco(String tipoBarco) {
		this.tipoBarco = tipoBarco;
	}

	@Override
	public String toString() {
		return "Barco [eslora=" + eslora + ", calado=" + calado + ", tipoBarco=" + tipoBarco + "]";
	}



}
