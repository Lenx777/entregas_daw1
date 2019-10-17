package posible_examen;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un numero");
		int num = teclado.nextInt();
		int a=0;
		int b=1;
		int c;
		for(int i=0; i<num; i++) {
			System.out.print(a+ " ");
			c= a+b;
			a=b;
			b=c;
		}
		teclado.close();
	}

}
