package tarea8;

import java.util.Scanner;

public class Ejercicio8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un numero" );
		int x = teclado.nextInt();
		while(x!=0) {
			 if(x%2==0 && x>0) {
				 System.out.println("El numero es par " );
				 System.out.println("Este es su cuadrado "+ Math.pow(x,2));
				 System.out.println("El numero es positivo ");
				 x = teclado.nextInt();
				
			 }
			 if(x%2!=0){
				 System.out.println("El numero es impar");
				 System.out.println("Este es su cuadrado "+ Math.pow(x,2));
				 System.out.println("El numero es positivo ");
				 x = teclado.nextInt();
			 }

		}
		System.out.println("As introducido un cero asi que as acabado");
			
		
       
        teclado.close();
	}


}
