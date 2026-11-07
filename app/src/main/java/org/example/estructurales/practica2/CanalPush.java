package org.example.estructurales.practica2;

public class CanalPush implements CanalEnvio{

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("PUSH Notificacion para el usuario " + destinatario + ": " + mensaje);
    }
    
}
