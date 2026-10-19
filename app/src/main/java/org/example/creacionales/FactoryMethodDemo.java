package org.example.creacionales;
interface Notificacion {
    void enviarMensaje(String mensaje);
}

class NotificacionEmail implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("EMAIL Enviando correo: " + mensaje);
    }
}
class NotificacionSMS implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("SMS Enviando mensaje de texto: " + mensaje);
    }
}

public class FactoryMethodDemo {

    public static void crearYEnviar(String tipo, String mensaje) {
        Notificacion notificacion = crearNotificacion(tipo);
        if (notificacion != null) {
            notificacion.enviarMensaje(mensaje);
        }
    }
    private static Notificacion crearNotificacion(String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            return null;
        }
        if (tipo.equalsIgnoreCase("EMAIL")) {
            return new NotificacionEmail();
        } else if (tipo.equalsIgnoreCase("SMS")) {
            return new NotificacionSMS();
        }
        throw new IllegalArgumentException("Tipo de notificacion desconocido: " + tipo);
    }
}