/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Procesos;

import Modelo.Mantenedores.Coordinador;
import Modelo.Mantenedores.Proyecto;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Christian
 */
public class AsignacionProyecto {

    private int asigproyectoid;
    private Date fecha;
    private Coordinador coordinadorid;
    private Proyecto proyectoid;
    private String estado;
    private List<Coordinador> listaCoordinador;
    private List<Proyecto> listaProyecto;

    public AsignacionProyecto() {
    }

    public AsignacionProyecto(Date fecha, Coordinador coordinadorid, Proyecto proyectoid, String estado) {
        this.fecha = fecha;
        this.coordinadorid = coordinadorid;
        this.proyectoid = proyectoid;
        this.estado = estado;
    }

    public AsignacionProyecto(int asigproyectoid, Date fecha, Coordinador coordinadorid, Proyecto proyectoid, String estado) {
        this.asigproyectoid = asigproyectoid;
        this.fecha = fecha;
        this.coordinadorid = coordinadorid;
        this.proyectoid = proyectoid;
        this.estado = estado;
    }

    public int getAsigproyectoid() {
        return asigproyectoid;
    }

    public void setAsigproyectoid(int asigproyectoid) {
        this.asigproyectoid = asigproyectoid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Coordinador getCoordinadorid() {
        return coordinadorid;
    }

    public void setCoordinadorid(Coordinador coordinadorid) {
        this.coordinadorid = coordinadorid;
    }

    public Proyecto getProyectoid() {
        return proyectoid;
    }

    public void setProyectoid(Proyecto proyectoid) {
        this.proyectoid = proyectoid;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Coordinador> getListaCoordinador() {
        return listaCoordinador;
    }

    public void setListaCoordinador(List<Coordinador> listaCoordinador) {
        this.listaCoordinador = listaCoordinador;
    }

    public List<Proyecto> getListaProyecto() {
        return listaProyecto;
    }

    public void setListaProyecto(List<Proyecto> listaProyecto) {
        this.listaProyecto = listaProyecto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.asigproyectoid;
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
        final AsignacionProyecto other = (AsignacionProyecto) obj;
        if (this.asigproyectoid != other.asigproyectoid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AsignacionProyecto{" + "asigproyectoid=" + asigproyectoid + ", fecha=" + fecha + ", coordinadorid=" + coordinadorid + ", proyectoid=" + proyectoid + ", estado=" + estado + '}';
    }

}
