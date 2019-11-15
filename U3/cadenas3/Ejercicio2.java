package cadenas3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca una frase");
		String frase=teclado.nextLine();
		int contEspacios=0;
		for(int i=0; i<frase.length(); i++) {
			if(frase.charAt(i)==' ') {
				contEspacios++;
			}
		}
		System.out.println("Hay estos espacios: "+contEspacios);
		teclado.close();
	}

}
