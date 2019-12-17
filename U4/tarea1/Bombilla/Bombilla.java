package Bombilla;

public class Bombilla {
	//atributo
	boolean estado;
	boolean interruptor;
	//constructor
	Bombilla(boolean estado){
		this.estado=estado;
		interruptor=true;
	}
	//metodo
	boolean estadoBombilla(boolean estado) {
		boolean encendido=false;
		if(estado!=encendido) {
			System.out.println("La bombilla esta encendida");
			return encendido=true;
		}else {
			System.out.println("La bombilla esta apagada");
			return encendido=false;
		}
	}
	boolean interruptorGeneral(boolean estado) {
		boolean apagado=false;
		if(interruptor==true) {
			System.out.println("Apagon general, todas las bombillas apagadas");
			interruptor=false;
			this.estado=false;
			apagado=true;
		}
		
		if(interruptor==false) {
			System.out.println("Ha vuelto la luz, las bombillas vuelven a su estado");
			interruptor=true;
			this.estado=true;
			apagado=false;
		}
		return apagado;
		
	}
	
}
