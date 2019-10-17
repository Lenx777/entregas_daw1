package posible_examen;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Diga la altura de la piramide");
		int altura = teclado.nextInt();
		System.out.println(" Diga con que quieres diujar la piramide");
		String asterisco = teclado.next();
		for(int i=1; i<altura; i++) {
			for(int j=1; j<altura-i; j++) {
				System.out.print(" ");
			}
			for(int caracter=1; caracter<=(i*2)-1; caracter++ ) {
				System.out.print(asterisco);
			}
			System.out.println();
		}
		
		teclado.close();
	}

}
