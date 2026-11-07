package org.example.estructurales.practica2;

public class AppNotificaciones {
    public static void main(String[] args) {
        System.out.println(" Caso 1: Academica por correo ");
        System.out.println();
        Notificacion n1 = new NotificacionAcademica(new CanalCorreo());
        n1.notificar("estudiante@universidad.edu", "Sus calificaciones estan disponibles");

        System.out.println("Caso 2: Administrativa por SMS ");
        System.out.println();
        Notificacion n2 = new NotificacionAdministrativa(new CanalSMS());
        n2.notificar("0991234567", "Tiene un tramite pendiente");

        System.out.println(" Caso 3: Seguridad por push con autorizacion");
        System.out.println();
        Notificacion n3 = new NotificacionSeguridad(new ProxyCanalEnvio(new CanalPush(), true));
        n3.notificar("usuario123", "Se detecto un inicio de sesion");

        System.out.println("Caso 4: Academica por SMS sin autorizacion");
        System.out.println();
        Notificacion n4 = new NotificacionAcademica(new ProxyCanalEnvio(new CanalSMS(), false));
        n4.notificar("0987654321", "Recordatorio de examen");

        System.out.println(" Caso 5: Mismo canal, distintas notificaciones");
        System.out.println();
        CanalEnvio correo = new CanalCorreo();
        Notificacion academica = new NotificacionAcademica(correo);
        Notificacion administrativa = new NotificacionAdministrativa(correo);
        academica.notificar("estudiante@universidad.edu", "Nueva tarea publicada");
        administrativa.notificar("estudiante@universidad.edu", "Matricula por renovar");

        System.out.println("Caso 6: Bridge + Proxy con distintos canales ");
        System.out.println();
        CanalEnvio correoAutorizado = new ProxyCanalEnvio(new CanalCorreo(), true);
        CanalEnvio smsBloqueado = new ProxyCanalEnvio(new CanalSMS(), false);
        new NotificacionSeguridad(correoAutorizado)
            .notificar("docente@universidad.edu", "Cambio de contraseña requerido.");
        new NotificacionSeguridad(smsBloqueado)
            .notificar("0991112233", "Cambio de contraseña requerido.");
    }
    
}
