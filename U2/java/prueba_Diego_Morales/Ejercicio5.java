package prueba;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la palabra");
		String pal= teclado.next();
		int max =pal.length();
	        int i=0,j=0,k=0;
	 
	        // Si el valor recibido es par, le añadimos uno
	        if(max%2==0)
	        {
	            max++;
	        }
	 
	        // parte superior del rombo
	        for(i=1;i<=max;i=i+2)
	        {
	            // Añadimos los espacios necesarios delante de cada linea
	            for(k=max+1;k>=i;k=k-2)
	            {
	                System.out.print(" ");
	            }
	            // Mostramos los asteriscos
	            for(j=0;j<i;j++)
	            {
	                System.out.print(pal);
	            }
	            System.out.println();
	        }
	        //parte inferior del rombo
	        for(i=max;i>=1;i=i-2)
	        {
	            // Añadimos los espacios necesarios delante de cada linea
	            for(k=i;k<=max+2;k=k+2)
	            {
	                System.out.print(" ");
	            }
	            // Mostramos los asteriscos
	            for(j=i-2;j>0;j--)
	            {
	                System.out.print(pal);
	            }
	            System.out.println();
	        }
	        teclado.close();
	}

}
