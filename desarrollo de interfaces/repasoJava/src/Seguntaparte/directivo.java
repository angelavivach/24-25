package Seguntaparte;

public class directivo extends padre{
	boolean salesiano;
	boolean turno;
	
	public directivo(String dNI, String nombre, String apellidos, int salario, boolean salesiano, boolean turno) {
		super(dNI, nombre, apellidos, salario);
		this.salesiano = salesiano;
		this.turno = turno;
	}

	public boolean isSalesiano() {
		return salesiano;
	}

	public void setSalesiano(boolean salesiano) {
		this.salesiano = salesiano;
	}

	public boolean isTurno() {
		return turno;
	}

	public void setTurno(boolean turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "directivo [salesiano=" + salesiano + ", turno=" + turno + "]";
	}
	
	
	

}
