package tarea8;

import java.util.Scanner;

public class Ejercicio8_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Di un numero para hacer le dibujo");
		int x = teclado.nextInt();
		for(int i=1; i<=x;i++) {
			for(int j=i-1; j<x;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		teclado.close();
	}

}
