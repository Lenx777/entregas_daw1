package Caja;

public class Etiqueta {
	//atributos 
	String nombre; 
	String direccion;
	int numero;
	
	//constructor
	Etiqueta (String nombre, String direccion, int numero){
		this.nombre=nombre;
		this.direccion=direccion;
		this.numero=numero;
	}
	
	//metodos
	@Override
	public String toString(){
		return (nombre+" "+direccion+" "+numero);
	}
}
