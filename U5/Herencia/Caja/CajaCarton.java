package Caja;

public class CajaCarton extends Caja {
	
	//atributo
	
	//constructor
	CajaCarton (int ancho, int alto, int fondo, Unidad u, Etiqueta etiqueta){
		super (ancho, alto, fondo, u, etiqueta);
	}
	
	//metodos 
	@Override
	public String toString (){
		return (super.toString()+" con el numero de etiqueta: "+etiqueta.numero);
	}
		
	@Override
	double getVolumen(){
		return (super.getVolumen()*0.8);
		}
	}

