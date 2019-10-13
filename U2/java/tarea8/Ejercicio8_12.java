package tarea8;

import java.util.Scanner;

public class Ejercicio8_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		boolean suspenso = false;
		int contador =0;
		for(int i=1; i<=5; i++) {
			System.out.println("Di una nota");
			int nota =  teclado.nextInt();
			if(nota<=4) {
				suspenso = true;
				contador++;
						
			}
		}
		System.out.println("¿Ha habido algun suspenso?"+suspenso+". Hay estos suspensos "+contador);
		
		teclado.close();
	}

}
