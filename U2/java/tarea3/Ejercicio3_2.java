package tarea3;
import java.util.Scanner;
public class Ejercicio3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el año de nacimiento" );
        short a =teclado.nextShort();
        System.out.println("Dime el año actual");
        short b = teclado.nextShort();
        System.out.println("Esta es tu edad "+(b-a));
         
        
        teclado.close();
	}

}
