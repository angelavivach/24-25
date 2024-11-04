package UMLVehiculos_AngelaVivancoDiaz;

public class Vehiculo {
	public String marca,color,nBastidor;
	public int kilometros;
	protected int aFabricacion;
	
	//constructor
	public Vehiculo(String marca, String color, String nBastidor, int kilometros, int aFabricacion) {
		super();
		this.marca = marca;
		this.color = color;
		this.nBastidor = nBastidor;
		this.kilometros = kilometros;
		this.aFabricacion = aFabricacion;
	}

	//getter y setter
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getnBastidor() {
		return nBastidor;
	}

	public void setnBastidor(String nBastidor) {
		this.nBastidor = nBastidor;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	public int getaFabricacion() {
		return aFabricacion;
	}

	public void setaFabricacion(int aFabricacion) {
		this.aFabricacion = aFabricacion;
	}

	@Override
	public String toString() {
		return "vehiculo [marca=" + marca + ", color=" + color + ", nBastidor=" + nBastidor + ", kilometros="
				+ kilometros + ", aFabricacion=" + aFabricacion + "]";
	}
	

}
