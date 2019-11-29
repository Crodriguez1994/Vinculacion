/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Mantenedores;

import java.util.Date;


public class Beneficiario {
    
    private int beneficiarioid;
    private Date fecha;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String celular;
    private String convencional;
    private String email;
    private String estado;
    
    private boolean seleccionar;

    public Beneficiario() {
    }

    public Beneficiario(int beneficiarioid, Date fecha, String cedula, String nombres, String apellidos, String direccion, String celular, String convencional, String email, String estado, boolean seleccionar) {
        this.beneficiarioid = beneficiarioid;
        this.fecha = fecha;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.celular = celular;
        this.convencional = convencional;
        this.email = email;
        this.estado = estado;
        this.seleccionar = seleccionar;
    }

    public Beneficiario(Date fecha, String cedula, String nombres, String apellidos, String direccion, String celular, String convencional, String email, String estado, boolean seleccionar) {
        this.fecha = fecha;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.celular = celular;
        this.convencional = convencional;
        this.email = email;
        this.estado = estado;
        this.seleccionar = seleccionar;
    }

   

    public int getBeneficiarioid() {
        return beneficiarioid;
    }

    public void setBeneficiarioid(int beneficiarioid) {
        this.beneficiarioid = beneficiarioid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        int hash = 7;
        hash = 53 * hash + this.beneficiarioid;
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
        final Beneficiario other = (Beneficiario) obj;
        if (this.beneficiarioid != other.beneficiarioid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beneficiario{" + "beneficiarioid=" + beneficiarioid + ", fecha=" + fecha + ", cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direccion=" + direccion + ", celular=" + celular + ", convencional=" + convencional + ", email=" + email + ", estado=" + estado + ", seleccionar=" + seleccionar + '}';
    }
    
    
    
}
