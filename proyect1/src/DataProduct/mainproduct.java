package DataProduct;
import java.util.Scanner;

public class mainproduct {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("\nIngrese la cantidad de objetos que desea agregar: ");
    int cantidadObjetos = NumPositivo(sc);
    Productos[] productos = new Productos[cantidadObjetos];
    
  
    agregarlist(sc, cantidadObjetos, productos);
    for (int i = 0; i < productos.length; i++) {
        System.out.println("\n" + "Producto " + (i + 1) + ": \n" + productos[i]);
    }


    System.out.print("Ingrese el número del producto que desea comprar: ");
    int numeroProducto = NumPositivo(sc);

    if (numeroProducto <= productos.length) {
      System.out.print("Ingrese la cantidad que quiere comprar: ");
      int numCantidad=NumPositivo(sc);
      productos[numeroProducto-1].Comprar(numCantidad);
      System.out.println("Información del Producto " + numeroProducto + ":");
        System.out.println(productos[numeroProducto - 1]);
    } else {
        System.out.println("Número de producto no válido.");
      }
      
    sc.close();
//----------------------------------------------------

  }
    public static void agregarlist(Scanner sc, int cantidadObjetos, Productos productos[]){

        for (int i = 0; i < cantidadObjetos; i++) {
        sc.nextLine(); // Consumir la nueva línea pendiente
        System.out.println("Ingrese los detalles del objeto " + (i + 1) + ".");

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Cantidad: ");
        int cantidad = NumPositivo(sc);

        System.out.print("Precio: ");
        double precio = doublePositivo(sc);

        productos[i] = new Productos(nombre, cantidad, precio);
    }
    }

    public static int NumPositivo (Scanner sc) {
      int cantidadObjetos;
      while (true) {
        try {
          cantidadObjetos = sc.nextInt();

          if (cantidadObjetos < 0) {
              throw new IllegalArgumentException("El número debe ser positivo.");
          }
          return cantidadObjetos;

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Ingrese un número válido.");
            sc.nextLine(); //Limpiar valores ingresados
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
      }
    }

    public static double doublePositivo (Scanner sc) {
    double cantidadObjetos;
    while (true) {
      try {
          
          cantidadObjetos = sc.nextDouble();

          if (cantidadObjetos < 0) {
              throw new IllegalArgumentException("El número debe ser positivo.");
          }
          return cantidadObjetos;

        } catch (java.util.InputMismatchException e) {
          System.out.println("Error: Ingrese un número válido.");
          sc.nextLine(); //Limpiar valores ingresados
        } catch (IllegalArgumentException e) {
          System.out.println("Error: " + e.getMessage());
            }
        }
    }
}