package posible_examen;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un numero ");
		int num=teclado.nextInt();
		int i;
		for ( i=0;num>0;num/=10,i*=10) {
		    i+=num%10;

		}	
		System.out.println(i/10); 
		teclado.close();
	}

}
