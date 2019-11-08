package Tema4;

import java.util.Scanner;

public class Ejercicio3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el numero para calcular el factorial");
		int n = teclado.nextInt();
		System.out.println("Este es el factorial del numero introducido "+factorial(n));
		
		teclado.close();
		
	}
	
	static int factorial(int num){
		int resul;
		if (num==0){
			resul= 1;
		}else{
			resul= num*factorial(num-1);
		}
		return resul;
	}

}