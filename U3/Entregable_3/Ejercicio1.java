package Entregable_3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner teclado = new Scanner(System.in);
				System.out.print("Introduzca el numero de comensales: ");
				int cant=teclado.nextInt();
				teclado.close();
				while(cant>4) {
					System.out.println("Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo"
							+ " e intente de nuevo");
					cant=teclado.nextInt();
				}
				int[][] tabla= new int[2][10];
				for(int i=0 ;i<2; i++) {
					for(int j=0; j<10;j++) {
						tabla[i][j]= teclado.nextInt();
					}
				}
	}

}
