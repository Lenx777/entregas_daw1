package recuperacion;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el numero");
		long num = teclado.nextInt();
		System.out.println("Introduzca la posicion a iniciar empezar");
		int inicio = teclado.nextInt();
		System.out.println("Introduzca  la posicion final");
		int fin = teclado.nextInt();
		trozoDeNumero(num,inicio,fin);
		teclado.close();
		
	}
	public static long trozoDeNumero(long x, int inicio, int fin) {
		long aux, inverso = 0, contador;
	     aux = x;
	        while (aux!=0){
	            contador = aux % 10;
	            inverso = inverso * 10 + contador;
	            aux = aux / 10;
	        }
	      return inverso;
	}
}
