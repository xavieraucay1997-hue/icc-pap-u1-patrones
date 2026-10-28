package org.example.estructurales.adapter;

public class AdaptadorCargadorIna implements Cargador {

    private final CargadorInalambrico cInalambrico;

    public AdaptadorCargadorIna(CargadorInalambrico cInalambrico){
        this.cInalambrico = cInalambrico; 
    }
    @Override
    public void cargarCelular() {

    }
    
}
