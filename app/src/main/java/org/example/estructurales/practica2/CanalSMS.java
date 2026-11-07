package org.example.estructurales.practica2;

public class CanalSMS implements CanalEnvio{

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[SMS] Para: " + destinatario + "|" + mensaje);
    }
    
}
