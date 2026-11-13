package org.example.comportamiento.observerDos.observers;

import java.util.function.Consumer;
import org.example.comportamiento.observerDos.CambioEstudiante;

public class SeguimientoAsistencias implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        if (!cambio.atributo().equals("asistencias")) {
            return;
        }

        int anterior = (int) cambio.old();
        int nuevo = (int) cambio.nuevo();

        String nivelAnterior = obtenerNivel(anterior);
        String nivelNuevo = obtenerNivel(nuevo);

        if (!nivelAnterior.equals(nivelNuevo)) {
            System.out.println("[ASISTENCIA] Cambio de nivel (" + nivelAnterior + " -> " + nivelNuevo + "): " + cambio.est());
        }

        if (nuevo <= 2) {
            System.out.println("[ASISTENCIA] Normal " + cambio.est());
        } else if (nuevo <= 5) {
            System.out.println("[ASISTENCIA] Advertencia " + cambio.est());
        } else {
            System.out.println("[ASISTENCIA] Critico " + cambio.est());
        }
    }

    private String obtenerNivel(int faltas) {
        if (faltas <= 2) return "Normal";
        if (faltas <= 5) return "Advertencia";
        return "Crítico";
    }
}