package org.example.estructurales.bridge;

public abstract class Notificacion {
    protected final CanalEnvio canal;
    
    //Constructor dependiente del canalenvio 

    public Notificacion(CanalEnvio canal) {
        this.canal = canal;
    }

    public abstract void notificar(String mensaje);
    


    
    
    
}
