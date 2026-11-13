package org.example.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import org.example.comportamiento.observerDos.CambioEstudiante;

public class ControlAsistencias implements Consumer<CambioEstudiante>{

    @Override
    public void accept(CambioEstudiante control) {
        if (!control.atributo().equals("asistencias")) {
            return; 
            
        }
        int anterior = (int) control.old();
        int nuevo = (int) control.nuevo();

    }

    
}
