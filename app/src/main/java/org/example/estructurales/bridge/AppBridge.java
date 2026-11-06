package org.example.estructurales.bridge;

public class AppBridge {
    public static void main(String[] args) {
        Notificacion not1 = new NotificacionAcademica(new CanalCorreo());
        Notificacion not2 = new NotificacionAcademica(new CanalPush());
        Notificacion notSegCorreo = new NotificacionSeguridad(new CanalCorreo());
        Notificacion notSegPush = new NotificacionSeguridad(new CanalPush());
        
        String mensajeAca = "Solicitud #44 Aprobada";
        String mensajeSeg = "Alerta de correos Maliciosos";
        
        not1.notificar(mensajeAca);
        not2.notificar(mensajeAca);

        notSegCorreo.notificar(mensajeSeg);
        notSegPush.notificar(mensajeSeg);
        
    }
    
}
