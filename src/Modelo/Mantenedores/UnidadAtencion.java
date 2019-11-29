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
public class UnidadAtencion {

    private int unidadid;
    private Date fecha;
    private Proyecto proyectoid;
    private Sector sectorid;
    private String nombre;
    private String estado;

    public UnidadAtencion() {
    }

    public UnidadAtencion(Date fecha, Proyecto proyectoid, Sector sectorid, String nombre, String estado) {
        this.fecha = fecha;
        this.proyectoid = proyectoid;
        this.sectorid = sectorid;
        this.nombre = nombre;
        this.estado = estado;
    }

    public UnidadAtencion(int unidadid, Date fecha, Proyecto proyectoid, Sector sectorid, String nombre, String estado) {
        this.unidadid = unidadid;
        this.fecha = fecha;
        this.proyectoid = proyectoid;
        this.sectorid = sectorid;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getUnidadid() {
        return unidadid;
    }

    public void setUnidadid(int unidadid) {
        this.unidadid = unidadid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Proyecto getProyectoid() {
        return proyectoid;
    }

    public void setProyectoid(Proyecto proyectoid) {
        this.proyectoid = proyectoid;
    }

    public Sector getSectorid() {
        return sectorid;
    }

    public void setSectorid(Sector sectorid) {
        this.sectorid = sectorid;
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
        hash = 31 * hash + this.unidadid;
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
        final UnidadAtencion other = (UnidadAtencion) obj;
        if (this.unidadid != other.unidadid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UnidadAtencion{" + "unidadid=" + unidadid + ", fecha=" + fecha 
                + ", proyectoid=" + proyectoid + ", sectorid=" + sectorid
                + ", nombre=" + nombre + ", estado=" + estado + '}';
    }

}
