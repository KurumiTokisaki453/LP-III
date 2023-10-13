package ejerciciogpt01;

public class Animalgpt {
  String nombre;
  int edad;
  public String getNombre() { return nombre; }
  public void setNombre(String nombre) { this.nombre = nombre; }

  public int getEdad() { return edad; }
  public void setEdad(int edad) { this.edad = edad; }

  public Animalgpt(){
    this.nombre="Sin nombre";
    this.edad=0;
  }
  public Animalgpt(String name,int edad){
    this.nombre=name;
    this.edad=edad;
  }

  public void hacerSonido(){
    System.out.println("Hace sonido desconocido");
  }
  @Override
  public String toString() {
    return "AnimalGPT: "+"Nombre: "+nombre+"\n" +
        "Edad: "+edad;
  }
}
