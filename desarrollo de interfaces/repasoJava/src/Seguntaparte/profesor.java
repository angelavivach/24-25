package Seguntaparte;

public class profesor extends padre {
	int nAsignaturas;
	boolean tutor;
	
	//constructor
	public profesor(String dNI, String nombre, String apellidos, int salario, int nAsignaturas, boolean tutor) {
		super(dNI, nombre, apellidos, salario);
		this.nAsignaturas = nAsignaturas;
		this.tutor = tutor;
	}


	//getter y setter
	public int getnAsignaturas() {
		return nAsignaturas;
	}

	public void setnAsignaturas(int nAsignaturas) {
		this.nAsignaturas = nAsignaturas;
	}

	public boolean isTutor() {
		return tutor;
	}

	public void setTuror(boolean turor) {
		this.tutor = tutor;
	}


	@Override
	public String toString() {
		return "profesor [nAsignaturas=" + nAsignaturas + ", tutor=" + tutor + "]";
	}
	
	

}
