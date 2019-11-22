package Entregable_3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Di el tamaño: ");
		int tam = teclado.nextInt();
		int[] numero = new int[tam];
		for(int i=0; i<numero.length;i++) {
			System.out.println("Introduzca el  numero");
			int num1  = teclado.nextInt();
			numero[i]=num1;
		}
		filtraCon7(numero);
		teclado.close();
	}
	public int[] filtraCon7(int x[]) {
		for(int i=0; i<x.length; i++) {
			if(x[i].binarySearch(x[] i,7)) {
				
			}
		}
	}
}
