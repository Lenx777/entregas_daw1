package tarea8;

import java.util.Scanner;

public class Ejercicio8_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Di un numnero  para el minimo del rango");
		int min =  teclado.nextInt();
		System.out.println("Dime un numero para el maximo del rango");
		int max = teclado.nextInt();
		System.out.println("Introduce un numero dentro del rango");
		int num = teclado.nextInt();
		do {

				if((num>=min)||(num<=max)){
					System.out.println("El numero esta fuera del rango");
				}
				num = teclado.nextInt();
			
		}while((num < min) || (num > max));
		System.out.println("El numero introducido esta dentro del rango");
		teclado.close();
	}

}
