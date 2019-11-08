package Tema4;

import java.util.Scanner;

public class Ejercicio3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la altura");
		float alt  = teclado.nextFloat();
		System.out.println("Introduzca el radio");
		float rad  = teclado.nextFloat();
		System.out.println("Introduzca 1 para el area del cilindor o 2 para el volumen del cilindro");
		int n= teclado.nextInt();
		switch(n){
		case(1):
			System.out.println("El area del cilindor es :"+calArea(rad,alt));
			break;
		case(2)	:
			System.out.println("EL volume del cilindor es: "+calVolumen(rad,alt));
		}
		teclado.close();
	}
		static  float calArea(float rad,float alt) {
			float area;
			area= (float) (2*Math.PI*rad*(alt+rad));
			return area;
		}
		static float calVolumen(float rad, float alt) {
			float volumen = (float) (Math.PI*Math.pow(rad, 2)*alt);
			return volumen;
		}

}
