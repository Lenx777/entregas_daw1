package tarea9;

import java.util.Scanner;

public class Ejercicio9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Javalín, javalón, introduzca su frase");
		String frase = teclado.nextLine();
		
		if (comprobarSiIdioma(frase)){
			System.out.println("Javalín, javalón, esta frase está en el idioma de Javalandia");
			System.out.println("Este es el texto traducido: "+traductor(frase));
		}else{
			System.out.println("Esta frase no está en el idioma de Javalandia javalén, len, len.");
		}
		teclado.close();
	}
	

	static boolean comprobarSiIdioma(String cadena){
		boolean javales = false;
		if ((cadena.contains("Javalín, javalón "))||(cadena.contains(" javalén, len, len"))){
			javales=true;
		}
		return javales;
	}
	static String traductor(String cadena){
		if (comprobarSiIdioma(cadena)){
			cadena = cadena.replace("Javalín, javalón ","");
			cadena = cadena.replace(" javalén, len, len","");
		}
		return cadena;
	}

}
