package com.uso.myapplication;

import java.io.Serializable;

/**
 * Created by Carlos on 16/09/2017.
 */

public class Estudiante implements Serializable {
    public String nombre;
    public String codigo;
    public String materia;
    public Double parcial1;
    public Double parcial2;
    public Double parcial3;
    public Double promedio;

    public Estudiante(String nombre, String codigo, String materia, Double parcial1, Double parcial2, Double parcial3) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.materia = materia;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.parcial3 = parcial3;
    }


}
