package Emisora;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emisora e1= new Emisora(90);
		System.out.println(e1.pasarFrecuencia(e1.frecuencia));
		Emisora e2=new Emisora(109);
		System.out.println(e2.pasarFrecuencia(e2.frecuencia));
		Emisora e3=new Emisora(70);
		System.out.println(e3.pasarFrecuencia(e3.frecuencia));
	}

}
