package com.company;

import java.io.Serializable;
import java.util.Arrays;

public class Profesor implements Serializable {
    private int idProfesor;
    private String nombre;
    private Asignatura[] asignaturas = new Asignatura[3];
    private Especialidad espec;

    public Profesor() {}

    public Profesor(int idProfesor, String nombre, Asignatura[] asignaturas, Especialidad espec) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.asignaturas = asignaturas;
        this.espec = espec;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public Especialidad getEspec() {
        return espec;
    }

    public void setEspec(Especialidad espec) {
        this.espec = espec;
    }

    @Override
    public String toString() {
        return "Profesor:" +
                "\n\tidProfesor=" + idProfesor +
                ",\n\tnombre='" + nombre + '\'' +
                ",\n\tasignaturas=" + Arrays.toString(asignaturas) +
                ",\n\tespec=" + espec.toString();
    }
}
