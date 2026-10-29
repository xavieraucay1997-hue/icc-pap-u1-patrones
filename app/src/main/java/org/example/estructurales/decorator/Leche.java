package org.example.estructurales.decorator;

/**
 * 
 * Leche es DECORADOR que envuelve a una bebida 
 * BEBIDA -> general puede ser cualquiera como un cafe 
 * un expreso, chocolate, etc.
 */

public final class Leche implements Bebida{
    
    protected final Bebida bebida;

    public Leche (Bebida bebida) {
        this.bebida = bebida;
    }




    @Override
    public String descripcion() {
        return  bebida.descripcion() + " con leche";  

    }

    @Override
    public double precio() {
        return bebida.precio() + 0.50; 



    }


    
}
