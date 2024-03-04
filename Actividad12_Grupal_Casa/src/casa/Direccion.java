package casa;

public class Direccion {
	String tipoVia;
	String nombreVia;
	String localidad;
	int codigoPostal;
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", localidad=" + localidad
				+ ", codigoPostal=" + codigoPostal + "]";
	}
	public Direccion(String tipoVia, String nombreVia, String localidad, int codigoPostal) {
		super();
		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.localidad = localidad;
		this.codigoPostal = codigoPostal;
	}
	public Direccion() {
		super();
	}
	
	
	
	
	
	
}
