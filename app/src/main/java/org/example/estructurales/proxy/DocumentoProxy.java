package org.example.estructurales.proxy;

public class DocumentoProxy implements Documento {
    /**    (non-Javadoc)
     * Este es el proxy que pospone la creacion de un documento real hasta que se lo nrecesite
     * 
     */


    private final String path;
    private DocumentoReal documento;


    public DocumentoProxy(String path) {
        this.path = path;
    }

    @Override
    public void mostrar() {
        if(documento == null){
            documento = new DocumentoReal(path); 
        }
        documento.mostrar();


    }
    
}
