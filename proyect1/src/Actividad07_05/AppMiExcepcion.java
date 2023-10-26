package Actividad07_05;

public class AppMiExcepcion {
  public static void main(String[] args) {
    validaPropia(5);
    validaPropia(11);
    validaPropia(10);

  }

  public static void validaPropia(int n) {
    try{ 
      minimo(n);
      System.out.println(n+" es mayor a 10. Me sirve XD");
    } catch (MiExcepcion e) {
      System.out.println("No me sirve ese número");
    }
  }

  public static void minimo(int numero) throws MiExcepcion {
    if (numero <= 10) {
      throw new MiExcepcion("Necesito un número mayor a 10.");
    }
  }
}
