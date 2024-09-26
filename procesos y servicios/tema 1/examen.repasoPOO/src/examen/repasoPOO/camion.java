package examen.repasoPOO;

public class camion extends vehiculo{
	int capacidadCarga;

	

	public camion(String marca, String modelo, int año, String i, int capacidadCarga) {
		super(marca, modelo, año, i);
		this.capacidadCarga = capacidadCarga;
	}

	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	

	@Override
	public String getPropietario() {
		// TODO Auto-generated method stub
		return super.getPropietario();
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
		return "camion [capacidadCarga=" + capacidadCarga + "]";
	}

	
	
	

}
