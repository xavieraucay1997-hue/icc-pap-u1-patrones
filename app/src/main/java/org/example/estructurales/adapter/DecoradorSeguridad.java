package org.example.estructurales.adapter;

public class DecoradorSeguridad extends DecoradorCargador{

    private boolean permitido;

    public DecoradorSeguridad(Cargador cargador, boolean permitido){
        super(cargador);
        this.permitido = permitido; 
    }

    @Override
    public void cargarCelular() {
        System.out.println("Verificando seguridad.... ");
        
        if(permitido){
            super.cargarCelular();

        }else {
             System.out.println("No permitido, carga bloqueada..");
        }
    }
    
}
