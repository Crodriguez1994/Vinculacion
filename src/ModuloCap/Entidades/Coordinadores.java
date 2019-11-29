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
@Table(name = "cap_coordinadores")
@NamedQueries({
    @NamedQuery(name = "Coordinadores.findAll", query = "SELECT c FROM Coordinadores c ORDER BY c.coordinadorid ASC")
    , @NamedQuery(name = "Coordinadores.findByCoordinadorid", query = "SELECT c FROM Coordinadores c WHERE c.coordinadorid = :coordinadorid")
    , @NamedQuery(name = "Coordinadores.findByApellidos", query = "SELECT c FROM Coordinadores c WHERE c.apellidos = :apellidos")
    , @NamedQuery(name = "Coordinadores.findByCedula", query = "SELECT c FROM Coordinadores c WHERE c.cedula = :cedula")
    , @NamedQuery(name = "Coordinadores.findByEstado", query = "SELECT c FROM Coordinadores c WHERE c.estado = :estado")
    , @NamedQuery(name = "Coordinadores.findByFechaingreso", query = "SELECT c FROM Coordinadores c WHERE c.fechaingreso = :fechaingreso")
    , @NamedQuery(name = "Coordinadores.findByNombres", query = "SELECT c FROM Coordinadores c WHERE c.nombres = :nombres")
    , @NamedQuery(name = "Coordinadores.findByTipo", query = "SELECT c FROM Coordinadores c WHERE c.tipo = :tipo")
    , @NamedQuery(name = "Coordinadores.getNextId", query = "SELECT coalesce(max(c.coordinadorid),0) +1 FROM Coordinadores c")})

public class Coordinadores implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "coordinadorid")
    private int coordinadorid;
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
    @Column(name = "estado", length = 1)
    private String estado;

    public Coordinadores() {
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
