package tarea5;

import java.util.Scanner;

public class Ejercicio5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println(" dime dos numero ");
		int x = teclado.nextInt();
		int z = teclado.nextInt();
		if (x%2==0 && z%2==0){
			System.out.println(" los dos son pares");
		}
		else{
			if (x%2==0){
			System.out.println("el primer numero es par");
		}
			else{
				System.out.println(" el segundo es par ");
			}
		teclado.close();
	}
}
}

