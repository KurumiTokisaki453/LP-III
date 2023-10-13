package ejerciciogpt01;

public class Gatogpt extends Animalgpt{
  private String colorPelage;

  public String getColorPelage() { return colorPelage; }
  public void setColorPelage(String pelage) { this.colorPelage=pelage; }

  public Gatogpt(){
    this.colorPelage="Color Desconocido";
    this.nombre="Sin nombre";
    this.edad=0;
  }
  
  public Gatogpt(String color,String name,int edad) {
    this.colorPelage= color;
    this.nombre=name;
    this.edad=edad;
  }

  public void hacerSonido(){
    System.out.println("¡Miau!");
  }
  @Override
  public String toString() {
    return "Gatogpt [Color=" + colorPelage + "]\n" +
        "Nombre: "+nombre+"\n" +
        "Edad: "+edad;
  }
}
