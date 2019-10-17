package tarea6;

import java.util.Scanner;

public class Ejercicio6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero entre el 1 y el 10" );
        int num = teclado.nextInt();
        switch(num) {
        case(1):
        	System.out.println("Deberias haber escrito uno");
        break;
        case(2):
        	System.out.println("Deberias haber escrito dos");
        break;
        case(3):
        	System.out.println("Deberias haber escrito tres");
        break;
        case(4):
        	System.out.println("Deberias haber escrito cuatro");
        break;
        case(5):
        	System.out.println("Deberias haber escrito cinco");
        break;
        case(6):
        	System.out.println("Deberias haber escrito seis");
        break;
        case(7):
        	System.out.println("Deberias haber escrito siete");
        break;
        case(8):
        	System.out.println("Deberias haber escrito ocho");
        break;
        case(9):
        	System.out.println("Deberias haber escrito nueve");
        break;
        case(10):
        	System.out.println("Deberias haber escrito diez");
        break;
        }
        teclado.close();
	}

}
