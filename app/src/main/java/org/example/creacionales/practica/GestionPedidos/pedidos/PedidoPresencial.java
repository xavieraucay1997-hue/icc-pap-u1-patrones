package org.example.creacionales.practica.GestionPedidos.pedidos;

public class PedidoPresencial extends Pedido{
    public PedidoPresencial(String codigoPedido, String nombreCliente, double valorSubtotal) {
        super(codigoPedido, nombreCliente, valorSubtotal);
    }

    @Override
    protected void generarComprobante() {
        System.out.println("Comprobante generado en tienda.");
    }
}