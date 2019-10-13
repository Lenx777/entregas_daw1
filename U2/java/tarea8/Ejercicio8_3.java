package tarea8;

import java.util.Scanner;

public class Ejercicio8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
	
		
		int x = (int) (Math.random()*101);
		System.out.println("Di un numnero");
		int num =  teclado.nextInt();
		do {
	
				if(num>x) {
					System.out.println("Te has pasado, el numero introducido es mayor");
				
				}else {
					if(num < x) {
						System.out.println("Te has acercado, El numero introducido es menor");

						}
					
				}
			

				num =  teclado.nextInt();	

		}while ((num != -1) && (num!=x));
		if(num==x) {
			System.out.println("Has acertado");
		}else {
			if(num==-1) {
		}
		
		
		System.out.println("Te has rendido");
			
		
			
		
		
	    teclado.close();

	}
	}
}
