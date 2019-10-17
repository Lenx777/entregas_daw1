package tarea6;

import java.util.Scanner;

public class Ejercicio6_3_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero" );
        int num = teclado.nextInt();
        int resultado = (num%2==0)?1:0;
        
        System.out.println(resultado);
        teclado.close();

}
}
