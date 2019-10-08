package tarea5;

import java.util.Scanner;

public class Ejercicio5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el tiempo" );
        int tiempo = teclado.nextInt();
        final float G=(float)9.8;
        if (tiempo>0) {
        	System.out.println("La velocidad es de "+G*tiempo);
        }else {
        	System.out.println("El tiempo es incorecto, tiene que ser positivo o distinto de cero");
        }
        	
        teclado.close();
	}

}
