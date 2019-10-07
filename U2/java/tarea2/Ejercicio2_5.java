package tarea2;

import java.util.Scanner;

public class Ejercicio2_5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Dime  la temperatura");
    int a = teclado.nextInt();
    int f = (9 * a / 5) + 32;
    System.out.println("la temperatura es " + f + " Fahrenheit  ");
    teclado.close();
  }
}
