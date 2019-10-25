package prueba;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
        System.out.println("Dame la primera nota" );
        int nota1 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Dame la segunda nota" );
        int nota2 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Dame la tercera nota" );
        int nota3 = teclado.nextInt();
        teclado.nextLine();
        float media =(float)(nota1+nota2+nota3)/3;
        String recuperacion;
        if(media>=5 && media<6) {
        	System.out.println("Tiene de media un: "+media+" Suficiente");
        }else {
        	if(media>=6 && media<7) {
        		System.out.println("Tiene de media un: "+media+" Bien");
        	}
        	else {
        		if(media>=7 && media<9 ) {
            		System.out.println("Tiene de media un: "+media+" Notable");
            	}
        		else {
        			if(media>=9) {
        				System.out.println("Tiene de media un: "+media+" Sobresaliente");
        			}
            
            }
        }	
        	
        }
        if(media<5) {
        	System.out.println("El alumno a suspendido y tiene que ir a recuperacion");
        	System.out.println("Indica el resultado del alumno: apto si a aprobado y no apto si a suspendido");
        	recuperacion = teclado.nextLine();
        	 switch(recuperacion) {
        	 case "apto":
        		 System.out.println("El alumno a recuperado: "+recuperacion+" su nota es de 5");
        		 break;
        	 case "no apto":
        		 System.out.println("El alumno no a recuperado, su media es de: "+media);
        		 break;
        	 }
        }
        	
        teclado.close();
	}

}
