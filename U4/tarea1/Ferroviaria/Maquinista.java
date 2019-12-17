package Ferroviaria;

public class Maquinista {
	//atributo
	private String nombre;
	private String dni;
	private int sueldo;
	private String rango;
	//metodo
	Maquinista(String nombre,String dni, int sueldo,String rango){
		this.dni=dni;
		this.nombre=nombre;
		this.rango=rango;
		this.sueldo=sueldo;
	}
	//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	public String getRango() {
		return rango;
	}
	public void setRango(String rango) {
		this.rango = rango;
	}
	//metodos
	public void mostrarInformacionMaquinista() {
		System.out.println("El maquinista de nombre: "+this.nombre+" con dni: "+this.dni);
		System.out.println("Con rango: "+this.rango+" Que cobra: "+this.sueldo);
		
	}
}
