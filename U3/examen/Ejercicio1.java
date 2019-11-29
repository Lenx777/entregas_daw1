package examen;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int alt= 9;
		int filas= 9;
		int [][] array= new int [alt][filas];
		for(int i=0;i<alt; i++){
			for(int j=0; j<filas; j++) {
				int num= (int) Math.floor(Math.random()*1000+1);
				array[i][j]=num;
			}
		}
		for(int i=0;i<alt; i++){
			for(int j=0; j<filas; j++) {
				System.out.print("-"+array[i][j]);
			}
			System.out.println("");
		}
		teclado.close();
	}
}
