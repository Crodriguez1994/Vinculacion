/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Mantenedores;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Christian
 */
public class Proyecto {

    private int proyectoid;
    private Date fecha;
    private String nombre;
    private Date fechainicio;
    private Date fechafin;
    private String estado;
    private boolean seleccionar;
    private List<ProyectoSector> lista = new ArrayList<>();

    public Proyecto() {
    }

    public Proyecto(Date fecha, String nombre, Date fechainicio, Date fechafin, String estado, boolean seleccionar) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.estado = estado;
        this.seleccionar = seleccionar;
    }

    public Proyecto(int proyectoid, Date fecha, String nombre, Date fechainicio, Date fechafin, String estado, boolean seleccionar) {
        this.proyectoid = proyectoid;
        this.fecha = fecha;
        this.nombre = nombre;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.estado = estado;
        this.seleccionar = seleccionar;
    }

    public int getProyectoid() {
        return proyectoid;
    }

    public void setProyectoid(int proyectoid) {
        this.proyectoid = proyectoid;
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

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<ProyectoSector> getLista() {
        return lista;
    }

    public void setLista(List<ProyectoSector> lista) {
        this.lista = lista;
    }

    public void addProyectoSector(ProyectoSector proyectoSector) {
        lista.add(proyectoSector);
        proyectoSector.setProyecto(this);
    }

    public boolean isSeleccionar() {
        return seleccionar;
    }

    public void setSeleccionar(boolean seleccionar) {
        this.seleccionar = seleccionar;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.proyectoid;
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
        final Proyecto other = (Proyecto) obj;
        if (this.proyectoid != other.proyectoid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "proyectoid=" + proyectoid + ", fecha=" + fecha + ", nombre=" + nombre + ", fechainicio=" + fechainicio + ", fechafin=" + fechafin + ", estado=" + estado + ", seleccionar=" + seleccionar + ", lista=" + lista + '}';
    }

}
