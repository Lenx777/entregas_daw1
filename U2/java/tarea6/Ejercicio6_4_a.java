package tarea6;

import java.util.Scanner;

public class Ejercicio6_4_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero" );
        byte a = teclado.nextByte();
        System.out.println("Dime otro numero" );
        byte b = teclado.nextByte();
        if (a>b) {
        	System.out.println("B es menor que A");
        }else {
        	System.out.println("A es menor que B");
        }
        	
        teclado.close();
	}

}
