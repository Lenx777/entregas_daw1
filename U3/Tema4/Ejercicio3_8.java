package Tema4;

import java.util.Scanner;

public class Ejercicio3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca numero para verificar el numero de divisores primos que tiene");
		int a = teclado.nextInt();
		System.out.println("Este es el numero de divisores primos que tiene "+Primos(a));
		Primos(a);
		teclado.close();
		}
	static int Primos(int num){
		int i,j;
		int divisores = 1;//empiezo en 1 ya que todos los numeros son divisibles entre 1 que a su vez es primo
		boolean primo = true;
		for (i=1;i<=num;i++){//recorro los numeros entre los que se divide
			if (num%i==0){//compruebo si son divisores
				divisores++;//presumo que todos son primos por lo que cada vez que encuentro uno, sumo uno
				for (j=2;j<num && primo==true;++j){
					if (i%j==0){
						primo=false;
						divisores--;//resto los que no son primos
					}
					
				}
			}
		}
		

	return (divisores);			
	}
}
