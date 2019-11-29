/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Procesos;

import Modelo.Mantenedores.Horario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 
 */
public class Inscripcion {
    
    private int cabinscripcionid;
    private Date fecha;
    private Horario cabhorarioid;
    private Capacitacion cabcapid;
    private String responsable;
    private String estado;
    private List<DetaInscripcion> listaDetaInsc = new ArrayList<>();

    public Inscripcion() {
    }

    public Inscripcion(int cabinscripcionid, Date fecha, Horario cabhorarioid, Capacitacion cabcapid, String responsable, String estado) {
        this.cabinscripcionid = cabinscripcionid;
        this.fecha = fecha;
        this.cabhorarioid = cabhorarioid;
        this.cabcapid = cabcapid;
        this.responsable = responsable;
        this.estado = estado;
    }

    
    public Inscripcion(Date fecha, Horario cabhorarioid, Capacitacion cabcapid, String responsable, String estado) {
        this.fecha = fecha;
        this.cabhorarioid = cabhorarioid;
        this.cabcapid = cabcapid;
        this.responsable = responsable;
        this.estado = estado;
    }

    public int getCabinscripcionid() {
        return cabinscripcionid;
    }

    public void setCabinscripcionid(int cabinscripcionid) {
        this.cabinscripcionid = cabinscripcionid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Horario getCabhorarioid() {
        return cabhorarioid;
    }

    public void setCabhorarioid(Horario cabhorarioid) {
        this.cabhorarioid = cabhorarioid;
    }

    public Capacitacion getCabcapid() {
        return cabcapid;
    }

    public void setCabcapid(Capacitacion cabcapid) {
        this.cabcapid = cabcapid;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<DetaInscripcion> getListaDetaInsc() {
        return listaDetaInsc;
    }

    public void setListaDetaInsc(List<DetaInscripcion> listaDetaInsc) {
        this.listaDetaInsc = listaDetaInsc;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.cabinscripcionid;
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
        final Inscripcion other = (Inscripcion) obj;
        if (this.cabinscripcionid != other.cabinscripcionid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "cabinscripcionid=" + cabinscripcionid + ", fecha=" + fecha + ", cabhorarioid=" + cabhorarioid + ", cabcapid=" + cabcapid + ", responsable=" + responsable + ", estado=" + estado + '}';
    }            
    
    
}
