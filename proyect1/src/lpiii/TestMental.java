package lpiii;
import java.util.Map;
import java.util.HashMap;

public class TestMental {
  private Map<String, String> preguntasRespuestas;
  private String recomendacionPersonalizada;
  // Constructor
  public TestMental() {
    this.preguntasRespuestas = new HashMap<>();
    this.recomendacionPersonalizada = "";
  } 
  // Métodos para gestionar preguntas y respuestas
  public void agregarRespuesta(String pregunta, String respuesta) { preguntasRespuestas.put(pregunta, respuesta); } 
  public String obtenerRespuesta(String pregunta) { return preguntasRespuestas.get(pregunta); } 

  // Método para cálculo de recomendaciones personalizadas
  public void calcularRecomendacion() { recomendacionPersonalizada = "Recomendación personalizada calculada..."; } 
      // Lógica para calcular la recomendación personalizada basada en las respuestas
      // Puedes implementar tu lógica específica aquí

  // Métodos de acceso (getters y setters)
  public Map<String, String> getPreguntasRespuestas() { return preguntasRespuestas; } 
  public void setPreguntasRespuestas(Map<String, String> preguntasRespuestas) { this.preguntasRespuestas = preguntasRespuestas; } 

  public String getRecomendacionPersonalizada() { return recomendacionPersonalizada; } 
  public void setRecomendacionPersonalizada(String recomendacionPersonalizada) { this.recomendacionPersonalizada = recomendacionPersonalizada; } 
  
  @Override
    public String toString() {
        return "EvaluacionSaludMental [preguntasRespuestas=" + preguntasRespuestas
                + ", recomendacionPersonalizada=" + recomendacionPersonalizada + "]";
    }
}
