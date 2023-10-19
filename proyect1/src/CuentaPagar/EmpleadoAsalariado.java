package CuentaPagar;

public class EmpleadoAsalariado extends Empleado{
  private double salarioSemanal;

  public double getSalarioSemanal() { return salarioSemanal; }
  public void setSalarioSemanal(double salarioSemanal) { this.salarioSemanal = salarioSemanal; }

  public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario){
    super(nombre, apellido, nss);
    establecerSalarioSemanal(salario);
  }

  public void establecerSalarioSemanal(double semanal){ this.salarioSemanal=semanal; }
  public double obtenerSalarioSemanal(){
        return salarioSemanal; }

  @Override
  public double obtenerMontoPago(){
    return obtenerSalarioSemanal();
  }

  public String toString(){
    return
    "Empleado asalariado: "+getPrimerNombre()+" "+getApellidoPaterno()+
    "\nNumero de Seguro Social: "+getNumeroSeguroSocial()+
    "\nSalario Semanal: $" +String.format("%.2f",obtenerSalarioSemanal());
  }
  
}
