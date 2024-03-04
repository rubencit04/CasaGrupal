package casa;

public class Jardin {
	
	private double metrosCuadrados;
	private double numeroPlantas;
	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	public double getNumeroPlantas() {
		return numeroPlantas;
	}
	public void setNumeroPlantas(double numeroPlantas) {
		this.numeroPlantas = numeroPlantas;
	}
	public String toString() {
		return "Jardin [metrosCuadrados=" + metrosCuadrados + ", numeroPlantas=" + numeroPlantas + "]";
	}
	

}
