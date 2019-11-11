package tema5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int t[][] = new int[5][5];
		int n,m;
		for (n=0;n<5;n++){
			for (m=0;m<5;m++){
			t[n][m]=n+m;
			}

		}
		
	System.out.println("Este es el contenido de la tabla");
	System.out.println(Arrays.deepToString(t));
	teclado.close();
	}

}
