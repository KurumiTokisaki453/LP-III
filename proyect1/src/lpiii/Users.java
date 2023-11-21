package lpiii;

public class Users {
  private String nombre;
  private int edad;
  private String Contacto;
  private String Bienestar;
  private String objetivos;
  // Métodos de acceso (getters y setters)
  public String getNombre() { return nombre; }
  public void setNombre(String nombre) { this.nombre = nombre; }

  public int getEdad() { return edad; }
  public void setEdad(int edad) { this.edad = edad; }

  public String getContacto() { return Contacto; }
  public void setContacto(String Contacto) { this.Contacto = Contacto; }

  public String getBienestar() { return Bienestar; }
  public void setBienestar(String Bienestar) { this.Bienestar = Bienestar; }

  public String getObjetivos() { return objetivos; }
  public void setObjetivos(String objetivos) { this.objetivos = objetivos; }
    // Constructor
  public Users(String nombre, int edad, String Contacto, String Bienestar, String objetivos) {
    this.nombre = nombre;
    this.edad = edad;
    this.Contacto = Contacto;
    this.Bienestar = Bienestar;
    this.objetivos = objetivos;
  }
  
    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", edad=" + edad + ", Contacto=" + Contacto + ", Bienestar=" + Bienestar
                + ", objetivos=" + objetivos + "]";
    }
}


    // public String obtenerDatosInsert() {
        // Retorna una cadena formateada para usar en la consulta INSERT
        // return String.format("('%s', '%s', %b, %d, %.2f)", getNombre(), getFechaNacimiento(), isActivo(), getCarreras(), getSueldo());

        // return "insert"; }




/*
  ° Clase Usuario:
    Contendrá datos del usuario, como:
      nombre, edad, información de contacto, preferencias de bienestar, objetivos establecidos, etc.
 */
