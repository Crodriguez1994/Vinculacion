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
 
 */
public class Horario {
    
    private int cabhorarioid;
    private Date fecha;
    private String nombre;
    private String estado;
    private List<DetaHorario> listaDetaHorario= new ArrayList<>();

    public Horario() {
    }

    public Horario(int cabhorarioid, Date fecha, String nombre, String estado) {
        this.cabhorarioid = cabhorarioid;
        this.fecha = fecha;
        this.nombre = nombre;
        this.estado = estado;
    }

    
    public Horario(Date fecha, String nombre, String estado) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getCabhorarioid() {
        return cabhorarioid;
    }

    public void setCabhorarioid(int cabhorarioid) {
        this.cabhorarioid = cabhorarioid;
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

    public List<DetaHorario> getListaDetaHorario() {
        return listaDetaHorario;
    }

    public void setListaDetaHorario(List<DetaHorario> listaDetaHorario) {
        this.listaDetaHorario = listaDetaHorario;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.cabhorarioid;
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
        final Horario other = (Horario) obj;
        if (this.cabhorarioid != other.cabhorarioid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Horario{" + "cabhorarioid=" + cabhorarioid + ", fecha=" + fecha + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    
    
}
