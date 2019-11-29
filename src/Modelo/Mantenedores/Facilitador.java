/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Mantenedores;

import ModuloCap.Entidades.Bioempleados;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Christian
 */
public class Facilitador implements Serializable {

    private int facilitadorid;
    private String tipo;
    private Bioempleados empleadoid;
    private Date fechaingreso;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String celular;
    private String convencional;
    private String email;
    private Especialidad especialidad;
    private String estado;
    private boolean seleccionar;

    public Facilitador() {
    }

    public Facilitador(int facilitadorid, String tipo, Bioempleados empleadoid, Date fechaingreso, String cedula, String nombres, String apellidos, String direccion, String celular, String convencional, String email, Especialidad especialidad, String estado, boolean seleccionar) {
        this.facilitadorid = facilitadorid;
        this.tipo = tipo;
        this.empleadoid = empleadoid;
        this.fechaingreso = fechaingreso;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.celular = celular;
        this.convencional = convencional;
        this.email = email;
        this.especialidad = especialidad;
        this.estado = estado;
        this.seleccionar = seleccionar;
    }

    public Facilitador(String tipo, Bioempleados empleadoid, Date fechaingreso, String cedula, String nombres, String apellidos, String direccion, String celular, String convencional, String email, Especialidad especialidad, String estado, boolean seleccionar) {
        this.tipo = tipo;
        this.empleadoid = empleadoid;
        this.fechaingreso = fechaingreso;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.celular = celular;
        this.convencional = convencional;
        this.email = email;
        this.especialidad = especialidad;
        this.estado = estado;
        this.seleccionar = seleccionar;
    }

    public int getFacilitadorid() {
        return facilitadorid;
    }

    public void setFacilitadorid(int facilitadorid) {
        this.facilitadorid = facilitadorid;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Bioempleados getEmpleadoid() {
        return empleadoid;
    }

    public void setEmpleadoid(Bioempleados empleadoid) {
        this.empleadoid = empleadoid;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isSeleccionar() {
        return seleccionar;
    }

    public void setSeleccionar(boolean seleccionar) {
        this.seleccionar = seleccionar;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getConvencional() {
        return convencional;
    }

    public void setConvencional(String convencional) {
        this.convencional = convencional;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.facilitadorid;
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
        final Facilitador other = (Facilitador) obj;
        if (this.facilitadorid != other.facilitadorid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Facilitador{" + "facilitadorid=" + facilitadorid + ", tipo=" + tipo + ", empleadoid=" + empleadoid + ", fechaingreso=" + fechaingreso + ", cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direccion=" + direccion + ", celular=" + celular + ", convencional=" + convencional + ", email=" + email + ", especialidad=" + especialidad + ", estado=" + estado + ", seleccionar=" + seleccionar + '}';
    }

}
