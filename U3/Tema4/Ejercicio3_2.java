package Tema4;

import java.util.Scanner;

public class Ejercicio3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		int num1  = teclado.nextInt();
		System.out.println("Introduzca el segundo numero");
		int num2  = teclado.nextInt();
		
		numComprendidos(num1,num2);
		teclado.close();
	}
	public static void numComprendidos(int n, int x) {
		for(int i=n; i<=x; i++) {
			System.out.print(i+".");
		}
	}
}
