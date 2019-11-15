package cadenas3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca su nombre");
		String frase=teclado.nextLine();
		String vocales="[aeiouAEIOUáéíóúÁÉÍÓÚ]";
		String nombre=frase.replaceAll(vocales, "");
		System.out.println("Tu nombre sin vocales es: "+nombre);
		teclado.close();
	}

}
