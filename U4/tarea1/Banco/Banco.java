package Banco;

public class Banco {
	
	//atributo
	double capital;
	String nombre;
	String direccion;
	//Constructor
	Banco(String nombre, String direccion){
		this.nombre=nombre;
		capital= 5.2;
		this.direccion=direccion;
	}
	//metodos
	 double nuevoCapital(double nuevoCapital) {
		double capital;
		capital=this.capital+nuevoCapital;
		return capital;
	}
	String nuevaDireccion(String direccion) {
		String nuevaDireccion="";
		this.direccion=nuevaDireccion;
		nuevaDireccion=direccion;
		return nuevaDireccion;
	}
		
}
