package DataProduct;
import java.util.Scanner;

public class Productos {
  private String nameProduct;
  private int cantidad;
  private double precioInicial;
  private double precioFinal;
  private boolean mostrar;

  public String getNameProduct() { return nameProduct; }
  public void setNameProduct(String nameProduct) { this.nameProduct = nameProduct; }

  public int getCantidad() { return cantidad; }
  public void setCantidad(int cantidad) { this.cantidad = cantidad; }

  public double getPrecioInicial() { return precioInicial; }
  public void setPrecioInicial(double precioInicial) { this.precioInicial = precioInicial; }

  public double getPrecioFinal() { return precioFinal; }
  public void setPrecioFinal(double precioFinal) { this.precioFinal = precioFinal; }

  public boolean getMostrar() { return mostrar; }
  public void setMostrar(boolean mostrar) { this.mostrar=mostrar; }

  public Productos (String nameProduct,int cantidad,double precioInicial){
    this.nameProduct=nameProduct;
    this.cantidad=cantidad;
    this.precioInicial=precioInicial;
    this.precioFinal=precioInicial+(precioInicial*0.3);
  }
  public void mostrarTodo(){
    Scanner sc = new Scanner(System.in);
    System.out.print("\nIngrese la cantidad de objetos que desea agregar: ");
    int cantidadObjetos = NumPositivo(sc);
    Productos[] productos = new Productos[cantidadObjetos];
    
    agregarlist(sc, cantidadObjetos, productos);
    for (int i = 0; i < productos.length; i++) {
        System.out.println("\n" + "Producto " + (i + 1) + ": \n" + productos[i]);
    }
    sc.close();
  }

  public void Comprar(int compra){
    if (compra<=cantidad){
      this.cantidad-=compra;
    } else{
      System.out.println("No tenemos la cantidad deseada, puede probar con otros productos.");
    }
  }

  @Override
  public String toString() { 
    String space="------------------------------------------------";
    String s ="Nombre Producto: "+this.nameProduct+"\n"+
            "Cantidad:        " +this.cantidad + "\n" +
            "Precio Final:    " +this.precioFinal + "\n" + space;
      return s;
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

