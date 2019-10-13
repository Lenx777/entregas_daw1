package tarea8;

import java.util.Scanner;

public class Ejercicio8_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Di un numero entre 1 y 10 sino te pasaras ");
		int x =  teclado.nextInt();
		if((x>1)&&(x<10)){
			for(int i=1; i<=10;i++) {
				System.out.println("La tabla de "+x+" es "+x+" * "+i+" = "+(x*i));
		}
			
		}else {
			System.out.println(" El numero esta fuera del rango");
		
		}
		teclado.close();
	}

}
