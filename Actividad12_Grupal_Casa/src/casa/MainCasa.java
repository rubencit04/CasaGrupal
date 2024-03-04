package casa;

import java.util.ArrayList;

public class MainCasa {

	public static void main(String[] args) {
		Casa c1 = new Casa(new Direccion("Calle", "Shiny","Kanto" , 25369), 500000, true, 125, new Jardin(30, 2), new ArrayList<Habitacion> ());
		Casa c2 = new Casa(new Direccion("Avenida", "Ultraente","Alola" , 30029), 204303, false, 300, new Jardin(50, 500), new ArrayList<Habitacion>());

		//Métodos	
		c1.calcularMetrosCuadrados();
		c2.calcularMetrosCuadrados();
	}

}
