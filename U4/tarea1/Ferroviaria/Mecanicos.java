package Ferroviaria;

public class Mecanicos {
	//atributos
	private String nombre;
	private int telefono;
	private Especialidad especialidad;
	//constructor
	Mecanicos(String nombre,int telefono,Especialidad especialidad){
		this.nombre=nombre;
		this.telefono=telefono;
		this.especialidad=especialidad;
	}
	//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	
	//metodos
	public void mostrarInformacionMecanico(){
		System.out.println("Mecanico con nombre: "+this.nombre+" con telefono: "+this.telefono+" especializado en: "+this.especialidad);
	}
	
}
