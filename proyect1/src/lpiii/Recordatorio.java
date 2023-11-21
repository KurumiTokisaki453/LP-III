package lpiii;

import java.time.LocalDateTime;

public class Recordatorio {
    private String descripcion;
    private String frecuencia;
    private LocalDateTime fechaHora;

    // Constructor
    public Recordatorio(String descripcion, String frecuencia, LocalDateTime fechaHora) {
        this.descripcion = descripcion;
        this.frecuencia = frecuencia;
        this.fechaHora = fechaHora;
    }

    // Métodos de acceso (getters y setters)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return "Recordatorio [descripcion=" + descripcion + ", frecuencia=" + frecuencia + ", fechaHora=" + fechaHora + "]";
    }
}
