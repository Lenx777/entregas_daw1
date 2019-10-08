package tarea3;

import java.util.Scanner;

public class Ejercicio3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
        System.out.println("Dame el primer valor de dos digitos" );
        byte a = teclado.nextByte();
        System.out.println("Dame el primer valor de dos digitos" );
        byte b = teclado.nextByte()   ;
        int suma = a + b;
        System.out.println("La suma es " + suma);
        teclado.close();
	}

}
