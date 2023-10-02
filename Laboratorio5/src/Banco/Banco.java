package Banco;

import Composicion.Persona;

public class Banco extends Persona{
  private String nombre;
  private Persona clientes[];
  private int contadorClientes;

  public Banco (String nombre){
    this (nombre,1);
  }
  public Banco (String nombre, int numCli){
    this.nombre=nombre;
    this.clientes=new Persona[numCli];
  }

  public void setcontadorClientes(int contadorClientes) { this.contadorClientes=contadorClientes;}
  public int getContadorClientes (){ return contadorClientes;}

  public void setNombre(String nombre) { this.nombre = nombre; }
  public String getNombre() { return nombre; }

  public void setClientes(Persona[] clientes) { this.clientes = clientes; }
  public Persona[] getClientes() { return clientes; }

  public void agregarCliente(Persona persona) {
      if (contadorClientes < clientes.length) {
          clientes[contadorClientes] = persona;
          contadorClientes++;
          System.out.println("Cliente agregado correctamente.");
      } else {
          System.out.println("No se pueden agregar más clientes, la lista está llena.");
      }
    }

  public void darBajaCliente(int id) {
      for (int i = 0; i < contadorClientes; i++) {
          if (clientes[i] != null && clientes[i].getId() == id) {
              for (int j = i; j < contadorClientes - 1; j++) {
                  clientes[j] = clientes[j + 1];
              }
              clientes[contadorClientes - 1] = null;
              contadorClientes--;
              System.out.println("Cliente dado de baja correctamente.");
              return;
          }
      }
      System.out.println("Cliente no encontrado.");
  }
  public void clientesTipo (char tipo){
    System.out.println("d");
  }

  @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Banco: ").append(nombre).append("\n");
        sb.append("Número de clientes: ").append(contadorClientes).append("\n");
        sb.append("Clientes:\n");
    
        for (int i = 0; i < contadorClientes; i++) {
            sb.append(clientes[i]).append("\n");
        }
        return sb.toString();
    }

  public static void main(String[] args) {
    Banco miBanco = new Banco("Mi Banco", 10);

    // Crear algunos clientes
    Persona cliente1 = new Persona(1, "Juan", "Perez");
    Persona cliente2 = new Persona(2, "Maria", "Gomez");

    // Agregar clientes al banco
    miBanco.agregarCliente(cliente1);
    miBanco.agregarCliente(cliente2);
}
}
