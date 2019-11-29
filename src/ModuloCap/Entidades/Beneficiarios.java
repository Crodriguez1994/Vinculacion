/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Christian
 */
@Entity
@Table(name = "cap_beneficiarios")
@NamedQueries({
    @NamedQuery(name = "Beneficiarios.findAll", query = "SELECT c FROM Beneficiarios c ORDER BY c.beneficiarioid ASC")
    , @NamedQuery(name = "Beneficiarios.findByBeneficiarioid", query = "SELECT c FROM Beneficiarios c WHERE c.beneficiarioid = :beneficiarioid")
    , @NamedQuery(name = "Beneficiarios.findByApellidos", query = "SELECT c FROM Beneficiarios c WHERE c.apellidos = :apellidos")
    , @NamedQuery(name = "Beneficiarios.findByCedula", query = "SELECT c FROM Beneficiarios c WHERE c.cedula = :cedula")
    , @NamedQuery(name = "Beneficiarios.findByEstado", query = "SELECT c FROM Beneficiarios c WHERE c.estado = :estado")
    , @NamedQuery(name = "Beneficiarios.findByFecha", query = "SELECT c FROM Beneficiarios c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Beneficiarios.findByNombres", query = "SELECT c FROM Beneficiarios c WHERE c.nombres = :nombres")
    , @NamedQuery(name = "Beneficiarios.getNextId", query = "SELECT coalesce(max(c.beneficiarioid),0) +1 FROM Beneficiarios c")})

public class Beneficiarios implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "beneficiarioid")
    private int beneficiarioid;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "cedula", length = 13)
    private String cedula;
    @Column(name = "nombres", length = 30)
    private String nombres;
    @Column(name = "apellidos", length = 30)
    private String apellidos;
    @Column(name = "direccion", length = 30)
    private String direccion;
    @Column(name = "celular", length = 15)
    private String celular;
    @Column(name = "convencional", length = 15)
    private String convencional;
    @Column(name = "email", length = 50)
    private String email;
    @Column(name = "estado", length = 1)
    private String estado;

    public Beneficiarios() {
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

}
