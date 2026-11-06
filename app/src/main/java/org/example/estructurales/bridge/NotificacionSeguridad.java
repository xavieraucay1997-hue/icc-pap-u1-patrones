package org.example.estructurales.bridge;

public class NotificacionSeguridad extends Notificacion {

    public NotificacionSeguridad(CanalEnvio c){
        super(c);
    }


    @Override
    public void notificar(String mensaje) {
        canal.enviar("Seguridad " + mensaje);
    }

    
}
