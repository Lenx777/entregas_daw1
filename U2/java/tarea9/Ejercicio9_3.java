package tarea9;

import java.util.Scanner;

public class Ejercicio9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca la palabra");
		String  pal1 =  teclado.next();
		System.out.println("Di la palabra que crees que es");
		String pal2 =teclado.next();;
		while(!pal1.equals(pal2)){
			System.out.println("La longuitud de la palabra es: "+pal1.length());
			System.out.println("La primera letra de la palabre es: "+pal1.charAt(0));
			System.out.println("La ultima letra de l apalabra es: "+pal1.charAt(pal1.length()-1));
			if(pal2.length()>pal1.length()) {
				System.out.println("La longuitud de tu palabra es mas grande que la contraseña");
			}else {
				if (pal2.length()<pal1.length()) {
					System.out.println("La longuitud de tu palabra es mas pequeña que la contraseña");
			}
		}
			if(pal1!=pal2) {
				System.out.println("Palabra erronea, huelve a intentarlo");
				pal2 =teclado.next();
			}
			
		}
		System.out.println("Enhorabuena as acertado la palabra");
		teclado.close();
	}

}
