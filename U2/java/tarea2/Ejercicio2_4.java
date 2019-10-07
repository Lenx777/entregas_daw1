package tarea2;

import java.util.Scanner;

public class Ejercicio2_4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Dime el la longuitud");
    int a = teclado.nextInt();
    int milla = 1609;
    System.out.println("la distancia es " + a * milla + " KM ");
    teclado.close();
  }
}
