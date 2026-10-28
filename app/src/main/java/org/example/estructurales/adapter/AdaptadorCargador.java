package org.example.estructurales.adapter;

public class AdaptadorCargador implements Cargador{

    //dependencia del cargador antiguo 
    private final CargadorAntiguo cargadorAntiguo;
    
    //Se inyecta la dependencua de cargador antiguo 
    public AdaptadorCargador(CargadorAntiguo cargadorAntiguo){
        this.cargadorAntiguo = cargadorAntiguo; 
    }

    @Override
    public void cargarCelular(){
        cargadorAntiguo.cargarConector();
    }

    
}
