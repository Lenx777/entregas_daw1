package Examen;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Scanner teclado = new Scanner(System.in);
			System.out.print("Introduce la frase ");
	        String pal=teclado.nextLine();
	        short contPal=0;
	        int vocal;
	        
	        
	        for(int i=0; i<pal.length(); i++) {
	        	vocal=pal.charAt(i);
	        	if(vocal== 'a' || vocal== 'A'|| vocal== 'e' || vocal== 'E'||vocal== 'i' || vocal== 'I'||
	        	   vocal== 'o' || vocal== 'O'||	vocal== 'u' || vocal== 'U') {
	        		contPal++;
	        	}
	        	
	        }
	        System.out.print("La cadena introducida es: "+pal);
	        System.out.println("");
	        System.out.print("La cantidad de vocales es: "+contPal);
	        teclado.close();
	}

}
