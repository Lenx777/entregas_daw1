package tarea8;

import java.util.Scanner;

public class Ejercicio8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la edad" );
		int edad = teclado.nextInt();
		int sumedad=0;
		int media =0;
		int mayoredad =0;
		while(edad>0) {
			System.out.println("Introduzca otra edad o una edad negativa para acabar el programa");
			edad = teclado.nextInt();
			sumedad = sumedad +  edad;
			media = media + edad;
			if(edad>=18) {
				mayoredad++;
			}
			
			
		}
		System.out.println("Este es el total e edades:"+ sumedad);
		System.out.println("Esta es la media  de las edades:"+ media/2);
		System.out.println("Estos son mayores de edad:"+ mayoredad);
        teclado.close();
	}

}
