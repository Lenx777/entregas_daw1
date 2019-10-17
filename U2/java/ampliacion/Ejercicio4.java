package posible_examen;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int contador=0;
		int contador_negativo=0;
		for(int i=0; i<10; i++) {
			System.out.println("introduce un numero");
			int num = teclado.nextInt();
			if(num>0) {
				contador++;
			}else {
				contador_negativo++;
			}
		}
		System.out.println("Hay "+contador+" positivos");
		System.out.println("Hay "+contador_negativo+" negativo");
		teclado.close();
	}

}
