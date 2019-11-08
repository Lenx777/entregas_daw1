package Tema4;

import java.util.Scanner;

public class Ejercicio3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el  numero");
		int num1  = teclado.nextInt();
		System.out.println("¿Es primo? "+primo(num1));
		teclado.close();
	}
	static boolean primo(int num) {
		boolean esPrimo= true;
		if(num==1) {
			return false;
		}
		for(int i=(int)Math.sqrt(num); i>0;i--) {
			if(num%i==0) {
				esPrimo=true;
			}
		}
		short cont=0;
		if(cont>=2) {
			esPrimo=false;
		}
		return esPrimo;
	}
}
