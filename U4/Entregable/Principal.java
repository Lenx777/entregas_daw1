package Entregable;

import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		Pizeria p = new Pizeria(Tama�o.Familiar);
		Ingredientes i =new Ingredientes("Queso",150);
		Pedido ped = new Pedido(p,i);
		String dia, mes, annio;   
		
		dia = Integer.toString(c.get(Calendar.DATE));
		mes = Integer.toString(c.get(Calendar.MONTH));
		annio = Integer.toString(c.get(Calendar.YEAR)); 
		
		System.out.println (dia + "/" + mes +"/" + annio);
		
		ped.mostrarInfomacion();
		p.a�adirIngrediente("jamon", 140);
		p.a�adirIngrediente("tomate", 140);
		p.a�adirIngrediente("cebolla", 140);
	}

}
