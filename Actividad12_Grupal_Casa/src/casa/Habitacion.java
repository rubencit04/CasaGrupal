package casa;

public class Habitacion {
	private String nombre;
	private double metrosCuadrados;
	private TipoHabitacion tipo;
	
	
	
	public Habitacion(String nombre, double metrosCuadrados, TipoHabitacion tipo) {
		super();
		this.nombre = nombre;
		this.metrosCuadrados = metrosCuadrados;
		this.tipo = tipo;
	}
	
	

	public Habitacion() {
		super();
	}



	// TO STRING
	@Override
	public String toString() {
		return "Habitacion [nombre=" + nombre + ", metrosCuadrados=" + metrosCuadrados + ", tipo=" + tipo + "]";
	}
	
	// GETTER AND SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public TipoHabitacion getTipo() {
		return tipo;
	}

	public void setTipo(TipoHabitacion tipo) {
		this.tipo = tipo;
	}
	
	
	
	

}
