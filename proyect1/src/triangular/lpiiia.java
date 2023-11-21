package triangular;

import lpiii.Users;

public class lpiiia {
  public static void main(String[] args) {
  // Ejemplo de uso
  Users usuario = new Users("Juan", 25, "juan@example.com", "Ejercicio regular", "Perder peso");

  // Mostrar información del usuario
  System.out.println("Nombre: " + usuario.getNombre());
  System.out.println("Edad: " + usuario.getEdad());
  System.out.println("Contacto: " + usuario.getContacto());
  System.out.println("Preferencias de bienestar: " + usuario.getBienestar());
  System.out.println("Objetivos establecidos: " + usuario.getObjetivos());
  }
}

/*
Parte 1: Diseño de Clases
  ° Clase Usuario:
    Contendrá datos del usuario, como:
      nombre, edad, información de contacto, preferencias de bienestar, objetivos establecidos, etc.
      
  ° Clase Recurso:
    Representará los diferentes recursos disponibles, como;
      artículos, videos, consejos, cada uno con su título, descripción, tipo de recurso (texto, video, etc.), y categorías.

  ° Clase Objetivo:
    Aquí se almacenarán los objetivos establecidos por el usuario
    - incluyendo la descripción del objetivo
    - la frecuencia, el progreso, etc.

  ° Clase Recordatorio:
    Manejará los recordatorios establecidos por el usuario
      para alcanzar sus objetivos, con detalles como
        la frecuencia, la descripción, la fecha y hora, etc.

  ° Clase EvaluaciónSaludMental:
    Para gestionar las evaluaciones de:
      salud mental, incluyendo preguntas, respuestas, y el cálculo de recomendaciones personalizadas.
*/