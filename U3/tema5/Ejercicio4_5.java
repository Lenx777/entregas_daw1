package tema5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int tablaPrimero[] = new int[6];
		int tablaSegundo[] = new int[6];
		int tablaFusion[] = new int[12];
		int i;
		int contadorPrimero=0;
		int contadorSegundo=0;
		
		for (i=0;i<6;i++){
			System.out.println("Introduzca numeros de la primera tabla");
			tablaPrimero[i]=teclado.nextInt();
		}
		
		for (i=0;i<6;i++){
			System.out.println("Introduzca numeros de la segunda tabla");
			tablaSegundo[i]=teclado.nextInt();
		}
		for (i=0;i<12;i++){
			if ((contadorPrimero<=5)&&(contadorSegundo<=5)){
				if (tablaPrimero[contadorPrimero]<tablaSegundo[contadorSegundo]){
					tablaFusion[i]=tablaPrimero[contadorPrimero];
					contadorPrimero++;
				}else{
					tablaFusion[i]=tablaSegundo[contadorSegundo];
					contadorSegundo++;
				}
			}else{
				if (contadorPrimero==6){
					tablaFusion[i]=tablaSegundo[contadorSegundo];
					contadorSegundo++;
				}else {
					tablaFusion[i]=tablaPrimero[contadorPrimero];
					contadorPrimero++;
				}
			}
		}
		System.out.println("La tabla resultante es "+Arrays.toString(tablaFusion));
		teclado.close();
	}

}
