package org.example.factoryMethod;

public class ImportadorPuntoComa extends Importador {

    @Override
    protected LecturaLinea crearLector(){
        return new LectorPuntoComa();
    }
}