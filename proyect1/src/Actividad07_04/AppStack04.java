package Actividad07_04;

public class AppStack04 {
  public static void main(String[] args) {
    try {
      metodo1();
    } catch (Exception exception) {
      System.out.printf("%s\n\n", exception.getMessage());
      exception.printStackTrace();

      StackTraceElement[] itemRastreo = exception.getStackTrace();
      System.out.println("\nRastreo de la pila de getStackTrace");
      System.out.println("Clase\t\t\tArchivo\t\tLinea\tMetodo");

      for (StackTraceElement item : itemRastreo) {
        System.out.printf("Class Name %s\t", item.getClassName());
        System.out.printf("File Name %s\t", item.getFileName());
        System.out.printf("Line Number%s\t", item.getLineNumber());
        System.out.printf("Method Name%s\t", item.getMethodName());
      }
    }
  }


  public static void metodo1() throws Exception {
    metodo2();
  }

  public static void metodo2() throws Exception {
    metodo3();
  }

  public static void metodo3() throws Exception {
    throw new Exception("La excepcion se lanzo");
  }
}
