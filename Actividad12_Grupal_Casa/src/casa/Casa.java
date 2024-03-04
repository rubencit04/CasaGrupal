package casa;

import java.util.ArrayList;

public class Casa {
	private Direccion direccion;
	private double precio;
	private boolean esSegundaMano;
	private double metrosCuadrados;
	private Jardin jardin;
	private ArrayList<Habitacion> listaHabitaciones;
	
	// TOSTRING
	@Override
	public String toString() {
		return "Casa [precio=" + precio + ", esSegundaMano=" + esSegundaMano + ", metrosCuadrados=" + metrosCuadrados
				+ ", listaHabitaciones=" + listaHabitaciones + "]";
	}
	
	//GETTER AND SETTERS

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isEsSegundaMano() {
		return esSegundaMano;
	}

	public void setEsSegundaMano(boolean esSegundaMano) {
		this.esSegundaMano = esSegundaMano;
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public Jardin getJardin() {
		return jardin;
	}

	public void setJardin(Jardin jardin) {
		this.jardin = jardin;
	}

	public ArrayList<Habitacion> getListaHabitaciones() {
		return listaHabitaciones;
	}

	public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}
	
	public void calcularMetrosCuadrados () {
		double sumadorMetros = 0;
		for (Habitacion s : listaHabitaciones) {
			sumadorMetros = sumadorMetros + s.getMetrosCuadrados();
		}
		double sumaTotalMetros = this.metrosCuadrados + this.jardin.getMetrosCuadrados() + sumadorMetros;
		System.out.println("Los metros cuadrados de la casa son : " + sumaTotalMetros);
	}
	
	

	
}
