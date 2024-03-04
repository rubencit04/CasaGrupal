package casa;

import java.util.ArrayList;

public class MainCasa {

	public static void main(String[] args) {
		System.out.println("-----Casa-----");
		 ArrayList<Habitacion> listaHabitacion1 = new ArrayList<>();
		 ArrayList<Habitacion> listaHabitacion2 = new ArrayList<>();
		Casa c1 = new Casa(new Direccion("Calle", "Shiny","Kanto" , 25369), 500000, true, 125, new Jardin(30, 2), listaHabitacion1);
		Casa c2 = new Casa(new Direccion("Avenida", "Ultraente","Alola" , 30029), 204303, false, 300, new Jardin(50, 500), listaHabitacion2);
		
		Habitacion habitacion1 = new Habitacion("2", 45, TipoHabitacion.BAÑO);
		Habitacion habitacion2 = new Habitacion("Salon grande", 100, TipoHabitacion.SALA_DE_ESTAR);
		listaHabitacion1.add(habitacion1);
		listaHabitacion1.add(habitacion2);
		
		//Métodos
		c1.calcularMetrosCuadrados();
		c2.calcularMetrosCuadrados();
		
		c1.esUnChalet();
		c2.esUnChalet();
		
		c1.precioCasaConIVA();
		c2.precioCasaConIVA();
	}

}
