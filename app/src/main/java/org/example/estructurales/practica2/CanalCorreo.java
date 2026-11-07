package org.example.estructurales.practica2;

public class CanalCorreo implements CanalEnvio {


    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[CORREO] Para: " + destinatario + "|" + mensaje);
    }

    
}
