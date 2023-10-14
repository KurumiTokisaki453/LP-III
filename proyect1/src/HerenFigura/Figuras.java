
package HerenFigura;

public class Figuras{
  abstract class figura{
    int base,altura;
    public int getBase() { return base; }
    public void setBase(int base) { this.base = base; }

    public int getAltura() { return altura; }
    public void setAltura(int altura) { this.altura = altura; }
    
    abstract void calcularArea();
  }
}

// public abstract class Figuras {
//   public abstract double calcularArea();
//   }

// class Cuadrado extends Figuras {
//     private double lado;

//     public Cuadrado(double lado) {
//         this.lado = lado;}

//     @Override
//     public double calcularArea() {
//         return lado * lado;}
// }

// class Rombo extends Figuras {
//     private double diagonalMayor;
//     private double diagonalMenor;

//     public Rombo(double diagonalMayor, double diagonalMenor) {
//         this.diagonalMayor = diagonalMayor;
//         this.diagonalMenor = diagonalMenor;}

//     @Override
//     public double calcularArea() {
//         return (diagonalMayor * diagonalMenor) / 2;}
// }

// class Circulo extends Figuras {
//     private double radio;
//     private final double pi = Math.PI;

//     public Circulo(double radio) {
//         this.radio = radio;}

//     @Override
//     public double calcularArea() {
//         return pi * radio * radio;}
// }
