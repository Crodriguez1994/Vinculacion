/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Mantenedores;

import java.util.Date;

/**
 *
 
 */
public class Dias {
    
    private int diaid;
    private Date fecha;
    private String nombre;

    public Dias() {
    }

    public Dias(Date fecha, String nombre) {
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public Dias(int diaid, Date fecha, String nombre) {
        this.diaid = diaid;
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public int getDiaid() {
        return diaid;
    }

    public void setDiaid(int diaid) {
        this.diaid = diaid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.diaid;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dias other = (Dias) obj;
        if (this.diaid != other.diaid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dias{" + "diaid=" + diaid + ", fecha=" + fecha + ", nombre=" + nombre + '}';
    }
    
    
    
}
