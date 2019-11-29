/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
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
@Table(name = "cap_unidadesatencion")
@NamedQueries({
    @NamedQuery(name = "UnidadesAtencion.findAll", query = "SELECT c FROM UnidadesAtencion c ORDER BY c.unidadid ASC")
    , @NamedQuery(name = "UnidadesAtencion.findByUnidadid", query = "SELECT c FROM UnidadesAtencion c WHERE c.unidadid = :unidadid")
    , @NamedQuery(name = "UnidadesAtencion.findByProyectoid", query = "SELECT c FROM UnidadesAtencion c WHERE c.proyectoid.proyectoid = :proyectoid")
    , @NamedQuery(name = "UnidadesAtencion.findBySectorid", query = "SELECT c FROM UnidadesAtencion c WHERE c.sectorid.sectorid = :sectorid")
    , @NamedQuery(name = "UnidadesAtencion.findByEstado", query = "SELECT c FROM UnidadesAtencion c WHERE c.estado = :estado")
    , @NamedQuery(name = "UnidadesAtencion.findByFecha", query = "SELECT c FROM UnidadesAtencion c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "UnidadesAtencion.findByNombre", query = "SELECT c FROM UnidadesAtencion c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "UnidadesAtencion.getNextId", query = "SELECT coalesce(max(c.unidadid),0) +1 FROM UnidadesAtencion c")})

public class UnidadesAtencion implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "unidadid")
    private int unidadid;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "proyectoid", referencedColumnName = "proyectoid")
    @ManyToOne
    private Proyectos proyectoid;
    @JoinColumn(name = "sectorid", referencedColumnName = "sectorid")
    @ManyToOne
    private Sectores sectorid;
    @Column(name = "nombre", length = 30)
    private String nombre;
    @Column(name = "estado", length = 1)
    private String estado;

    public UnidadesAtencion() {
    }

    public int getUnidadid() {
        return unidadid;
    }

    public void setUnidadid(int unidadid) {
        this.unidadid = unidadid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Proyectos getProyectoid() {
        return proyectoid;
    }

    public void setProyectoid(Proyectos proyectoid) {
        this.proyectoid = proyectoid;
    }

    public Sectores getSectorid() {
        return sectorid;
    }

    public void setSectorid(Sectores sectorid) {
        this.sectorid = sectorid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.unidadid;
        hash = 59 * hash + Objects.hashCode(this.proyectoid);
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
        final UnidadesAtencion other = (UnidadesAtencion) obj;
        if (this.unidadid != other.unidadid) {
            return false;
        }
        if (!Objects.equals(this.proyectoid, other.proyectoid)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "unidadesatencion{" + "fecha=" + fecha
                + ", proyectoid=" + proyectoid.getNombre()
                + ", sectorid=" + sectorid.getNombre()
                + ", nombre=" + nombre
                + ", estado=" + estado + '}';
    }

}
