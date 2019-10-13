package tarea8;

import java.util.Scanner;

public class Ejercicio8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Di un numnero ");
		int num =  teclado.nextInt();
		for(int i=1; i<=num; i++) {
			System.out.println(i);
		}
		teclado.close();
	}

}
