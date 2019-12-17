package Reloj;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reloj h1=new Reloj(6,34,45);
		h1.setSegundos(35);
		System.out.println(h1.getHora()+":"+h1.getMinuto()+":"+h1.getSegundo());
	}

}
