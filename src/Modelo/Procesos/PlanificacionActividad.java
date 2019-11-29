/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Procesos;

import java.util.Date;

/**
 *
 
 */
public class PlanificacionActividad {
    
    private int planificacionid;
    private Agenda cabagendaid;
    private String tipo;
    private Date fecha;
    private String lugar;
    private String actividad;
    private String objetivo;
    private String resultados;

    public PlanificacionActividad() {
    }

    public PlanificacionActividad(int planificacionid, Agenda cabagendaid, String tipo, Date fecha, String lugar, String actividad, String objetivo, String resultados) {
        this.planificacionid = planificacionid;
        this.cabagendaid = cabagendaid;
        this.tipo = tipo;
        this.fecha = fecha;
        this.lugar = lugar;
        this.actividad = actividad;
        this.objetivo = objetivo;
        this.resultados = resultados;
    }

    public PlanificacionActividad(Agenda cabagendaid, String tipo, Date fecha, String lugar, String actividad, String objetivo, String resultados) {
        this.cabagendaid = cabagendaid;
        this.tipo = tipo;
        this.fecha = fecha;
        this.lugar = lugar;
        this.actividad = actividad;
        this.objetivo = objetivo;
        this.resultados = resultados;
    }

    public int getPlanificacionid() {
        return planificacionid;
    }

    public void setPlanificacionid(int planificacionid) {
        this.planificacionid = planificacionid;
    }

    public Agenda getCabagendaid() {
        return cabagendaid;
    }

    public void setCabagendaid(Agenda cabagendaid) {
        this.cabagendaid = cabagendaid;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getResultados() {
        return resultados;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.planificacionid;
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
        final PlanificacionActividad other = (PlanificacionActividad) obj;
        if (this.planificacionid != other.planificacionid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PlanificacionActividad{" + "planificacionid=" + planificacionid + 
                ", cabagendaid=" + cabagendaid + 
                ", tipo=" + tipo + 
                ", fecha=" + fecha + 
                ", lugar=" + lugar + 
                ", actividad=" + actividad + 
                ", objetivo=" + objetivo + 
                ", resultados=" + resultados + '}';
    }
    
    
    
}
