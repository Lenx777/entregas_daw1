package tarea3;

import java.util.Scanner;

public class Ejercicio3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
        System.out.println("Dime la longuitud" );
        float a = teclado.nextFloat();
        int milla= 1609;
        System.out.println("Esta es la distancia "+(a*milla)+" KM");
        
        
        teclado.close();
	}

}
