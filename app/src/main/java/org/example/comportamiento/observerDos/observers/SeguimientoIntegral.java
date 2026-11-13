package org.example.comportamiento.observerDos.observers;

import java.util.function.Consumer;
import org.example.comportamiento.observerDos.CambioEstudiante;
import org.example.comportamiento.observerDos.Estudiante;
import org.example.comportamiento.observerDos.Matricula;

public class SeguimientoIntegral implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        Estudiante estudiante = cambio.est();
        double promedio = estudiante.getPromedio();
        int asistencias = estudiante.getAsistencias();
        Matricula estado = estudiante.getEstado();

        if (promedio < 7.0 && asistencias >= 6 && estado == Matricula.ACTIVO) {
            System.out.println("[SEGUIMIENTO INTEGRAL] Riesgo integral detectado en " + cambio.est());
        }
    }
}