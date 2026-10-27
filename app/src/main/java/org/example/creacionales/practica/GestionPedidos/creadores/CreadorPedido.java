package org.example.creacionales.practica.GestionPedidos.creadores;

import org.example.creacionales.practica.GestionPedidos.pedidos.Pedido;

public abstract class CreadorPedido {
    public abstract Pedido fabricarPedido(String codigoPedido, String nombreCliente, double valorSubtotal);
}