package Entregable_3;


import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Di el tamaño del array");
		int tam = teclado.nextInt();
		int [] tabla = new int[tam];
		for(int i=0; i<tam; i++) {
			System.out.println("Introduze el numero: ");
			tabla[i]=  teclado.nextInt();
		}
		System.out.println("Este es el numero devuelto al azar: "+aleatorioDeArray(tabla));
		teclado.close();
}
	public static int aleatorioDeArray(int[] a) {
		int cont=0;
		for(int i=0; i<a.length; i++) {
			i = (int) Math.floor(Math.random()*(a.length));
			cont=a[i];
		}
		return cont;
	}
}