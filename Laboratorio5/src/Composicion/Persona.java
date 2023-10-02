package Composicion;

public class Persona {
  private int id;
  private String nombre;
  private String apellido;
  private Cuenta cuenta;

  public int getId() {  return this.id;  }
  public void setId(int id){  this.id =  id;  }

  public String getNombre(){  return this.nombre;  }
  public void setNombre(String nombre){  this.nombre = nombre;  }

  public String getApelllido(){  return this.apellido;  }
  public void setApellido(String apellido){  this.apellido =apellido;  }

  public Cuenta getCuenta(){  return this.cuenta;  }
  public void setCuenta(Cuenta cuenta){  this.cuenta=cuenta; }

  public Persona(int id, String nombre, String apellido){
    this.id=id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.cuenta = new Cuenta(id);
  }

  //setter y getter
  @Override
  public String toString() {
    return "Persona{" + "id=" + id + ", nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' + ", cuenta=" + cuenta + '}';
  }
}
