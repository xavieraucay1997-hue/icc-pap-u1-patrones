package org.example.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import org.example.comportamiento.observerDos.CambioEstudiante;

public class SeguimientoAcademico implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        if(! cambio.atributo().equals("promedio")){
            return ;
        }
        double anterior = (double) cambio.old();
        double nuevo = (double) cambio.nuevo(); 
        
        if(anterior >= 7.0 && nuevo < 7.0){
            System.out.println("[ACADEMICO] Bajo rendimiento " + cambio.est());
        } 
        if(anterior <= 7.0 && nuevo >= 7.0) {
            System.out.println("[ACADEMICO Recuperacion academica " + cambio.est());
        }
    }

    
}
