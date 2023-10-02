package Automovil;

public class Motor {
  private int numMotor;
  private int revPorMin;

  public Motor(int numMotor, int revPorMin){
    this.numMotor=numMotor;
    this.revPorMin=revPorMin;
  }

  public int getNumMotor() {
    return numMotor;
  }

  public void setNumMotor(int numMotor) {
    this.numMotor = numMotor;
  }

  public int getRevPorMin() {
    return revPorMin;
  }

  public void setRevPorMin(int revPorMin) {
    this.revPorMin = revPorMin;
  }

  @Override
  public String toString() {
    return "Motor{" +
            "numMotor=" + numMotor +
            ", revPorMin=" + revPorMin +
            '}';
}

}
