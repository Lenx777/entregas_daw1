package examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce el tamaño del array");
		int tam= teclado.nextInt();
		int [] array= new int [tam];
		for(int i=0; i<tam; i++) {
			System.out.println("Introduce un numero:");
			int num=teclado.nextInt();
			array[i]=num;
		}
		System.out.println("Estos son los numeros capicua de tu array: "+Arrays.toString(filtraCapicuas(array)));
		teclado.close();
		
	}
	public static int[] filtraCapicuas(int array2[]) {
		 long aux, inverso = 0, contador;
		 int numElem=array2.length;
		 for(int i=0; i<numElem; i++){
			  	aux = i;
		        while (aux!=0){
		            contador = aux % 10;
		            inverso = inverso * 10 + contador;
		            aux = aux / 10;
		        }
		        if(i==inverso) {
		        	array2[i]=array2[numElem-1];
					numElem--;
		        }
		 }
		 int[] tablaFinal=Arrays.copyOf(array2,numElem);
		 return tablaFinal;
	}
}
