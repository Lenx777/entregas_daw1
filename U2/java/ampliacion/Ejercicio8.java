package posible_examen;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el primer dia ");
		int dia1=teclado.nextInt();
		System.out.println("Introduzca el segundo dia");
		int dia2=teclado.nextInt();
		int contador=0;
		if(dia1>=1 && dia1<=7) {
			System.out.println("El primer dia introducido correctemente");
		}else {
			System.out.println("El dia tiene que estar entre 1 y 7");
			dia1=teclado.nextInt();
		}
		if((dia2>=1 && dia2<=7)&&(dia2>dia1)) {
			System.out.println("El segundo dia introducido correctemente");
		}else {
			System.out.println("El dia tiene que estar entre 1 y 7");
			dia2=teclado.nextInt();
		}
		for(int i=dia1; i<dia2; i++) {
			contador= i;
		}
		System.out.println("Han pasado estas horas entre los dias: "+(contador*24)+" 1Horas" );
	
		teclado.close();
	}

}
