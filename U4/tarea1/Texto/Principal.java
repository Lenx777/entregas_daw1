package Texto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Texto c1 = new Texto(10,"hola");
		c1.a�adirPalabraAlPrincipio("A");
		c1.a�adirPalabraAlFinal("O");
		c1.a�adirCaracterAlFinal("que tal");
		c1.a�adirCaracterAlPrincipio("Buenas");
		System.out.println(c1.getPal());
		c1.totalVocales();
		
	}

}
