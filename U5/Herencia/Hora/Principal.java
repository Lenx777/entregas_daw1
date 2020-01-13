package Hora;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hora h = new Hora(19,23);
		Hora12 h12= new Hora12(1,0);
		HoraExacta he1= new HoraExacta(21,45,56);
		HoraExacta he2= new HoraExacta(12,12,12);
		HoraExacta he3= new HoraExacta(12,12,12);
		h.inc(12);
		System.out.println("La hora es: "+h.toString());
		System.out.println("Hora12 es: "+h12.toString() );
		he1.inc();
		
	}

}
