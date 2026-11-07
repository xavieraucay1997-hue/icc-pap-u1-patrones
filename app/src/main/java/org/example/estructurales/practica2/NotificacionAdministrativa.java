package org.example.estructurales.practica2;

public class NotificacionAdministrativa extends Notificacion{
    public NotificacionAdministrativa(CanalEnvio canal){
        super(canal);
    }

    @Override
    public void notificar(String destinatario, String mensaje) {
        canal.enviar(destinatario," [ADMINISTRATIVO] " + mensaje);
    }
    
}
