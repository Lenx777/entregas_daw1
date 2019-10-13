package tarea8;

import java.util.Scanner;

public class Ejercicio8_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Di una altura");
		int x =  teclado.nextInt();
		int max =x;
		do {
			if(x>max) {
				max++;
			}
			System.out.println("di otra altura o escriba -1 para salir");
			x =  teclado.nextInt();
		}while(x!=-1);
		System.out.println("Este es el arbol mas grande es "+max);
		teclado.close();
	}

}
