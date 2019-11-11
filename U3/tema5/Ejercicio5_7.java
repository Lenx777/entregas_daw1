package tema5;

import java.util.Scanner;

public class Ejercicio5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int[] [] curso= new int[3][5];
		int media=0;
		int mediaAlumno=0;
		for(int i=0; i<3; i++) {
			for (int pos=0;pos<5;pos++){
				System.out.println("Introduzca las notas del alumno "+(pos+1)+" en el "+(i+1)+"º trimerstre.");
				curso[i][pos]=teclado.nextInt();
				}
		}
		for (int i=0;i<3;i++){
			for (int pos=0;pos<5;pos++){
			media=media+curso[i][pos];
		}
			System.out.println("La media es "+media/15);
			
			System.out.println("Introduzca el numero del alumno del que desea ver la media de sus notas");
			int alumno=teclado.nextInt();
			for (i=0;i<3;i++){
				mediaAlumno = mediaAlumno+curso[i][alumno-1];
			}
			System.out.println("La media del alumno introducido es "+mediaAlumno/3);
		
		
		teclado.close();
	}

}
}
