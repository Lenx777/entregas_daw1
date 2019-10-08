package tarea4;

import java.util.Scanner;

public class Ejercicio4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
        System.out.println("Dime la primera nota" );
        int nota1 = teclado.nextInt();
        System.out.println("Dime la segunda nota" );
        int nota2 = teclado.nextInt(); 
        System.out.println("Dime la tercera nota" );
        int nota3 = teclado.nextInt();
        float media = (nota1+nota2+nota3)/2;
        System.out.println("La media es " + media);
        teclado.close();
	}

}
