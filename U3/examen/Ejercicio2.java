package examen;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce el primer numero");
		long num1 = teclado.nextLong();
		System.out.println("Introduce el segundo numero");
		long num2 = teclado.nextLong();
		System.out.println("Este es tu numero unido:"+juntaNumeros(num1,num2));
		teclado.close();
	}
		public static String juntaNumeros(long a, long b) {
			String cadena="";
			cadena=a+""+b;
			return cadena;
		}

}
