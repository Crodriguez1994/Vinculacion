/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Procesos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 
 */
public class Asistencia {
    
    private int cabasistenciaid;
    private Date fecha;
    private Inscripcion cabinscripcionid;
    private String estado;
    private List<DetaAsistencia> listaDetAsi = new ArrayList<>();

    public Asistencia() {
    }

    public Asistencia(int cabasistenciaid, Date fecha, Inscripcion cabinscripcionid, String estado) {
        this.cabasistenciaid = cabasistenciaid;
        this.fecha = fecha;
        this.cabinscripcionid = cabinscripcionid;
        this.estado = estado;
    }

    public Asistencia(Date fecha, Inscripcion cabinscripcionid, String estado) {
        this.fecha = fecha;
        this.cabinscripcionid = cabinscripcionid;
        this.estado = estado;
    }

    public int getCabasistenciaid() {
        return cabasistenciaid;
    }

    public void setCabasistenciaid(int cabasistenciaid) {
        this.cabasistenciaid = cabasistenciaid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Inscripcion getCabinscripcionid() {
        return cabinscripcionid;
    }

    public void setCabinscripcionid(Inscripcion cabinscripcionid) {
        this.cabinscripcionid = cabinscripcionid;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<DetaAsistencia> getListaDetAsi() {
        return listaDetAsi;
    }

    public void setListaDetAsi(List<DetaAsistencia> listaDetAsi) {
        this.listaDetAsi = listaDetAsi;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.cabasistenciaid;
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
        final Asistencia other = (Asistencia) obj;
        if (this.cabasistenciaid != other.cabasistenciaid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Asistencia{" + "cabasistenciaid=" + cabasistenciaid + 
                ", fecha=" + fecha + 
                ", cabinscripcionid=" + cabinscripcionid.getCabcapid().getNombre() + 
                ", estado=" + estado + '}';
    }
    
    
    
}
