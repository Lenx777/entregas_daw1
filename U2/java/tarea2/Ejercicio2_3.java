package tarea2;

import java.util.Scanner;

public class Ejercicio2_3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Dime el primer valor");
    int a = teclado.nextInt();
    System.out.println("Dime el segundo valor");
    int b = teclado.nextInt();
    int division = a / b;
    System.out.println("La division es " + division);
    teclado.close();
  }
}
