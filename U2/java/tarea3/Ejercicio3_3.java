package tarea3;

import java.util.Scanner;

public class Ejercicio3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero con decimal" );
        double a = teclado.nextDouble();
        System.out.println("Dime el segundo numero con decimal");
        double b = teclado.nextDouble();
        System.out.println("La division es "+(a/b));
        

        teclado.close();
	}

}
