package CuentaPagar;

public abstract class Empleado implements PorPagar{
  private String primerNombre;
  private String apellidoPaterno;
  private String numeroSeguroSocial;

  public String getPrimerNombre() { return primerNombre; }
  public void setPrimerNombre(String primerNombre) { this.primerNombre = primerNombre; }

  public String getApellidoPaterno() { return apellidoPaterno; }
  public void setApellidoPaterno(String apellidoPaterno) { this.apellidoPaterno = apellidoPaterno; }

  public String getNumeroSeguroSocial() { return numeroSeguroSocial; }
  public void setNumeroSeguroSocial(String numeroSeguroSocial) { this.numeroSeguroSocial = numeroSeguroSocial; }

  public Empleado( String nombre, String apellido, String nss){
    primerNombre=nombre;
    apellidoPaterno=apellido;
    numeroSeguroSocial=nss;
  }
  
}
