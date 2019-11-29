/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Mantenedores;

/**
 *
 * @author Christian
 */
public class ProyectoSector {

    private ProyectoPK compuestaPk;
    private int asigid;
    private Proyecto proyecto;
    private Sector sector;

    public ProyectoSector() {
    }

    public ProyectoSector(Proyecto proyecto, Sector sector) {
        this.proyecto = proyecto;
        this.sector = sector;
    }

    public ProyectoSector(int asigid, Proyecto proyecto, Sector sector) {
        this.asigid = asigid;
        this.proyecto = proyecto;
        this.sector = sector;
    }

    public ProyectoSector(ProyectoPK compuestaPk, int asigid, Proyecto proyecto, Sector sector) {
        this.compuestaPk = compuestaPk;
        this.asigid = asigid;
        this.proyecto = proyecto;
        this.sector = sector;
    }

    public int getAsigid() {
        return asigid;
    }

    public void setAsigid(int asigid) {
        this.asigid = asigid;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public ProyectoPK getCompuestaPk() {
        return compuestaPk;
    }

    public void setCompuestaPk(ProyectoPK compuestaPk) {
        this.compuestaPk = compuestaPk;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.asigid;
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
        final ProyectoSector other = (ProyectoSector) obj;
        if (this.asigid != other.asigid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProyectoSector{" + "compuestaPk=" + compuestaPk + ", asigid=" + asigid + ", proyecto=" + proyecto + ", sector=" + sector + '}';
    }

}
