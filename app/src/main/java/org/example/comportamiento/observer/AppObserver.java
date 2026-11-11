package org.example.comportamiento.observer;

public class AppObserver {
    public static void main(String[] args) {



        Producto p = new Producto("001", 20.50, "Pizza");

        p.suscribir(cP -> System.out.println("Correo: " + cP));

        p.suscribir(cP -> System.out.println("Registro: " + cP));

        String codAntiguo = p.getCodigo();
        p.suscribir(producto -> {
            //Ejecuta siempre
           // if(codAntiguo != producto.getCodigo()){
             ////   System.out.println("El codigo viejo es: " + codAntiguo + "El codigo nuevo es:  " + producto.getCodigo() );
                
           // }
            //System.out.println("Registro: $ " + producto );
        });

        p.suscribir(cp ->{
            System.out.println("Se modifico el " + cp.atributo());
            System.out.println("Old = " + cp.anterior() + "| New = " + cp.nuevo());
        });
        
//  Cuando cambie cualquier atributo notificar los consumers
        System.out.println("Cambio el precio");
        p.setPrecio(15.50);
        System.out.println("Cambio el nombre");
       p.setNombre("PIZZA");
        //p.notifyAll(p);

        System.out.println("Cambio el codigo ");
        System.out.println("010");   
     }
    
}
