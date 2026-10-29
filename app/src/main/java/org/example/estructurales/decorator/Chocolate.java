package org.example.estructurales.decorator;

/**
 * 
 * DECORADOR que agrega "Chocolate a la descripcion"
 * agreega 0.75 al precio 
 */
public class Chocolate implements Bebida {

    protected final Bebida bebida;

    public Chocolate (Bebida bebida){
        this.bebida = bebida; 

    }
    @Override
    public String descripcion() {
        return bebida.descripcion() + " con chocolate"; 
    }

    @Override
    public double precio() {
        return bebida.precio() + 0.75;
    }

}
