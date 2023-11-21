package lpiii;

public class Recurso {
  private String titulo;
  private String descripcion;
  private String tipoRecurso;
  private String categorias;

  // Constructor
  public Recurso(String titulo, String descripcion, String tipoRecurso, String categorias) {
    this.titulo = titulo;
    this.descripcion = descripcion;
    this.tipoRecurso = tipoRecurso;
    this.categorias = categorias;
  }

    // Métodos de acceso (getters y setters)
  public String getTitulo() { return titulo; }
  public void setTitulo(String titulo) { this.titulo = titulo; }

  public String getDescripcion() { return descripcion; }
  public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

  public String getTipoRecurso() { return tipoRecurso; }
  public void setTipoRecurso(String tipoRecurso) { this.tipoRecurso = tipoRecurso; }

  public String getCategorias() { return categorias; }
  public void setCategorias(String categorias) { this.categorias = categorias; }

  @Override
  public String toString() {
    return "Recurso [titulo=" + titulo + ", descripcion=" + descripcion + ", tipoRecurso=" + tipoRecurso
      + ", categorias=" + categorias + "]";
    }
}

