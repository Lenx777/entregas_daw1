package posible_examen;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Random r = new Random();
		int min = 1000;
		int max= 9999;
		int contrasena = r.nextInt(max-min)+min;
		int contador =0;
		System.out.println("Introduzca la contraseña"+contrasena);
		int nueva_contrasena = teclado.nextInt();
		while(contrasena != nueva_contrasena && contador<3) {
			if(contrasena == nueva_contrasena) {
				System.out.println("Has fallado, vuelve a intentarlo");
			}
			System.out.println("Introduzca de  nuevo la contraseña");
			nueva_contrasena = teclado.nextInt();
			contador++;
		}
		contador++;
		if(contrasena== nueva_contrasena) {
			System.out.println("Enhorabuena has desbloqueado la caja fuerte");
		}else
			if(contador==4){
				System.out.println("Has superado el limite de intento, caja fuerte bloqueada");
				
			}
		teclado.close();
	}

}
