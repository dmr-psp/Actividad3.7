package com.company;

import java.io.Serializable;

public class Especialidad implements Serializable {
    private int id;
    private String nomEspecialidad;

    public Especialidad() {}

    public Especialidad(int id, String nomEspecialidad) {
        this.id = id;
        this.nomEspecialidad = nomEspecialidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomEspecialidad() {
        return nomEspecialidad;
    }

    public void setNomEspecialidad(String nomEspecialidad) {
        this.nomEspecialidad = nomEspecialidad;
    }

    @Override
    public String toString() {
        return "Especialidad{" +
                "id=" + id +
                ", nomEspecialidad='" + nomEspecialidad + '\'' +
                '}';
    }
}
