package examen;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un numero");
		int num= teclado.nextInt();
		System.out.println("Este es tu numero en codigo morse: "+convierteEnMorse(num));
		teclado.close();
	}
		public static String convierteEnMorse(int n) {
			String cadenaTotal="";
			String cadena=n+"";
			String cero="-----";
			String uno=".----";
			String dos="..---";
			String tres="...--";
			String cuatro="....-";
			String cinco=".....";
			String seis="-....";
			String siete="--...";
			String ocho="---..";
			String nueve="----.";
		
			if(cadena.contains("0")) {
				cadenaTotal= cadenaTotal+cero;
			}
			if(cadena.contains("1")) {
				cadenaTotal= cadenaTotal+uno;
			}
			if(cadena.contains("2")) {
				cadenaTotal= cadenaTotal+dos;
			}
			if(cadena.contains("3")) {
				cadenaTotal= cadenaTotal+tres;
			}
			if(cadena.contains("4")) {
				cadenaTotal= cadenaTotal+cuatro;
			}
			if(cadena.contains("5")) {
				cadenaTotal= cadenaTotal+cinco;
			}
			if(cadena.contains("6")) {
				cadenaTotal= cadenaTotal+seis;
			}
			if(cadena.contains("7")) {
				cadenaTotal= cadenaTotal+siete;
			}
			if(cadena.contains("8")) {
				cadenaTotal= cadenaTotal+ocho;
			}
			if(cadena.contains("9")) {
				cadenaTotal= cadenaTotal+nueve;
			}
			return cadenaTotal;
		}
			
}
