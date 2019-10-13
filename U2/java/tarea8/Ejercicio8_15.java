package tarea8;

import java.util.Scanner;

public class Ejercicio8_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Di un numero");
		int x = teclado.nextInt();
		boolean primo =true;
		int j =0;
		int contador=0;
		for(int i=1 ; i<=x;i++) {
			primo = true;
			j = 2;
			while ((j<=i-1)&&(primo = true)){
				if(i%j ==0) {
					primo=false;
				}
				j++;
			}
			if(primo) {
				contador++;
				System.out.println(i+" Es primo ");
			}
		}
		System.out.println("De 1 a "+x+" hay "+contador+" Numeros primos ");
		teclado.close();
		
	}

}
