package org.example.comportamiento.observerDos;

import java.util.function.Consumer;

import org.example.comportamiento.observerDos.observers.SeguimientoAcademico;

public class AppObserverPractica {
    public static void main(String[] args) {
        // 1. Instanciar los estudiantes con los datos de la imagen
        Estudiante ana = new Estudiante("EST001", "Ana Torres", 8.5, 1, Matricula.ACTIVO);
        Estudiante luis = new Estudiante("EST002", "Luis Pérez", 7.2, 4, Matricula.ACTIVO);
        Estudiante maria = new Estudiante("EST003", "María López", 9.1, 0, Matricula.ACTIVO);

        // 2. Definir el Consumer de auditoría
        Consumer<CambioEstudiante> auditoria = cambio -> {
            System.out.printf("[AUDITORIA] %s | Atributo '%s': %s -> %s%n", 
                cambio.est(), cambio.atributo(), cambio.old(), cambio.nuevo());
        };
        ana.suscribir(auditoria);
        luis.suscribir(auditoria);
        maria.suscribir(auditoria);
        
        SeguimientoAcademico obAcademico = new SeguimientoAcademico();
        System.out.println();
        ana.suscribir(obAcademico);
        luis.suscribir(obAcademico);
        maria.suscribir(obAcademico);

        SeguimientoAsistencia obAsistencia = new SeguimientoAsistencia(); 

        ana.suscribir(obAsistencia);
        luis.suscribir(obAsistencia);
        maria.suscribir(obAsistencia);


        ControlMatricula obControlMatricula = new ControlMatricula();

        ana.suscribir(obControlMatricula);
        luis.suscribir(obControlMatricula);
        maria.suscribir(obControlMatricula);
                SeguimientoIntegral obIntegral = new SeguimientoIntegral();
        ana.suscribir(obIntegral);
        luis.suscribir(obIntegral);
        maria.suscribir(obIntegral);

        // Observador 6: Notificaion Representante

        NotificadorRepresentante obRepresentante = new NotificadorRepresentante();

        ana.suscribir(obRepresentante);
        luis.suscribir(obRepresentante);

        ana.setCodigo("EST004");
        System.out.println();
        ana.setNombre("ANA");
        System.out.println();
        ana.setPromedio(4.5);
        System.out.println();
        luis.setInasistencias(7);
        System.out.println();
        maria.setEstado(Matricula.SUSPENDIDO);
        System.out.println();
        maria.setEstado(Matricula.ACTIVO);
        System.out.println();
        luis.setPromedio(6.4);
        maria.setEstado(Matricula.ACTIVO);
        System.out.println();
        maria.setPromedio(6.5);
        System.out.println();
        luis.setInasistencias(4);
        System.out.println();
        maria.setPromedio(7.0);
        System.out.println();
        ana.setPromedio(5.5);
        System.out.println();
        luis.setInasistencias(8);
        System.out.println();
        maria.setInasistencias(9);
        System.out.println();
        luis.setEstado(Matricula.SUSPENDIDO);
        

    }
}
