package org.example.estructurales.adapter;

public class DecoradorCargador implements Cargador {

    protected final Cargador cargador; 
    public DecoradorCargador(Cargador cargador){
        this.cargador = cargador;

    }

    @Override
    public void cargarCelular() {
        cargador.cargarCelular();
    }
    
    
}
