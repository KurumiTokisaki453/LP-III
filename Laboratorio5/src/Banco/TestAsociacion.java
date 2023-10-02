package Banco;

public class TestAsociacion{
  public static void main(String[] args){
    Banco bcp = new Banco("BCP");
    Banco bbva = new Banco("BBVA", 30);
    System.out.println(bbva);
    System.out.println(bcp);
  }
}