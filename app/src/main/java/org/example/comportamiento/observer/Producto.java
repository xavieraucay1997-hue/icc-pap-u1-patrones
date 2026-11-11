package org.example.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Producto {

    public final List<Consumer<CambioProducto>> observadores;


    private String codigo;
    private double precio;
    private String nombre;

    public Producto(String codigo, double precio, String nombre) {
        this.codigo = codigo;
        this.precio = precio;
        this.nombre = nombre;
        this.observadores = new ArrayList<>();
    }

    public void suscribir(Consumer<CambioProducto> observador) {
        observadores.add(observador);
    }

    private void notifyAll(CambioProducto p) {
        for (Consumer<CambioProducto> observador : observadores) {
            observador.accept(p);
        }
    }

    public List<Consumer<CambioProducto>> getObservadores() {
        return observadores;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        String codigoId = this.codigo;
        this.codigo = codigo;
        CambioProducto cP = new CambioProducto(this, "codigo", codigoId, codigo); 

    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        Double precios = this.precio;
        this.precio = precio;
        CambioProducto cP = new CambioProducto(this, "precio", precios, precio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String nombres = this.nombre;
        this.nombre = nombre;
        CambioProducto cP = new CambioProducto(this, "Nombre ", nombres, nombre);
    }

    @Override
    public String toString() {
        return "Pro[" + codigo + ", " + precio + ", " + nombre + "] ";
    }
}