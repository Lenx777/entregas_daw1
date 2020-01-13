package Electrodomectico;

public class Lavadora extends Electrodomectico implements Comparable<Lavadora> {

	
	//atributos
	int carga;
	
	//constructor
	Lavadora(){
		super();
		this.carga=5;
	}
	
	Lavadora(int precio, int peso){
		super(precio, peso);
		this.carga=5;
	}
	
	Lavadora(int carga){
		super();
		this.carga=carga;
	}

	//metodos
	public int getCarga() {
		return carga;
	}
	
	@Override
	public int getPrecioFinal (){
		int preciofinal=0;
		super.getPrecioFinal();
		
		if (this.carga >30){
			preciofinal=preciofinal+50;
		}
		
		return preciofinal;
	}
	
	@Override
	public String toString (){
		return (super.toString()+", que con el incremento por carga, pasa a ser un precio final de: "+this.getPrecioFinal());
		
	}

	@Override
	public int compareTo(Lavadora lav) {
		return(this.carga-lav.carga);
	}
}