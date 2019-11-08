package Tema4;

import java.util.Scanner;

public class Ejercicio3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca numero para mostrar que divisores primos que tiene");
		int a = teclado.nextInt();
		divisoresPrimos(a);
		teclado.close();
		}
	static void divisoresPrimos(int num){
		int i,j;
		boolean primo = true;
		for (i=1;i<=num;i++){//recorro los numeros entre los que se divide
			if (num%i==0){//compruebo si son divisores
				for (j=2;j<i && primo;++j){/*si si que lo son entran en este for donde se comprueba si son primos, 
				*desde el 2 hasta el numero anterior del numero introducido, con una condicion booleana para que 
				*no cuantifique cada vez que haya un divisor varias veces, con comprobarlo una vez ya es primo
				*/
					if (i%j==0){				
						primo =false;
					}
					
				}
				if (primo){
					System.out.println (i+" es primo");
				}
			}
			}
	}

}
