package org.example.comportamiento.stateDos;

public class Pendiente implements EstadoPedido{

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pago realizado");
        pedido.changeState(new Pagado());
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Debes pagar primero ");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("El pedido no a sido ni enviado");    
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido Cancelado");
        pedido.changeState(new Cancelado());
    
    }

    @Override
    public String nombre() {
        return "PENDIENTE"; 

    }

    
}
