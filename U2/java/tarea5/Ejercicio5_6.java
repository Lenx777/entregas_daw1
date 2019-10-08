package tarea5;

import java.util.Scanner;

public class Ejercicio5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero" );
        int a = teclado.nextInt();
        System.out.println("Dime un numero" );
        int b = teclado.nextInt();
        System.out.println("Dime un numero" );
        int c = teclado.nextInt();
        if(a>b && a>c) {
        	System.out.println("A es el numero mayor");
        }else {
        	if(b>a && b>c) {
        		System.out.println("B es el numero mayor");
        	}else {
        		System.out.println("C es el numero mayor");
        	}
        }
        teclado.close();
	}

}
