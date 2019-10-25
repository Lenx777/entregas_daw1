package prueba;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner teclado = new Scanner(System.in);
	        int alt=0;
	        do {
	            System.out.print("Introduce la altura de la figura: ");
	            alt=teclado.nextInt();
	        } while (alt%2==0 || alt<3);

	        String espacios="     ";
	        
	        for(int i=1;i<=alt;i=i+2) {
	            
	            for(int k=alt+1;k>=i;k=k-2) {
	                System.out.print(" ");
	            }
	 
	            for(int j=0;j<1;j++) {
	                System.out.print("*" + espacios + "*");
	            }
	            System.out.println();
	        }
	 
	        for(int i=alt;i>1;i=i-2) {

	            for(int k=i;k<=alt+2;k=k+2) {
	                System.out.print(" ");
	            }

	            for(int j=1;j>0;j--)
	            {
	                System.out.print("*" + espacios + "*");
	            }
	            System.out.println();
	        }
		teclado.close();
		
	}

}
