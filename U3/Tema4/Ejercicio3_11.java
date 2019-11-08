package Tema4;

import java.util.Scanner;

public class Ejercicio3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el numero a elevar");
		float a = teclado.nextFloat();
		System.out.println("Introduzca el numero sobre el que se eleva");
		int b = teclado.nextInt();

		System.out.println("Este es el resultado de la opcion recursiva "+recursividad(a,b));
		
		System.out.println("Este es el resultado de la opcion iterativa "+iteratividad(a,b));
		teclado.close();
	}

	static float recursividad(float n1,int n2){
	if (n2<=1){
		return n1;
	}else{
		return n1*recursividad(n1,(n2-1));
	}
}
	
	static float iteratividad(float n1, int n2){
		int i;
		float resul=1;
		for (i=1;i<=n2;i++){
			resul=(resul*n1);
		}
		return resul;
		}
	}
