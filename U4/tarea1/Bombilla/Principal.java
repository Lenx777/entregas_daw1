package Bombilla;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bombilla b1 = new Bombilla(true);
		Bombilla b2=new Bombilla(false);
		System.out.println(b1.estadoBombilla(b1.estado));
		System.out.println(b2.estadoBombilla(b2.estado));
		System.out.println(b1.interruptorGeneral(true));
		
	}

}
