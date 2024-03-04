package casa;

import java.util.ArrayList;

public class MainCasa {

	public static void main(String[] args) {
		System.out.println("-----Casa-----");
		Casa c1 = new Casa(new Direccion("Calle", "Shiny","Kanto" , 25369), 500000, true, 125, new Jardin(30, 2), new ArrayList<Habitacion> ());
		Casa c2 = new Casa(new Direccion("Avenida", "Ultraente","Alola" , 30029), 204303, false, 300, new Jardin(50, 500), new ArrayList<Habitacion>());
		
		new ArrayList<Habitacion> listaHabitacion;
		c1.setListaHabitaciones(new ArrayList<Habitacion>("4", 52, TipoHabitacion.BAÑO);
		
		//Métodos
		c1.calcularMetrosCuadrados();
		c2.calcularMetrosCuadrados();
		
		c1.esUnChalet();
		c2.esUnChalet();
		
		c1.precioCasaConIVA();
		c2.precioCasaConIVA();
	}

}
