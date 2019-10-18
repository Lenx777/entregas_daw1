package tarea9;

import java.util.Scanner;

public class Ejercicio9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Javal�n, javal�n, introduzca su frase");
		String frase = teclado.nextLine();
		
		if (comprobarSiIdioma(frase)){
			System.out.println("Javal�n, javal�n, esta frase est� en el idioma de Javalandia");
			System.out.println("Este es el texto traducido: "+traductor(frase));
		}else{
			System.out.println("Esta frase no est� en el idioma de Javalandia javal�n, len, len.");
		}
		teclado.close();
	}
	

	static boolean comprobarSiIdioma(String cadena){
		boolean javales = false;
		if ((cadena.contains("Javal�n, javal�n "))||(cadena.contains(" javal�n, len, len"))){
			javales=true;
		}
		return javales;
	}
	static String traductor(String cadena){
		if (comprobarSiIdioma(cadena)){
			cadena = cadena.replace("Javal�n, javal�n ","");
			cadena = cadena.replace(" javal�n, len, len","");
		}
		return cadena;
	}

}
