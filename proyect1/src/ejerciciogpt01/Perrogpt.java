package ejerciciogpt01;

public class Perrogpt extends Animalgpt{
  private String raza;

  public String getRaza(){ return raza; }
  public void setRaza(String entrada) { this.raza=entrada; }

  public Perrogpt(){
    this.raza="Desconocida";
    this.nombre="Sin nombre";
    this.edad=0;
  }
  
  public Perrogpt(String raza,String name,int edad){
    this.raza=raza;
    this.nombre=name;
    this.edad=edad;
  }

  public void hacerSonido(){
    System.out.println("¡Guau!");
  }

  @Override
  public String toString() {
    return "Perrogpt [raza=" + raza + "]\n" +
        "Nombre: "+nombre+"\n" +
        "Edad: "+edad;
  }
}