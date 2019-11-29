package examen;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce la altura");
		int alt= teclado.nextInt();
		System.out.println("Introduce el numero de filas");
		int filas= teclado.nextInt();
		int [][] array= new int [alt][filas];
		for(int i=0;i<alt; i++){
			for(int j=0; j<filas; j++) {
				System.out.println("introduce un numero en la columna "+i+" en la fila "+j+":");
				int num= teclado.nextInt();
				array[i][j]=num;
			}
		}
	
		corteza(array,alt,filas);
		teclado.close();
	}
	public static int[][] corteza(int[][] tabla,int alt, int filas) {
		for(int i=0;i<alt; i++){
			for(int j=0; j<filas; j++) {
				System.out.print(tabla[i][j]);
			}
			System.out.println("");
		}
		
		return tabla;
	}

}
