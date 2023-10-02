package Composicion;

public class Cuenta {
  
  private int numero;
  private double saldo;

  public int getNumero() { return this.numero; }
  public void setNumero(int numero) { this.numero = numero; }

  public double getSaldo(){ return this.saldo; }
  public void setSaldo(double saldo){ this.saldo=saldo; }

  public Cuenta (int numero, double saldo){
    this.numero = numero;
    this.saldo = saldo;
  }

  public Cuenta (int numero){
    this (numero,0);
  }

//setter y getter
@Override
public String toString() {
    return "Cuenta{" +
            "numero=" + numero +
            ", saldo=" + saldo +
            '}';
}

}