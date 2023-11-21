package ExamIIFASEN3;
public class ClaseA{
  public static int x= 10;
  private int atributo1;
  public ClaseA(int a) { this.atributo1=a;}
  public ClaseA() {this(0);}
  public String mostrar() {return "A" + this.atributo1;}
}