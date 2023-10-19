package CuentaPagar;

public class InterfazPorPagar {
  public static void main(String[] args) {
    PorPagar[] objetosPorPagar=new PorPagar[4];
    objetosPorPagar[0]=new Factura("01234","asiento",2,375.00);
    objetosPorPagar[1]=new Factura("56789", "llanta", 5, 79.95);
    objetosPorPagar[2]=new EmpleadoAsalariado("John","Smith", "111-11-1111", 800.00);
    objetosPorPagar[3]=new EmpleadoAsalariado("Lisa", "Barnes", "888-88-8888", 1200.00);

  System.out.println("Facturas y Empleados procesados en forma polimorfica: \n");


    for (PorPagar porPagarActual : objetosPorPagar){
      if (porPagarActual != null) {
        System.out.println(String.format(
        "%s\n%s: $%.2f\n\n",
        porPagarActual.toString(),
        "pago vencido",porPagarActual.obtenerMontoPago()));
      } else {
        System.out.println("El objeto PorPagar es null.");
      }
    }
    
  }
}

// Declarar clase Prestamo que implemente la interfaz PorPagar.
// 'Prestamo' tendrá atributos 'numeroDeCuotas' y 'montoDeCuota'.
// Con su constructor respectivo, get, set, toString.
// return de método 'obtenerMontoPago' de Prestamo
//   dado por producto 'numeroDeCuotas' y 'montoDeCuota'.
// Modificar principal, para que incluya objeto Prestamo.
