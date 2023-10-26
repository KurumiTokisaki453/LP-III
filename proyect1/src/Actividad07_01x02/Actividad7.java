package Actividad07_01x02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad7 {
  public static double cociente(double numerador, double denominador) throws ArithmeticException{
    return numerador/denominador;
  }
  public static void main(String[] args) {
    Scanner explorador= new Scanner(System.in);
    boolean flag=true;
    do{
      try{
        System.out.print("Introduzce un numerador entero: ");
        double numerador = explorador.nextDouble();
        System.out.print("Introduzca un denominador entero: ");
        double denominador = explorador.nextDouble();

        double resultado=cociente(numerador, denominador);
        System.out.printf("\nResultado: %.0f/%.0f = %.2f\n", numerador, denominador, resultado);
        // System.out.printf("\nResultado: %d/%d = %d\n", numerador, denominador, resultado); //enteros


        flag = false;
      } catch (InputMismatchException inputMismatchE) {
        System.out.printf("\nExcepción : %s\n",inputMismatchE);
        explorador.nextLine();
        System.out.println("Debe introducir enteros Intente de nuevo ...\n");
      } catch (ArithmeticException arithmeticE) {
        System.out.printf("\nExcepción : %s\n",arithmeticE);
        explorador.nextLine();
        System.out.println("Cero es un denominador invalido. Intente de nuevo ...\n");
      }
    } while (flag);
    explorador.close();
  }
}
