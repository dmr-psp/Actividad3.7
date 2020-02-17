package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static Profesor[] profesores = new Profesor[5];
    public static Asignatura[] asignaturas;
    public static Especialidad[] especialidades;
    public static int identificador = 1;

    public static void main(String[] args) throws IOException {

        cargarDatos();
        for (int i = 0; i<profesores.length;i++) {
            profesores[i] = new Profesor(i, "Profesor " + i, asignaturas, especialidades[i]);
        }

        ServerSocket servidor = new ServerSocket(6000);
        System.out.println("SERVIDOR INICIADO...");

        while (true) {
            Socket cliente = null;

            cliente = servidor.accept();

            HiloServidor hilo=new HiloServidor(cliente, identificador, profesores);
            hilo.start();

            //Aumento el identificador de conexión en 1
            identificador++;
        }
    }

    public static void cargarDatos() {
        Asignatura a1 = new Asignatura(1, "Acceso a Datos");
        Asignatura a2 = new Asignatura(2, "Móviles");
        Asignatura a3 = new Asignatura(3, "Servicios y Procesos");
        asignaturas = new Asignatura[]{a1, a2, a3};
        Especialidad e1 = new Especialidad(1, "Informática");
        Especialidad e2 = new Especialidad(2, "Informática");
        Especialidad e3 = new Especialidad(3, "Informática");
        Especialidad e4 = new Especialidad(4, "Informática");
        Especialidad e5 = new Especialidad(5, "Informática");
        especialidades = new Especialidad[]{e1, e2, e3, e4, e5};
    }
}
