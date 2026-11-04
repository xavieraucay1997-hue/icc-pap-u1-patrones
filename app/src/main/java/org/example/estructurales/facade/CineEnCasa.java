package org.example.estructurales.facade;

/**
 * esta clase es la facade es la que cordina los  componentes necesarios para una accion determinada, 
 * en este caso ver una pelicula 
 * CineEnCasa
 */
public class CineEnCasa {
    private final Proyector proyector;
    private final Reproductor reproductor;
    
    public CineEnCasa(Proyector proyector, Reproductor reproductor) {
        this.proyector = new Proyector() ;
        this.reproductor = new Reproductor();
    }

    public void iniciarPelicula(String nombre){
        proyector.encender();
        reproductor.reproducir(nombre);


    }

    


    

    
}
