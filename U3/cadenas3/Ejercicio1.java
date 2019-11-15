package cadenas3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String pal = "";
		String frase = "";
		String espacio =" ";
		
		do {
			System.out.println("Introduzca mas palabras");
			pal=teclado.nextLine();
			if(!pal.contains("fin")) {
				frase += espacio + pal;
			}
		} while(!pal.equalsIgnoreCase("fin"));
		
		System.out.println("ESTA ES LA FRASE FINAL: "+frase);
		teclado.close();
	}

}
