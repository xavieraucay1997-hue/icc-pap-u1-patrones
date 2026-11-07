package org.example.estructurales.practica2;

public abstract class Notificacion {
    protected CanalEnvio canal;

    public Notificacion(CanalEnvio canal) {
        this.canal = canal;
    }

    public abstract void notificar(String destinatario, String mensaje); 
    
}
