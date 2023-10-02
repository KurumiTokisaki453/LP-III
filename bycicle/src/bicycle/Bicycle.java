package bicycle;

public class Bicycle {
  static int count;
  private String ownerName;
  private float distance;
  private String idBicy;
  public Bicycle (String ownerName, int distance){
    this.ownerName=ownerName;
    this.distance=distance;
    counter();
    String tempId =String.valueOf(10000*count);
    this.idBicy = ownerName.substring(0,2)+tempId.substring(1);
  }
  public String getOwnerName(){
    return this.ownerName;
  }
  public float getDistance(){
    return this.distance;
  }
  public void distanceTraveled (int meters){
    this.distance+=meters;
  }
  public static void counter(){
    count ++;
  }
  public static Bicycle mostUsed(Bicycle x,Bicycle y){
    if (x.distance>y.distance)
      return x;
    return y;
  }
  @Override
  public String toString(){
    String s= String.format("Bicycle : %s\tOwner : %s\tDistance in meters : %10.2f\n",this.idBicy,this.ownerName,this.distance);
    return s;
  }
}
