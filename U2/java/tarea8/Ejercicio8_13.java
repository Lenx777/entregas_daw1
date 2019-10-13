package tarea8;

import java.util.Scanner;

public class Ejercicio8_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int suspenso=0;
		int aprobado =0;
		int condicionado=0;
		for(int i=1; i<=6; i++) {
			System.out.println("Di una nota");
			int nota =  teclado.nextInt();
			if(nota<4) {
				suspenso++;
			}else {
				if(nota==4) {
					condicionado++;
				}else {
					if(nota>=5) {
						aprobado++;
					}
				}
			}		
		}
	
		System.out.println("Han suspendido "+suspenso);
		System.out.println("Han aprobadio "+aprobado);
		System.out.println("Han condicionado "+condicionado);
		teclado.close();
	}

}
