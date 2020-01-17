package Entregable;

public class Ingredientes {
	//atributos
	
	private String nombre;
	private int calorias;
	
	//constructor
	public Ingredientes(String nomnbre,int calorias) {
		this.calorias=calorias;
		this.nombre= nombre;
	}
	
	//metodos
	public void mostrarInformacion() {
		System.out.println("El nombre del ingrediente es: "+this.nombre);
		System.out.println("Tiene estas calorias "+this.calorias+" cada 100G");
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCalorias() {
		return calorias;
	}
	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}
}
