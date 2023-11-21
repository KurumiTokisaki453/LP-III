package lpiii;

public class Objetivo {
    private String descripcion;
    private String frecuencia;
    private int progreso;

    // Constructor
    public Objetivo(String descripcion, String frecuencia, int progreso) {
        this.descripcion = descripcion;
        this.frecuencia = frecuencia;
        this.progreso = progreso;
    }

    // Métodos de acceso (getters y setters)
  public String getDescripcion() { return descripcion; }
  public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

  public String getFrecuencia() { return frecuencia; }
  public void setFrecuencia(String frecuencia) { this.frecuencia = frecuencia; }
  
  public int getProgreso() { return progreso; }
  public void setProgreso(int progreso) { this.progreso = progreso; }

    @Override
    public String toString() {
        return "Objetivo [descripcion=" + descripcion + ", frecuencia=" + frecuencia + ", progreso=" + progreso + "]";
    }
}

