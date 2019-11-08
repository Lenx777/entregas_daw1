package Tema4;

import java.util.Scanner;

public class Ejercicio3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el primer numero");
		int a= teclado.nextInt();
		System.out.println("Dime el segundo numero");
		int b= teclado.nextInt();
		if(numerosAmigos(a)==numerosAmigos(b)) {
			System.out.println("Los numeros son amigos");
		}else {
			System.out.println("Los numeros no son amigos");
		}
		teclado.close();
		
	}
	static int numerosAmigos(int num) {
		int suma=0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				suma= suma+i;
			}
		}
		return suma;
	}
	

}
