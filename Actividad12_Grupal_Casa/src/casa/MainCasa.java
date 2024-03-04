package casa;

public class MainCasa {

	public static void main(String[] args) {
		System.out.println("-----Casa-----");
		Casa c1 = new Casa();
		Casa c2 = new Casa();
		Direccion d1 = new Direccion();
		Direccion d2 = new Direccion();
		Jardin  j1 = new Jardin();
		Jardin j2 = new Jardin();
		Habitacion h1 = new Habitacion();
		Habitacion h2 = new Habitacion();
		
		//Metros cuadrados
		c1.setMetrosCuadrados(125);
		c2.setMetrosCuadrados(247);
		//Segunda Mano
		c1.setEsSegundaMano(true);
		c2.setEsSegundaMano(false);
		//Precio
		c1.setPrecio(500000);
		c2.setPrecio(2000000);
		//Direccion
		d1.setCodigoPostal(0);  
		d1.setLocalidad(null);  
		d1.setNombreVia(null); 
		d1.setTipoVia(null);
		d2.setCodigoPostal(0);  
		d2.setLocalidad(null);  
		d2.setNombreVia(null); 
		d2.setTipoVia(null);
		//
		
		
		
		c1.calcularMetrosCuadrados();
		c2.calcularMetrosCuadrados();
	}

}
