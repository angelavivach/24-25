package UMLVehiculos_AngelaVivancoDiaz;

public class Avion extends Vehiculo{
	private int motores;
	private double velocidadMax;
	private boolean combate;
	
	//constructor
	public Avion(String marca, String color, String nBastidor, int kilometros, int aFabricacion, int motores,
			double velocidadMax, boolean combate) {
		super(marca, color, nBastidor, kilometros, aFabricacion);
		this.motores = motores;
		this.velocidadMax = velocidadMax;
		this.combate = combate;
	}
	
	//getter y setter
	public int getMotores() {
		return motores;
	}
	public void setMotores(int motores) {
		this.motores = motores;
	}
	public double getVelocidadMax() {
		return velocidadMax;
	}
	public void setVelocidadMax(double velocidadMax) {
		this.velocidadMax = velocidadMax;
	}
	public boolean isCombate() {
		return combate;
	}
	public void setCombate(boolean combate) {
		this.combate = combate;
	}
	@Override
	public String toString() {
		return "avion [motores=" + motores + ", velocidadMax=" + velocidadMax + ", combate=" + combate + "]";
	}
	
	

}
