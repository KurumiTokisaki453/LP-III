package bicycle;

public class TestBicycle {
  public static void main(String[] args) throws Exception {
    Bicycle a,b;
    a=new Bicycle("Adam Smith", 1);
    b=new Bicycle("Ben Jones",5);
    System.out.println(b.getOwnerName());
    System.out.println(a.getOwnerName());
  }
}
