package Tema4;

import java.util.Scanner;

public class Ejercicio3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un caracter");
		String caracter = teclado.next();
		System.out.println("¿Es vocal? "+saberCaracter(caracter));
		teclado.close();
		
	}
	static boolean saberCaracter(String caracter) {
		boolean vocal=false;
		if(caracter.equalsIgnoreCase("a")||caracter.equalsIgnoreCase("e")||caracter.equalsIgnoreCase("i")||
		   caracter.equalsIgnoreCase("o")||caracter.equalsIgnoreCase("u")) {
			vocal=true;
		}
		return vocal;
	}
}
