package examen.repasoPOO;

public class coche extends vehiculo{
	int numeroPuertas;

	

	
	public coche(String marca, String modelo, int año, String i, int numeroPuertas) {
		super(marca, modelo, año, i);
		this.numeroPuertas = numeroPuertas;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	

	@Override
	public void setPropietario(String propietario) {
		// TODO Auto-generated method stub
		super.setPropietario(propietario);
	}

	@Override
	public String getMarca() {
		// TODO Auto-generated method stub
		return super.getMarca();
	}

	@Override
	public void setMarca(String marca) {
		// TODO Auto-generated method stub
		super.setMarca(marca);
	}

	@Override
	public String getModelo() {
		// TODO Auto-generated method stub
		return super.getModelo();
	}

	@Override
	public void setModelo(String modelo) {
		// TODO Auto-generated method stub
		super.setModelo(modelo);
	}

	@Override
	public int getAño() {
		// TODO Auto-generated method stub
		return super.getAño();
	}

	@Override
	public void setAño(int año) {
		// TODO Auto-generated method stub
		super.setAño(año);
	}

	@Override
	public String toString() {
		return "coche [numeroPuertas=" + numeroPuertas + "]";
	}

	
	

}
