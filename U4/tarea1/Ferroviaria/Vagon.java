package Ferroviaria;

public class Vagon {
	//atributo
	private int capMax;
	private int capActual;
	private Carga tipoCarga;
	//constructor
	Vagon(int capMax,int capActual, Carga tipoCarga){
		this.capActual=capActual;
		this.capMax=capMax;
		this.tipoCarga=tipoCarga;
	}
	//getter and setters
	public int getCapMax() {
		return capMax;
	}
	public void setCapMax(int capMax) {
		this.capMax = capMax;
	}
	public int getCapActual() {
		return capActual;
	}
	public void setCapActual(int capActual) {
		this.capActual = capActual;
	}
	public Carga getTipoCarga() {
		return tipoCarga;
	}
	public void setTipoCarga(Carga tipoCarga) {
		this.tipoCarga = tipoCarga;
	}
	
	//metodos
	
	
}
