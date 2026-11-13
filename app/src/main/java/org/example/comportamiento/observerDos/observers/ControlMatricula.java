package org.example.comportamiento.observerDos.observers;

import java.util.function.Consumer;
import org.example.comportamiento.observerDos.CambioEstudiante;
import org.example.comportamiento.observerDos.Matricula;

public class ControlMatricula implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        if (!cambio.atributo().equals("estado")) {
            return;
        }

        Matricula nuevo = (Matricula) cambio.nuevo();
        Matricula anterior = (Matricula) cambio.old();
        
        if (nuevo == Matricula.SUSPENDIDO) {
            System.out.println("[ESTADO MATRICULA] Estudiante Suspendido " + cambio.est());
        } else if (nuevo == Matricula.RETIRADO) {
            System.out.println("[ESTADO MATRICULA] Estudiante Retirado " + cambio.est());
        } else if (anterior == Matricula.SUSPENDIDO && nuevo == Matricula.ACTIVO) {
            System.out.println("[ESTADO MATRICULA] Estudiante ha sido reactivado " + cambio.est());
        }
    }
}