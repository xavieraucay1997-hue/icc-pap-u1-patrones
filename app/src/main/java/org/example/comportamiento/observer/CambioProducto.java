package org.example.comportamiento.observer;

public record CambioProducto(
    Producto producto, 
    String atributo, 
    Object anterior, 
    Object nuevo){

    
}
