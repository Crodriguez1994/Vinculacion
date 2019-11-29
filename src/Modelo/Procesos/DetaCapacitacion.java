/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Procesos;

import Modelo.Mantenedores.Facilitador;

/**
 *
 * @author Christian
 */
public class DetaCapacitacion {

    private CapacitacionPK compuestaPk;
    private int detaCapacitacionid;
    private Facilitador facilitadorid;
    private Capacitacion cabCapid;

    public DetaCapacitacion() {
    }

    public DetaCapacitacion(int detaCapacitacionid, Facilitador facilitadorid, Capacitacion cabCapid) {
        this.detaCapacitacionid = detaCapacitacionid;
        this.facilitadorid = facilitadorid;
        this.cabCapid = cabCapid;
    }

    public DetaCapacitacion(CapacitacionPK compuestaPk, int detaCapacitacionid, Facilitador facilitadorid, Capacitacion cabCapid) {
        this.compuestaPk = compuestaPk;
        this.detaCapacitacionid = detaCapacitacionid;
        this.facilitadorid = facilitadorid;
        this.cabCapid = cabCapid;
    }

    public int getDetaCapacitacionid() {
        return detaCapacitacionid;
    }

    public void setDetaCapacitacionid(int detaCapacitacionid) {
        this.detaCapacitacionid = detaCapacitacionid;
    }

    public Facilitador getFacilitadorid() {
        return facilitadorid;
    }

    public void setFacilitadorid(Facilitador facilitadorid) {
        this.facilitadorid = facilitadorid;
    }

    public Capacitacion getCabCapid() {
        return cabCapid;
    }

    public void setCabCapid(Capacitacion cabCapid) {
        this.cabCapid = cabCapid;
    }

    public CapacitacionPK getCompuestaPk() {
        return compuestaPk;
    }

    public void setCompuestaPk(CapacitacionPK compuestaPk) {
        this.compuestaPk = compuestaPk;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.detaCapacitacionid;
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
        final DetaCapacitacion other = (DetaCapacitacion) obj;
        if (this.detaCapacitacionid != other.detaCapacitacionid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DetaCapacitacion{" + "compuestaPk=" + compuestaPk + ", detaCapacitacionid=" + detaCapacitacionid + ", facilitadorid=" + facilitadorid + ", cabCapid=" + cabCapid + '}';
    }

  

}
