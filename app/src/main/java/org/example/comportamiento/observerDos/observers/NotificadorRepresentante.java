package org.example.comportamiento.observerDos.observers;

import java.util.function.Consumer;
import org.example.comportamiento.observerDos.CambioEstudiante;
import org.example.comportamiento.observerDos.Estudiante;
import org.example.comportamiento.observerDos.Matricula;

public class NotificadorRepresentante implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        Estudiante estudiante = cambio.est();
        String atributo = cambio.atributo();

        if (atributo.equals("promedio")) {
            double nuevoPromedio = (double) cambio.nuevo();
            if (nuevoPromedio < 6.0) {
                System.out.println("[REPRESENTANTE] Notificación para el representante de " + estudiante.getNombre() + ": El promedio se encuentra en nivel crítico de " + nuevoPromedio);
            }
        }

        if (atributo.equals("asistencias")) {
            int nuevasAsistencias = (int) cambio.nuevo();
            if (nuevasAsistencias >= 8) {
                System.out.println("[REPRESENTANTE] Notificación para el representante de " + estudiante.getNombre() + ": El estudiante acumula " + nuevasAsistencias + " inasistencias.");
            }
        }

        if (atributo.equals("estado")) {
            Matricula nuevoEstado = (Matricula) cambio.nuevo();
            if (nuevoEstado == Matricula.SUSPENDIDO) {
                System.out.println("[REPRESENTANTE] Notificación oficial al representante de " + estudiante.getNombre() + ": El estado de la matrícula ha cambiado a SUSPENDIDO.");
            }
        }
    }
}