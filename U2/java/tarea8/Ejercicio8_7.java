package tarea8;

import java.util.Scanner;

public class Ejercicio8_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Di un numnero ");
		int num =  teclado.nextInt();
		int res = 1;
		for(int i=num; i>0; i--) {
			res = i*res;
		}
		System.out.println(res);
		teclado.close();
	}

}
