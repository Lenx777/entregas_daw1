package posible_examen;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca numero de filas: ");
		int alt=teclado.nextInt();
		while(alt%2==0 || alt<3) {
			System.out.print("Altura erronea: ");
			alt=teclado.nextInt();
		}
		for (int i=1; i<=alt; i++) {
			for(int j=1; j<=alt ; j++) {
				if(i==j || j==(alt-i)+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		teclado.close();
	}

}
