package Examen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca numero de filas: ");
		int alt=teclado.nextInt();
		while(alt%2==0 || alt<5) {
			System.out.print("Altura erronea: ");
			alt=teclado.nextInt();
		}
		//linia principal
		for(int i=0; i<alt; i++) {
			System.out.print("M");
		}
		System.out.println("");
		//linea central
		for(int i=0; i<(alt-2)/2; i++) {
			System.out.print("M");
			for(int j=0; j<(alt-2); j++) {
				System.out.print(" ");
			}
			System.out.println("M");
		}
		System.out.print("");
		for(int i=0; i<alt; i++) {
			System.out.print("M");
		}
		System.out.println("");
		for(int i=0; i<(alt-2)/2; i++) {
			System.out.print("M");
			for(int j=0; j<(alt-2); j++) {
				System.out.print(" ");
			}
			System.out.println("M");
		}
		System.out.print("");
		//linia final
		for(int i=0; i<alt; i++) {
			System.out.print("M");
		}
		teclado.close();
	}

}