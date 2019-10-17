package tarea6;

import java.util.Scanner;

public class Ejercicio6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner teclado = new Scanner(System.in);
		        System.out.println("Dime el radio de la circunferencia" );
		        int x = teclado.nextInt();
		        final float pi =(float)3.14;
		        System.out.println("Esciba 1 su quieres saber el perimetro, 2 si quieres saber el perimetro y 3 para calcula el area");
		        int y = teclado.nextInt();
		        switch(y) {
		        case(1):
		        	System.out.println("El perimetro es: "+ (2*x));
		        break;
		        case(2):
		        	System.out.println("El perimetro es: "+ (2*pi*x));
		        break;
		        case(3):
		        	System.out.println("El area es: "+ (pi*Math.pow(x,2)));
		        	
		        }
		        
		        teclado.close();
	}

}
