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



        Cargador carg1 = new DecoradorRegistro(cargador1);
        carg1.cargarCelular();

        Cargador carg2 = new DecoradorSeguridad(cargador2, true);
        carg2.cargarCelular();

        Cargador carg3 = new DecoradorSeguridad(cargador1, false);
        carg3.cargarCelular();

        Cargador carg4 = new DecoradorSeguridad(new DecoradorRegistro(cargador2), true);
        carg4.cargarCelular();

        //CargadorInalambrico cInalambrico = new CargadorInalambrico(); 

        // Cargar el celular 
        cargador1.cargarCelular();
        cargador2.cargarCelular();
        

        //cAntiguo.cargarConector();
        //cInalambrico.cargarBase();
        
    }

}