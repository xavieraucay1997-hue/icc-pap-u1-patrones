package org.example.comportamiento.observerDos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Estudiante {
    private String codigo;
    private String nombre; 
    private double promedio; 
    private int asistencias;
    private Matricula estado;

    private final List<Consumer<CambioEstudiante>> observes;
    
    public Estudiante(String codigo, String nombre, double promedio, int asistencias, Matricula estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.promedio = promedio;
        this.asistencias = asistencias;
        this.estado = estado;
        this.observes = new ArrayList<>();
    }

    public void suscribir(Consumer<CambioEstudiante> obConsumer){
        this.observes.add(obConsumer);
    }
    
    public void notificar(CambioEstudiante cEst){
        for(Consumer<CambioEstudiante> observer : observes) { 
            observer.accept(cEst);
        }
    }

    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        if (this.codigo != null && this.codigo.equals(codigo)) {
            return;
        }
        String codigoOld = this.codigo;
        this.codigo = codigo;
        CambioEstudiante cE = new CambioEstudiante(this, "codigo", codigoOld, codigo);
        notificar(cE);
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        if (this.nombre != null && this.nombre.equals(nombre)) {
            return;
        }
        String nombreOld = this.nombre;
        this.nombre = nombre;
        CambioEstudiante cE = new CambioEstudiante(this, "nombre", nombreOld, nombre);
        notificar(cE);
    }

    public double getPromedio() {
        return promedio;
    }
    
    public void setPromedio(double promedio) {
        if (this.promedio == promedio) {
            return;
        }
        double promedioOld = this.promedio; 
        this.promedio = promedio;
        CambioEstudiante cE = new CambioEstudiante(this, "promedio", promedioOld, promedio);
        notificar(cE);
    }

    public int getAsistencias() {
        return asistencias;
    }
    
    public void setAsistencias(int asistencias) {
        if (this.asistencias == asistencias) {
            return;
        }
        int asistenciasOld = this.asistencias; 
        this.asistencias = asistencias;
        CambioEstudiante cE = new CambioEstudiante(this, "asistencias", asistenciasOld, asistencias);
        notificar(cE);
    }

    public Matricula getEstado() {
        return estado;
    }
    
    public void setEstado(Matricula estado) {
        if (this.estado == estado) {
            return;
        }
        Matricula estadoOld = this.estado;
        this.estado = estado;
        CambioEstudiante cE = new CambioEstudiante(this, "estado", estadoOld, estado);
        notificar(cE);
    }

    public List<Consumer<CambioEstudiante>> getObserves() {
        return observes;
    }

    @Override
    public String toString() {
        return "Estudiante [" + codigo + ", " + nombre + ", " + promedio + ", "
                + asistencias + ", " + estado + " ]";
    }
    
}