/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Mantenedores;

import java.util.Date;

/**
 *
 * @author Christian
 */
public class Sector {

    private int sectorid;
    private Date fecha;
    private String nombre;
    private String estado;
    private boolean seleccion;

    public Sector() {
    }

    public Sector(int sectorid, Date fecha, String nombre, String estado, boolean seleccion) {
        this.sectorid = sectorid;
        this.fecha = fecha;
        this.nombre = nombre;
        this.estado = estado;
        this.seleccion = seleccion;
    }

    public Sector(Date fecha, String nombre, String estado, boolean seleccion) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.estado = estado;
        this.seleccion = seleccion;
    }

    public int getSectorid() {
        return sectorid;
    }

    public void setSectorid(int sectorid) {
        this.sectorid = sectorid;
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

    public boolean isSeleccion() {
        return seleccion;
    }

    public void setSeleccion(boolean seleccion) {
        this.seleccion = seleccion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.sectorid;
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
        final Sector other = (Sector) obj;
        if (this.sectorid != other.sectorid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sector{" + "sectorid=" + sectorid + ", fecha=" + fecha + ", nombre=" + nombre + ", estado=" + estado + ", seleccion=" + seleccion + '}';
    }

    
}
