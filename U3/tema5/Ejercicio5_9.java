package tema5;

import java.util.Scanner;

public class Ejercicio5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int apuesta[] = new int[6];
		int ganadora[] = {01,23,29,31,35,42};
		int aciertos = 0;
		
		for (int i=0;i<6;i++){
			System.out.println("Introduzca numero en la posicion "+(i+1));
			apuesta[i]=teclado.nextInt();
			if (apuesta[i]==ganadora[i]){
				aciertos++;
			}
		}
		System.out.println("El numero de aciertos es "+aciertos);
		teclado.close();
	}

}
