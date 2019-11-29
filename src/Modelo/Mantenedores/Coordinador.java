/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Mantenedores;

import java.util.Date;

/**
 *
 * @author Christian
 */
public class Coordinador {

    private int coordinadorid;
    private String tipo;
    private Date fechaingreso;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String celular;
    private String convencional;
    private String email;
    private String estado;

    public Coordinador() {
    }

    public int getCoordinadorid() {
        return coordinadorid;
    }

    public void setCoordinadorid(int coordinadorid) {
        this.coordinadorid = coordinadorid;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.coordinadorid;
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
        final Coordinador other = (Coordinador) obj;
        if (this.coordinadorid != other.coordinadorid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Coordinador{" + "coordinadorid=" + coordinadorid + ", tipo=" + tipo + ", fechaingreso=" + fechaingreso + ", cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direccion=" + direccion + ", celular=" + celular + ", convencional=" + convencional + ", email=" + email + ", estado=" + estado + '}';
    }

}
