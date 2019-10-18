package tarea9;

import java.util.Scanner;

public class Ejercicio9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca la frase");
		String  pal1 =  teclado.nextLine();
		int  mitad =pal1.length()/2;
		String espacio = pal1.substring(mitad, mitad+1);
		String espacio2 =" ";
		if(espacio.equals(espacio2)) {
			System.out.println("Es un espacio");
		}else {
			System.out.println("No es un espacio");
		}
		
		
		teclado.close();
	}

}
