package tarea6;

import java.util.Scanner;

public class Eejercicio6_4_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
	    System.out.println("Dime un numero" );
	    byte a = teclado.nextByte();
	    System.out.println("Dime otro numero" );
	    byte b = teclado.nextByte();
	    int resultado = (a>b)?1:0;
	    
	    System.out.println(resultado);
	    teclado.close();
	
	}

}
