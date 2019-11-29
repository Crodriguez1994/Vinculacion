/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Mantenedores;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Christian
 */
public class Especialidad implements Serializable {

    private int especialidadid;
    private Date fecha;
    private String nombre;
    private String estado;

    public Especialidad() {
    }

    public Especialidad(int especialidadid, Date fecha, String nombre, String estado) {
        this.especialidadid = especialidadid;
        this.fecha = fecha;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getEspecialidadid() {
        return especialidadid;
    }

    public void setEspecialidadid(int especialidadid) {
        this.especialidadid = especialidadid;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.especialidadid;
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
        final Especialidad other = (Especialidad) obj;
        if (this.especialidadid != other.especialidadid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Especialidad{" + "especialidadid=" + especialidadid + ", fecha=" + fecha + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
}
