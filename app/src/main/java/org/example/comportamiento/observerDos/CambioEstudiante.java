package org.example.comportamiento.observerDos;

public record CambioEstudiante(
    Estudiante est,
    String atributo,
    Object old,
    Object nuevo
    
) {

}
