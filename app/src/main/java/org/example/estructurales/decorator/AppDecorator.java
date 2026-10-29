package org.example.estructurales.decorator;

public class AppDecorator {

    public static void main(String[] args) {

        Bebida bebida = new CafeSimple(); // Como la bebida es interfaz se instancia como cafe simple 
        System.out.println(bebida.descripcion() + " $" + bebida.precio());
        Bebida bebida2 = new Leche(bebida);
        System.out.println(bebida2.descripcion() + " $" + bebida2.precio());


        Bebida bebida3 = new Chocolate(bebida);
        System.out.println(bebida3.descripcion() + " $" + bebida3.precio());

        Bebida cafeSLC = new Chocolate(new Leche(bebida));
        System.out.println(cafeSLC.descripcion() + " $" + cafeSLC.precio());

        Bebida cafeCC = new Leche(new Chocolate(bebida));
        System.out.println(cafeCC.descripcion() + " $" + cafeCC.precio());

        Bebida cafeSLLC = new Leche(new Chocolate(new Chocolate(bebida)));
        System.out.println(cafeSLLC.descripcion() + " $" + cafeSLLC.precio());



       
        
    }
    
}
