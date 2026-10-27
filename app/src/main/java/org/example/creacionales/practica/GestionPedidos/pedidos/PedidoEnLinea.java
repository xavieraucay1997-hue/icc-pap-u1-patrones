package org.example.creacionales.practica.GestionPedidos.pedidos;

public class PedidoEnLinea extends Pedido {
    public PedidoEnLinea(String codigoPedido, String nombreCliente, double valorSubtotal) {
        super(codigoPedido, nombreCliente, valorSubtotal);
    }

    @Override
    protected void generarComprobante() {
        System.out.println("Confirmación digital generada.");
    }
}    


