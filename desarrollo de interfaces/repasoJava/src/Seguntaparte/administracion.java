package Seguntaparte;

public class administracion extends padre{
	String estudios;
	int antigüedad;
	
	public administracion(String dNI, String nombre, String apellidos, int salario, String estudios, int antigüedad) {
		super(dNI, nombre, apellidos, salario);
		this.estudios = estudios;
		this.antigüedad = antigüedad;
	}

	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	public int getAntigüedad() {
		return antigüedad;
	}

	public void setAntigüedad(int antigüedad) {
		this.antigüedad = antigüedad;
	}

	@Override
	public String toString() {
		return "administracion [estudios=" + estudios + ", antigüedad=" + antigüedad + "]";
	}

	@Override
	public String getDNI() {
		// TODO Auto-generated method stub
		return super.getDNI();
	}

	@Override
	public void setDNI(String dNI) {
		// TODO Auto-generated method stub
		super.setDNI(dNI);
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}

	@Override
	public String getApellidos() {
		// TODO Auto-generated method stub
		return super.getApellidos();
	}

	@Override
	public void setApellidos(String apellidos) {
		// TODO Auto-generated method stub
		super.setApellidos(apellidos);
	}

	@Override
	public int getSalario() {
		// TODO Auto-generated method stub
		return super.getSalario();
	}

	@Override
	public void setSalario(int salario) {
		// TODO Auto-generated method stub
		super.setSalario(salario);
	}
	
	
	

}
