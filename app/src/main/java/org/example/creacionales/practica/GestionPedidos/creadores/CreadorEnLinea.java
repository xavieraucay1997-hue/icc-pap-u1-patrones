package org.example.creacionales.practica.GestionPedidos.creadores;

import org.example.creacionales.practica.GestionPedidos.pedidos.Pedido;
import org.example.creacionales.practica.GestionPedidos.pedidos.PedidoEnLinea;

public class CreadorEnLinea extends CreadorPedido {
    @Override
    public Pedido fabricarPedido(String codigoPedido, String nombreCliente, double valorSubtotal) {
        return new PedidoEnLinea(codigoPedido, nombreCliente, valorSubtotal);
    }
}