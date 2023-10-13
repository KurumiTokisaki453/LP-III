package ejerciciogpt01;

// Define clase Animal con atributos y método que sean comunes a todos los animales.
// Crea subclases Perro y Gato que hereden de Animal y agreguen atributos y métodos específicos para cada uno.
// Instancia objetos de estas clases y muestra cómo acceder a sus métodos y atributos.
public class maingpt01 {
  public static void main(String[] args){
    System.out.println("");
    Perrogpt perro1= new Perrogpt("Dalmata","Dalmatita",5);
    System.out.println(perro1);
    perro1.hacerSonido();
    Gatogpt gato1=new Gatogpt("Blanco", "Michi", 3);
    System.out.println(gato1);
    gato1.hacerSonido();
    Animalgpt animalgpt=new Animalgpt("Halcon", 6);
    System.out.println(animalgpt);
    animalgpt.hacerSonido();
  }

}
