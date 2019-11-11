package tema5;

import java.util.Scanner;

public class Ejercicio5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Di el tamaño del array");
		int tam = teclado.nextInt();
		int[] numero = new int[tam];
		int contPos=0;
		int totalPos=0;
		int contNeg=0;
		int totalNeg=0;
		int cero=0;
		for(int i=0; i<numero.length;i++) {
			System.out.println("Introduzca el  numero");
			int num1  = teclado.nextInt();
			numero[i]=num1;
		}
		for(int i=0; i<numero.length; i++) {
			if(numero[i]>0) {
				contPos=contPos+numero[i];
				totalPos++;
			}
			if(numero[i]<0) {
				contNeg=contNeg+numero[i];
				totalNeg++;
			}
			if(numero[i]==0) {
				cero++;
			}
		}
		System.out.println("Esta es la media de los positivos: "+contPos/totalPos);
		System.out.println("Esta es la media de los negativos: "+contNeg/totalNeg);
		System.out.println("Este es el total de ceros: "+cero);
		teclado.close();
	}

}
