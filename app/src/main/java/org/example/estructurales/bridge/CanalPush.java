package org.example.estructurales.bridge;

public class CanalPush implements CanalEnvio {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Push: " + mensaje);

    }

    
}
