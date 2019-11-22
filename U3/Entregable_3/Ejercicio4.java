package Entregable_3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Di el tamañio del array");
		int tam=teclado.nextInt();
		int[] tabla = new int[tam];
		for(int i=0; i<tabla.length; i++) {
			System.out.println("Introduce el numero");
			tabla[i]=teclado.nextInt();
		}
		System.out.println("' "+convierteArrayEnString(tabla)+" '");
		teclado.close();
	}
	public static String convierteArrayEnString(int[] a) {
		String cadena="";

		for (int i = 0; i<a.length;i++) {
		    cadena = cadena + a[i];
		}

		return cadena;
	}

}
