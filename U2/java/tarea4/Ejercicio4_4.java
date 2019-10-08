package tarea4;

import java.util.Scanner;

public class Ejercicio4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero con decimal" );
        float a = teclado.nextFloat();
        System.out.println("El redondeo es de "+Math.round(a));
        teclado.close();
	}

}
