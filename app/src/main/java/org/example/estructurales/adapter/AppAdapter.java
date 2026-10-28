package org.example.estructurales.adapter;

public final class AppAdapter {
    public static void main(String[] args) {

        /*
        Cargar celular con un cagador 
        pero como ahora tengo un Cargador antiguo debo crear un adaptador 
         */
        CargadorAntiguo cAntiguo = new CargadorAntiguo(); 
        Cargador cargador1 = new AdaptadorCargador(cAntiguo);

        CargadorInalambrico cInalambrico = new CargadorInalambrico();
        Cargador cargador2 = new AdaptadorCargadorIna(cInalambrico);

        //CargadorInalambrico cInalambrico = new CargadorInalambrico(); 

        // Cargar el celular 
        cargador1.cargarCelular();
        cargador2.cargarCelular();
        

        //cAntiguo.cargarConector();
        //cInalambrico.cargarBase();
        
    }

}
