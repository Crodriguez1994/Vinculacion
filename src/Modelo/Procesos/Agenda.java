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
public class Agenda {
    
    private int cabagendaid;
    private Date fecha;
    private int dia;
    private Modulo moduloid;
    private String estado;
    private List<DetaAgenda> listaDetaAgenda = new ArrayList<>();

    public Agenda() {
    }

    public Agenda(int cabagendaid, Date fecha, int dia, Modulo moduloid, String estado) {
        this.cabagendaid = cabagendaid;
        this.fecha = fecha;
        this.dia = dia;
        this.moduloid = moduloid;
        this.estado = estado;
    }

    public Agenda(Date fecha, int dia, Modulo moduloid, String estado) {
        this.fecha = fecha;
        this.dia = dia;
        this.moduloid = moduloid;
        this.estado = estado;
    }

    public int getCabagendaid() {
        return cabagendaid;
    }

    public void setCabagendaid(int cabagendaid) {
        this.cabagendaid = cabagendaid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Modulo getModuloid() {
        return moduloid;
    }

    public void setModuloid(Modulo moduloid) {
        this.moduloid = moduloid;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<DetaAgenda> getListaDetaAgenda() {
        return listaDetaAgenda;
    }

    public void setListaDetaAgenda(List<DetaAgenda> listaDetaAgenda) {
        this.listaDetaAgenda = listaDetaAgenda;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.cabagendaid;
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
        final Agenda other = (Agenda) obj;
        if (this.cabagendaid != other.cabagendaid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Agenda{" + "cabagendaid=" + cabagendaid + 
                ", fecha=" + fecha + 
                ", dia=" + dia + 
                ", moduloid=" + moduloid + 
                ", estado=" + estado + 
                ", listaDetaAgenda=" + listaDetaAgenda + '}';
    }

    
    
    
}
