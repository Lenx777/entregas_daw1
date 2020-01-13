package Electrodomectico;

public class Television extends Electrodomectico {

	int resolucion;
	boolean tdt;
	
	Television(){
		super();
		resolucion=20;
		tdt=false;
	}
	
	Television(int precio, int peso){
		super (precio, peso);
		resolucion=20;
		tdt=false;
	}
	
	Television (int resolucion, boolean tdt){
		super();
		this.resolucion=resolucion;
		this.tdt=tdt;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean getTdt() {
		return tdt;
	}
	
	@Override
	public int getPrecioFinal(){
		double preciofinal=0;
		super.getPrecioFinal();
		if (this.resolucion>40){
			preciofinal=(preciofinal*1.3);
		}
		if (this.tdt==true){
			preciofinal=(preciofinal+50);
		}
		
		return (int)preciofinal;
	}
	
	@Override
	public String toString (){
		return (super.toString()+", que con el incremento por resolucion y tdt, pasa a ser un precio final de: "+this.getPrecioFinal());
		
	}
	
}

