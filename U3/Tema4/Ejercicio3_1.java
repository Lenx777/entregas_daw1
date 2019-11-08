package Tema4;

import java.util.Scanner;

public class Ejercicio3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca las veces que quieras repetir la palabra");
		int n  = teclado.nextInt();
		eco(n);
		teclado.close();
	}
	public static void eco(int n) {
		for(int i=0; i<n; i++) {
			System.out.print("Eco..");
		}
	}

}
