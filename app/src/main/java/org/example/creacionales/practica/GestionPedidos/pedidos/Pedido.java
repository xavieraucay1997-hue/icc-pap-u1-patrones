package org.example.creacionales.practica.GestionPedidos.pedidos;

import org.example.creacionales.practica.GestionPedidos.configuracion.ConfiguracionSistema;

public abstract class Pedido {

    private String codigoPedido;
    private String nombreCliente;
    private double valorSubtotal;

    public Pedido(String codigoPedido, String nombreCliente, double valorSubtotal) {

        this.codigoPedido = codigoPedido;
        this.nombreCliente = nombreCliente;
        this.valorSubtotal = valorSubtotal;

    }


    public void calcularYMostrarDetalles() {


        ConfiguracionSistema configuracionSistema = ConfiguracionSistema.getInstancia();

        double valorImpuestoCalculado = valorSubtotal * (configuracionSistema.obtenerPorcentajeImpuesto() / 100.0);

        double valorTotalAPagar = valorSubtotal + valorImpuestoCalculado;

        System.out.println("Codigo del pedido: " + codigoPedido);
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Subtotal: $" + valorSubtotal);
        System.out.println("Impuesto: $" + valorImpuestoCalculado);
        System.out.println("Total a pagar: $" + valorTotalAPagar);


        generarComprobante();

    }


    protected abstract void generarComprobante();

}
