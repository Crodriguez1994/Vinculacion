/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Procesos;

import Modelo.Mantenedores.UnidadAtencion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Christian
 */
public class Capacitacion {

    private int cabcapid;
    private String nombre;
    private Date fecha;
    private String tipo;
    private String lugar;
    private int cupo;
    private Date fechaapertura;
    private Date fechacierre;
    private UnidadAtencion unidadid;
    private AsignacionProyecto asigproyectoid;
    private String estado;
    private List<DetaCapacitacion> listaDetaCap = new ArrayList<>();
    private List<Modulo> listaModCap = new ArrayList<>();

    public Capacitacion() {
    }

    public Capacitacion(String nombre, Date fecha, String tipo, String lugar, int cupo, Date fechaapertura, Date fechacierre, UnidadAtencion unidadid, AsignacionProyecto asigproyectoid, String estado) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.tipo = tipo;
        this.lugar = lugar;
        this.cupo = cupo;
        this.fechaapertura = fechaapertura;
        this.fechacierre = fechacierre;
        this.unidadid = unidadid;
        this.asigproyectoid = asigproyectoid;
        this.estado = estado;
    }

    public Capacitacion(int cabcapid, String nombre, Date fecha, String tipo, String lugar, int cupo, Date fechaapertura, Date fechacierre, UnidadAtencion unidadid, AsignacionProyecto asigproyectoid, String estado) {
        this.cabcapid = cabcapid;
        this.nombre = nombre;
        this.fecha = fecha;
        this.tipo = tipo;
        this.lugar = lugar;
        this.cupo = cupo;
        this.fechaapertura = fechaapertura;
        this.fechacierre = fechacierre;
        this.unidadid = unidadid;
        this.asigproyectoid = asigproyectoid;
        this.estado = estado;
    }

    public int getCabcapid() {
        return cabcapid;
    }

    public void setCabcapid(int cabcapid) {
        this.cabcapid = cabcapid;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public Date getFechaapertura() {
        return fechaapertura;
    }

    public void setFechaapertura(Date fechaapertura) {
        this.fechaapertura = fechaapertura;
    }

    public Date getFechacierre() {
        return fechacierre;
    }

    public void setFechacierre(Date fechacierre) {
        this.fechacierre = fechacierre;
    }

    public UnidadAtencion getUnidadid() {
        return unidadid;
    }

    public void setUnidadid(UnidadAtencion unidadid) {
        this.unidadid = unidadid;
    }

    public AsignacionProyecto getAsigproyectoid() {
        return asigproyectoid;
    }

    public void setAsigproyectoid(AsignacionProyecto asigproyectoid) {
        this.asigproyectoid = asigproyectoid;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<DetaCapacitacion> getListaDetaCap() {
        return listaDetaCap;
    }

    public void setListaDetaCap(List<DetaCapacitacion> listaDetaCap) {
        this.listaDetaCap = listaDetaCap;
    }

    public List<Modulo> getListaModCap() {
        return listaModCap;
    }

    public void setListaModCap(List<Modulo> listaModCap) {
        this.listaModCap = listaModCap;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.cabcapid;
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
        final Capacitacion other = (Capacitacion) obj;
        if (this.cabcapid != other.cabcapid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Capacitacion{" + "cabcapid=" + cabcapid + ", nombre=" + nombre + ", fecha=" + fecha + ", tipo=" + tipo + ", lugar=" + lugar + ", cupo=" + cupo + ", fechaapertura=" + fechaapertura + ", fechacierre=" + fechacierre + ", unidadid=" + unidadid + ", asigproyectoid=" + asigproyectoid + ", estado=" + estado + '}';
    }

}
