/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Procesos;

import java.util.Date;

/**
 *
 * @author Christian
 */
public class Modulo {
    private ModuloPK compuestaPk;
    private int moduloid;
    private String nombre;
    private Date fecha;
    private String estado;
    private Capacitacion cabCapid;

    public Modulo(String nombre, Date fecha, String estado) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Modulo(int moduloid, String nombre, Date fecha, String estado) {
        this.moduloid = moduloid;
        this.nombre = nombre;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Modulo(ModuloPK compuestaPk, int moduloid, String nombre, Date fecha, String estado, Capacitacion cabCapid) {
        this.compuestaPk = compuestaPk;
        this.moduloid = moduloid;
        this.nombre = nombre;
        this.fecha = fecha;
        this.estado = estado;
        this.cabCapid = cabCapid;
    }

    public Modulo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getModuloid() {
        return moduloid;
    }

    public void setModuloid(int moduloid) {
        this.moduloid = moduloid;
    }

    public Capacitacion getCabCapid() {
        return cabCapid;
    }

    public void setCabCapid(Capacitacion cabCapid) {
        this.cabCapid = cabCapid;
    }

    public ModuloPK getCompuestaPk() {
        return compuestaPk;
    }

    public void setCompuestaPk(ModuloPK compuestaPk) {
        this.compuestaPk = compuestaPk;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.moduloid;
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
        final Modulo other = (Modulo) obj;
        if (this.moduloid != other.moduloid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modulo{" + "compuestaPk=" + compuestaPk + ", moduloid=" + moduloid + ", nombre=" + nombre + ", fecha=" + fecha + ", estado=" + estado + ", cabCapid=" + cabCapid + '}';
    }

}
