/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Procesos;

/**
 *
 *
 */
public class DetaAgenda {

    private AgendaPK compuestaPk;
    private int detagendaid;
    private String horainicio;
    private String horafin;
    private String actividad;
    private String estrategia;
    private String responsable;
    private Agenda cabAgendaid;

    public DetaAgenda() {
    }

    public DetaAgenda(int detagendaid, String horainicio, String horafin, String actividad, String estrategia, String responsable, Agenda cabAgendaid) {
        this.detagendaid = detagendaid;
        this.horainicio = horainicio;
        this.horafin = horafin;
        this.actividad = actividad;
        this.estrategia = estrategia;
        this.responsable = responsable;
        this.cabAgendaid = cabAgendaid;
    }

    public DetaAgenda(String horainicio, String horafin, String actividad, String estrategia, String responsable, Agenda cabAgendaid) {
        this.horainicio = horainicio;
        this.horafin = horafin;
        this.actividad = actividad;
        this.estrategia = estrategia;
        this.responsable = responsable;
        this.cabAgendaid = cabAgendaid;
    }

    public DetaAgenda(AgendaPK compuestaPk, int detagendaid, String horainicio, String horafin, String actividad, String estrategia, String responsable, Agenda cabAgendaid) {
        this.compuestaPk = compuestaPk;
        this.detagendaid = detagendaid;
        this.horainicio = horainicio;
        this.horafin = horafin;
        this.actividad = actividad;
        this.estrategia = estrategia;
        this.responsable = responsable;
        this.cabAgendaid = cabAgendaid;
    }

    public int getDetagendaid() {
        return detagendaid;
    }

    public void setDetagendaid(int detagendaid) {
        this.detagendaid = detagendaid;
    }

    public String getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }

    public String getHorafin() {
        return horafin;
    }

    public void setHorafin(String horafin) {
        this.horafin = horafin;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public Agenda getCabAgendaid() {
        return cabAgendaid;
    }

    public void setCabAgendaid(Agenda cabAgendaid) {
        this.cabAgendaid = cabAgendaid;
    }

    public AgendaPK getCompuestaPk() {
        return compuestaPk;
    }

    public void setCompuestaPk(AgendaPK compuestaPk) {
        this.compuestaPk = compuestaPk;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.detagendaid;
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
        final DetaAgenda other = (DetaAgenda) obj;
        if (this.detagendaid != other.detagendaid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DetaAgenda{" + "compuestaPk=" + compuestaPk 
                + ", detagendaid=" + detagendaid 
                + ", horainicio=" + horainicio 
                + ", horafin=" + horafin 
                + ", actividad=" + actividad 
                + ", estrategia=" + estrategia 
                + ", responsable=" + responsable 
                + ", cabAgendaid=" + cabAgendaid + '}';
    }

}
