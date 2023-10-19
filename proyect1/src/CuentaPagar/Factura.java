package CuentaPagar;

public class Factura implements PorPagar{
  private String numeroPieza;
  private String descripcionPieza;
  private int cantidad;
  private double precioPorArticulo;

  public String getNumeroPieza() { return numeroPieza; }
  public void setNumeroPieza(String numeroPieza) { this.numeroPieza = numeroPieza; }

  public String getDescripcionPieza() { return descripcionPieza; }
  public void setDescripcionPieza(String descripcionPieza) { this.descripcionPieza = descripcionPieza; }

  public int getCantidad() { return cantidad; }
  public void setCantidad(int cantidad) { this.cantidad = cantidad; }

  public double getPrecioPorArticulo() { return precioPorArticulo; }
  public void setPrecioPorArticulo(double precioPorArticulo) { this.precioPorArticulo = precioPorArticulo; }

  public Factura(String pieza, String descripcion, int cuenta, double precio){
    numeroPieza=pieza;
    descripcionPieza=descripcion;
    establecerCantidad(cuenta);
    establecerPrecioPorArticulo(precio);
  }

  public void establecerCantidad(int cantidades){ cantidad=cantidades; }
  public int obtenerCantidad(){ return cantidad; }

  public void establecerPrecioPorArticulo(double setprecio){ this.precioPorArticulo=setprecio; }
  public double obtenerPrecioPorArticulo() { return precioPorArticulo; }
  @Override
  public double obtenerMontoPago(){
    return obtenerCantidad() * obtenerPrecioPorArticulo();
  }
  public String toString() {
    return "Factura: \nNumero de pieza: "+numeroPieza+" ("+descripcionPieza+")"
    + "\nCantidad: " + cantidad
    + "\nPrecio por Artículo: " + precioPorArticulo;
  }
  
}
