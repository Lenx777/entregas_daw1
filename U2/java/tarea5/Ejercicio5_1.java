package tarea5;

import java.util.Scanner;

public class Ejercicio5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero" );
        int a = teclado.nextInt();
        if (a>= 0) {
        	System.out.println("El numero es mayor");
        }else {
        	System.out.println("El numero es menor");
        }
        	
        teclado.close();
	}

}
