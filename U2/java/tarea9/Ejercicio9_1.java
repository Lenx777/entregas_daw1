package tarea9;

import java.util.Scanner;

public class Ejercicio9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Di una palabra");
		String  x =  teclado.next();
		System.out.println("Dime otra palabra");
		String  y =  teclado.next();
		if(x.length() > y.length()) {
			System.out.println("La palabra "+x+" es mayor");
		}else {
			System.out.println("La palabra "+y+" es mayor");
		}
		teclado.close();
	}

}
