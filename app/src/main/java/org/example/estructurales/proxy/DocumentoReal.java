package org.example.estructurales.proxy;

public class DocumentoReal implements Documento {

    private final String path;

    

    public DocumentoReal(String path) {
        this.path = path;
        System.out.println("Cargandp documento desde: " + path);
    }



    @Override
    public void mostrar() {
        System.out.println("Mostrando documento desde: " + path);
    }
    
}
