package UMLVehiculos_AngelaVivancoDiaz;

public class Coche extends Vehiculo{
	protected boolean electrico;
	private boolean antiguo;
	
	//constructor
	public Coche(String marca, String color, String nBastidor, int kilometros, int aFabricacion, boolean electrico,
			boolean antiguo) {
		super(marca, color, nBastidor, kilometros, aFabricacion);
		this.electrico = electrico;
		this.antiguo = antiguo;
	}
	

	//getter y setter
	public boolean isElectrico() {
		return electrico;
	}

	public void setElectrico(boolean electrico) {
		this.electrico = electrico;
	}

	public boolean isAntiguo() {
		return antiguo;
	}

	public void setAntiguo(boolean antiguo) {
		this.antiguo = antiguo;
	}


	@Override
	public String toString() {
		return "coche electrico=" + (electrico ? "Si" : "No")+ ", antiguo=" + (antiguo ? "Sí" : "No") + "" ;
	}
	
	
}
