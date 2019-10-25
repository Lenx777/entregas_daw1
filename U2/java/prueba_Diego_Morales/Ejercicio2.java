package prueba;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long aux, inverso = 0, contador;
		 Scanner teclado = new Scanner(System.in);
		 System.out.println("Introduzca un numero");
		 long num = teclado.nextLong();
	    
	 
	        //le damos la vuelta al número
	        
	        aux = num;
	        while (aux!=0){
	            contador = aux % 10;
	            inverso = inverso * 10 + contador;
	            aux = aux / 10;
	        }
	 
	        if(num == inverso){
	            System.out.println("Es capicua");
	        }else{
	            System.out.println("No es capicua");
	        }
	        teclado.close();
	}

}
