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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "cap_facilitadores")
@NamedQueries({
    @NamedQuery(name = "Facilitadores.findAll", query = "SELECT c FROM Facilitadores c ORDER BY c.facilitadorid ASC")
    , @NamedQuery(name = "Facilitadores.findByFacilitadorid", query = "SELECT c FROM Facilitadores c WHERE c.facilitadorid = :facilitadorid")
    , @NamedQuery(name = "Facilitadores.findByApellidos", query = "SELECT c FROM Facilitadores c WHERE c.apellidos = :apellidos")
    , @NamedQuery(name = "Facilitadores.findByCedula", query = "SELECT c FROM Facilitadores c WHERE c.cedula = :cedula")
    , @NamedQuery(name = "Facilitadores.findByEstado", query = "SELECT c FROM Facilitadores c WHERE c.estado = :estado")
    , @NamedQuery(name = "Facilitadores.findByFechaingreso", query = "SELECT c FROM Facilitadores c WHERE c.fechaingreso = :fechaingreso")
    , @NamedQuery(name = "Facilitadores.findByNombres", query = "SELECT c FROM Facilitadores c WHERE c.nombres = :nombres")
    , @NamedQuery(name = "Facilitadores.findByTipo", query = "SELECT c FROM Facilitadores c WHERE c.tipo = :tipo")
    , @NamedQuery(name = "Facilitadores.getNextId", query = "SELECT coalesce(max(c.facilitadorid),0) +1 FROM Facilitadores c")})

public class Facilitadores implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "facilitadorid")
    private int facilitadorid;
    @Column(name = "tipo", length = 1)
    private String tipo;
    @JoinColumn(name = "empleadoid", referencedColumnName = "empleadoid")
    @ManyToOne
    private Bioempleados empleadoid;
    @Column(name = "fechaingreso")
    @Temporal(TemporalType.DATE)
    private Date fechaingreso;
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
    @JoinColumn(name = "especialidadid", referencedColumnName = "especialidadid")
    @ManyToOne
    private Especialidades especialidadid;
    @Column(name = "estado", length = 1)
    private String estado;
    
    
    public Facilitadores() {
    }

    public int getFacilitadorid() {
        return facilitadorid;
    }

    public void setFacilitadorid(int facilitadorid) {
        this.facilitadorid = facilitadorid;
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

    public Especialidades getEspecialidadid() {
        return especialidadid;
    }

    public void setEspecialidadid(Especialidades especialidadid) {
        this.especialidadid = especialidadid;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.facilitadorid;
        return hash;
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
