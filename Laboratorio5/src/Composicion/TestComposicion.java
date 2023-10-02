package Composicion;

public class TestComposicion {
  public static void main(String[] args) throws Exception {
    Persona per01 = new Persona(10,"Usuario 1","Apellido 2");
    Cuenta cuen01 = new Cuenta(1,200);
    System.out.println(per01);
    System.out.println(cuen01);
    
  }
}