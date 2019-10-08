package tarea5;

import java.util.Scanner;

public class Ejercicio5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int b=12;
        System.out.println("Escribe el numero 12" );
        int a = teclado.nextInt();
        if (a==b) {
        	System.out.println("Correcto");
        }else {
        	System.out.println("Incorrecto");
        }
        	
        teclado.close();
	}

}
