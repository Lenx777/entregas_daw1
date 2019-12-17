package Ferroviaria;

public class JefeEstacion {
	//atributos
	private String nombre;
	private String dni;
	//constructor
	JefeEstacion(String nombre,String dni){
		this.dni=dni;
		this.nombre=nombre;
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
	
}
