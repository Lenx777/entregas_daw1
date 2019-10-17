package posible_examen;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca numero de filas: ");
		int alt=teclado.nextInt();
		for(int i=0; i<alt-1; i++) {
			System.out.print("*");
			for(int j =0; j<2; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<1; i++) {
			System.out.print(" ");
			for(int j=0 ;j<2; j++) {
				System.out.print("*");
			}
		}
		teclado.close();
	}


}
