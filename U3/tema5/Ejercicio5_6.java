package tema5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el tamaño de la tabla");
		int tam= teclado.nextInt();
		int[] tabla1= new int[tam];
		for(int i=0; i<tam; i++) {
			System.out.println("Introduzca numeros de la tabla");
			int num= teclado.nextInt();
			tabla1[i]=num;
		}
		System.out.println(Arrays.toString(sinRepetidos(tabla1)));;
		teclado.close();
	}
	static int[] sinRepetidos(int tabla[]) {
		int numElem= tabla.length;
		for(int i=0; i<numElem; i++) {
				for (int j=i+1; j<numElem; j++){
					if(tabla[i]==tabla[j]) {
						tabla[j]=tabla[numElem-1];
						numElem--;
					}
				}
		}
		int tablaFinal[]= Arrays.copyOf(tabla, numElem);
		return tablaFinal;
	}
		
}
