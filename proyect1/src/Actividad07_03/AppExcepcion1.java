package Actividad07_03;

public class AppExcepcion1 {
  public static void main(String[] args) {
    try{
      metodo2();
      metodo1();
    } catch (Exception exception){
      System.out.println("La excepción se manejo en main");
    }
  }

  public static void metodo1() throws Exception {
    try{
      System.out.println("Metodo 1");
      throw new Exception();
    } catch (Exception exception) {
      System.out.println("La excepción se manejo en el metodo 1");
      throw exception;
    } finally {
      System.out.println("Se ejecuto finally en metodo 1");
    }
  }

  public static void metodo2() {
    try{
      System.out.println("Metodo metodo 2");
    } catch (Exception exception) {
      System.out.println(exception);
    } finally {
      System.out.println("Se ejecuto finally en motodo 2");
    }
    System.out.println("Fin del metodo 2");
  }
}
