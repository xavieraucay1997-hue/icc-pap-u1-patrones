package org.example.creacionales.practica.GestionPedidos.creadores;

import org.example.creacionales.practica.GestionPedidos.pedidos.Pedido;
import org.example.creacionales.practica.GestionPedidos.pedidos.PedidoPresencial;

public class CreadorPresencial extends CreadorPedido {
    @Override
    public Pedido fabricarPedido(String codigoPedido, String nombreCliente, double valorSubtotal) {
        return new PedidoPresencial(codigoPedido, nombreCliente, valorSubtotal);
    }
}