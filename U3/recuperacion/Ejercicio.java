package recuperacion;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el numero de filas");
		int fila = teclado.nextInt();
		System.out.println("Introduzca el numero de columnas");
		int colum = teclado.nextInt();
		int t[][] = new int[fila][colum];
		int n,m;
		for (n=0;n<fila;n++){
			for (m=0;m<colum;m++){
			System.out.println("Introduzca los valores");
			int num= teclado.nextInt();
			t[n][m]=num;
			}

		}
		System.out.println("Introduzca el valor");
		int i = teclado.nextInt();
		System.out.println("Introduzca el valor");
		int j = teclado.nextInt();
		esPuntoDeSilla(t[][],i,j);
		teclado.close();
	}
	public static boolean esPuntoDeSilla(int x[][], int i, int j) {
		
	}

}
