package org.example.creacionales.practica.GestionPedidos.configuracion;

public class ConfiguracionSistema {
    private static ConfiguracionSistema instanciaUnica; 
    private double porcentajeImpuestoConfigurado; 
    
    private ConfiguracionSistema() {
        this.porcentajeImpuestoConfigurado = 15.0; 
    }

    public static synchronized ConfiguracionSistema getInstancia() {
        if(instanciaUnica == null ) {
            instanciaUnica = new ConfiguracionSistema(); 
        }
        return  instanciaUnica;
    }
    public double obtenerPorcentajeImpuesto() {
        return porcentajeImpuestoConfigurado;
    }

    public void actualizarPorcentajeImpuesto(double nuevoPorcentajeImpuesto) {
        this.porcentajeImpuestoConfigurado = nuevoPorcentajeImpuesto;
    }

}
