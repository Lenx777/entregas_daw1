package tema5;

import java.util.Scanner;

public class Ejercicio5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int[] numero = new int[5];
		for(int i=0; i<numero.length;i++) {
			System.out.println("Introduzca el  numero");
			int num1  = teclado.nextInt();
			numero[i]=num1;
			
		}
		System.out.println("Estos son los numeros introducido: ");
		for(int i=0; i<numero.length; i++) {
			System.out.println(numero[i]);
		}
		
		
		
		teclado.close();
	}

}
