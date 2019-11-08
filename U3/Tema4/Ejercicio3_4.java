package Tema4;

import java.util.Scanner;

public class Ejercicio3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		int num1  = teclado.nextInt();
		System.out.println("Introduzca el segundo numero");
		int num2  = teclado.nextInt();
		System.out.println("El numero mas grande es: "+numMayor(num1,num2));
		teclado.close();
	}
		public static int numMayor(int x, int y) {
			int resultado=0;
			if(x>y) {
				resultado=x;
			}else {
				resultado=y;
			}
			return resultado;
		}

}
