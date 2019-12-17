package Texto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Texto c1 = new Texto(10,"hola");
		c1.añadirPalabraAlPrincipio("A");
		c1.añadirPalabraAlFinal("O");
		c1.añadirCaracterAlFinal("que tal");
		c1.añadirCaracterAlPrincipio("Buenas");
		System.out.println(c1.getPal());
		c1.totalVocales();
		
	}

}
