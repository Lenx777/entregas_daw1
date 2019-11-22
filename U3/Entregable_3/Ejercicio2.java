package Entregable_3;


import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int filas =4;
		int columnas=5;
		int[] [] curso= new int[filas][columnas];
		for(int i=0; i<filas; i++) {
			for (int pos=0;pos<columnas;pos++){
				System.out.print("Fila " + i + ", columna " + pos + ": ");
				curso[i][pos]=teclado.nextInt();
				}
		}
		
		  int sumaFila;
		    for(int i = 0; i <filas; i++) {
		      sumaFila = 0;
		      for(int j = 0; j < columnas; j++) {
		        System.out.printf("%7d   ", curso[i][j]);
		        sumaFila += curso[i][j];
		      }
		      System.out.printf("|%7d\n", sumaFila);
		    }
		    
		    // Muestra las sumas parciales de las columnas
		    for(int i = 0; i <filas; i++) {
		      System.out.print("----------");
		    }
		    System.out.println("-----------");

		    int sumaColumna;
		    int sumaTotal = 0;
		    for(int i= 0; i <columnas; i++) {
		      sumaColumna = 0;
		      for(int j = 0; j <filas; j++) {
		        sumaColumna += curso[j][i];
		      }

		      sumaTotal += sumaColumna;
		      System.out.printf("%7d   ", sumaColumna);
		    }
		    System.out.printf("|%7d   ", sumaTotal);
		    teclado.close();
		
	}
}

	
