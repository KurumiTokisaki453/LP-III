package Automovil;

public class TesAgregacion{
  public static void main(String[] args) {
        // Crear un objeto de la clase Motor
        Motor motor = new Motor(12345, 3000);

        // Crear un objeto de la clase Automovil
        Automovil automovil = new Automovil("ABC123", 4, "Toyota", "Camry");

        // Imprimir información del motor y el automóvil
        System.out.println("Información del motor:");
        System.out.println(motor);

        System.out.println("\nInformación del automóvil:");
        System.out.println(automovil);
    }
}
