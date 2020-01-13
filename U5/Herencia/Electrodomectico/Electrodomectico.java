package Electrodomectico;

public class Electrodomectico {
	//atributo
	protected int precio;
	protected Color color;
	protected Consumo consumo;
	protected int peso;

	//constructor
	Electrodomectico(int precio, Color color, Consumo consumo, int peso) {
		this.precio = precio;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}
	
	Electrodomectico (){
		this.precio= 100;
		this.color = Color.BLANCO;
		this.consumo = Consumo.F;
		this.peso = 5;
	}
	
	Electrodomectico (int precio, int peso){
		this.precio=precio;
		this.peso=peso;
		this.color=Color.BLANCO;
		this.consumo=Consumo.F;
	}

	public int getPrecio() {
		return precio;
	}

	public Color getColor() {
		return color;
	}

	public Consumo getConsumo() {
		return consumo;
	}

	public int getPeso() {
		return peso;
	}


	public int getPrecioFinal(){
		int preciofinal=0;
		
		switch (consumo) {
		  case A:
		  preciofinal=precio+100;
		    break;
		  case B:
			  preciofinal=precio+80;
		    break;
		  case C:
			  preciofinal=precio+60;
		    break;
		  case D:
			  preciofinal=precio+50;
		    break;
		  case E:
			  preciofinal=precio+30;
		    break;
		  case F:
			  preciofinal=precio+10;
		    break;
		}
	
		if(peso>=0 && peso<30){
			preciofinal=preciofinal+10;
		}
		if(peso>=30 && peso<50){
			preciofinal=preciofinal+60;
		}
		if(peso>=50 && peso<80){
			preciofinal=preciofinal+80;
		}
		if(peso>=80){
			preciofinal=preciofinal+100;
		}
		
		return preciofinal;
	}
	
	@Override
	public String toString(){
		return (this.color+" "+this.peso+" "+this.consumo+" "+this.precio+" "+this.getPrecioFinal());
	}
}
