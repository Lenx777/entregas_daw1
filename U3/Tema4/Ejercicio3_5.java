package Tema4;

import java.util.Scanner;

public class Ejercicio3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		int num1  = teclado.nextInt();
		System.out.println("Introduzca el segundo numero");
		int num2  = teclado.nextInt();
		System.out.println("Introduzca el tercero numero");
		int num3  = teclado.nextInt();
		System.out.println("El numero mas grande es: "+numMayor(num1,num2,num3));
		teclado.close();
	}
		public static int numMayor(int x, int y, int z) {
			int resultado=0;
			if(x>y && x>z) {
				resultado=x;
			}else {
				if(y>x && y>z) {
					resultado=y;
				}else {
					resultado=z;
				}
				
			}
			return resultado;
		}

}