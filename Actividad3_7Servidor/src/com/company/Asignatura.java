package com.company;

import java.io.Serializable;

public class Asignatura implements Serializable {
    private int id;
    private String nomAsig;

    public Asignatura() {
    }

    public Asignatura(int id, String nomAsig) {
        this.id = id;
        this.nomAsig = nomAsig;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "id=" + id +
                ", nomAsig='" + nomAsig + '\'' +
                '}';
    }
}
