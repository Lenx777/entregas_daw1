 package posible_examen;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca numero de filas que tendrá la pirámide: ");
		int alt=teclado.nextInt();
		for(int i =0; i<alt-1;i++) {
			System.out.println("*");
		}
		for(int j=0; j<(alt/2)+1; j++) {
			System.out.print("*");
		}
		teclado.close();
	}

}
