package casa;

import java.util.ArrayList;

public class MainCasa {

	public static void main(String[] args) {
		System.out.println("-----Casa-----");
		Casa c1 = new Casa(new Direccion(), 500000, true, 125, new Jardin(), new ArrayList<Habitacion>());
		Casa c2 = new Casa(new Direccion(), 2000000, false, 247, new Jardin(), new ArrayList<Habitacion>());

		Habitacion h1 = new Habitacion();
		Habitacion h2 = new Habitacion();
		

		
		
		
		c1.calcularMetrosCuadrados();
		c2.calcularMetrosCuadrados();
	}

}
