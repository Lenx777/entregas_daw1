package tarea6;

import java.util.Scanner;

public class Ejercicio6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero" );
        int a = teclado.nextInt();
        if (a%2 == 0) {
        	System.out.println("El numero es par");
        }else {
        	System.out.println("El numero es impar");
        }
        	
        teclado.close();
	}

}
