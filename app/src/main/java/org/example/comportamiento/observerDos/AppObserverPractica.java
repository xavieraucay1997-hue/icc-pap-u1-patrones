package org.example.comportamiento.observerDos;

import java.util.function.Consumer;
import org.example.comportamiento.observerDos.observers.ControlMatricula;
import org.example.comportamiento.observerDos.observers.NotificadorRepresentante;
import org.example.comportamiento.observerDos.observers.SeguimientoAcademico;
import org.example.comportamiento.observerDos.observers.SeguimientoAsistencias;
import org.example.comportamiento.observerDos.observers.SeguimientoIntegral;

public class AppObserverPractica {
    public static void main(String[] args) {
        Estudiante ana = new Estudiante("EST001", "Ana Torres", 8.5, 1, Matricula.ACTIVO);
        Estudiante luis = new Estudiante("EST002", "Luis Pérez", 7.2, 4, Matricula.ACTIVO);
        Estudiante maria = new Estudiante("EST003", "María López", 9.1, 0, Matricula.ACTIVO);
        Consumer<CambioEstudiante> auditoria = cambio -> {
            System.out.printf("[AUDITORIA] %s | Atributo '%s': %s -> %s%n", 
                cambio.est().getNombre(), cambio.atributo(), cambio.old(), cambio.nuevo());
        };
        ana.suscribir(auditoria);
        luis.suscribir(auditoria);
        maria.suscribir(auditoria);

        SeguimientoAcademico obAcademico = new SeguimientoAcademico();
        ana.suscribir(obAcademico);
        luis.suscribir(obAcademico);
        maria.suscribir(obAcademico);

        SeguimientoAsistencias obAsistencia = new SeguimientoAsistencias();
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
        NotificadorRepresentante obRepresentante = new NotificadorRepresentante();
        ana.suscribir(obRepresentante);
        luis.suscribir(obRepresentante);

        System.out.println(" CASO 1: Disminucion del rendimiento academico (Ana)");
        ana.setPromedio(6.5);
        System.out.println();

        System.out.println("CASO 2: Recuperacion academica (Ana) ");
        ana.setPromedio(7.8);
        System.out.println();

        System.out.println("CASO 3: Cambio de nivel de asistencia (Luis de 4 a 7)");
        luis.setAsistencias(7);
        System.out.println();

        System.out.println("CASO 4: Modificacion del estado de matricula (María a SUSPENDIDO y ACTIVO)");
        maria.setEstado(Matricula.SUSPENDIDO);
        maria.setEstado(Matricula.ACTIVO);
        System.out.println();

        System.out.println("CASO 5: Identificacion de riesgo integral (Luis promedio 6.4 con 7 inasistencias)");
        luis.setPromedio(6.4);
        System.out.println();

        System.out.println("CASO 6: Modificaciones sin cambios (María con mismos valores)");
        maria.setPromedio(9.1);
        System.out.println();

        System.out.println("CASO 7: Observacion de multiples estudiantes");
        maria.setPromedio(8.0);
        maria.setAsistencias(2);
        System.out.println();

        System.out.println("CASO 8: Comprobacion de NotificadorRepresentante");
        ana.setPromedio(5.5); 
        luis.setAsistencias(8); 
        luis.setEstado(Matricula.SUSPENDIDO); 
        
    }
}