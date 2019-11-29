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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "cap_asigproyectos")
@NamedQueries({
    @NamedQuery(name = "AsigProyectos.findAll", query = "SELECT c FROM AsigProyectos c ORDER BY c.asigproyectoid ASC")
    , @NamedQuery(name = "AsigProyectos.findByAsigproyectoid", query = "SELECT c FROM AsigProyectos c WHERE c.asigproyectoid = :asigproyectoid")
    , @NamedQuery(name = "AsigProyectos.findByProyectoid", query = "SELECT c FROM AsigProyectos c WHERE c.proyectoid.proyectoid = :proyectoid")
    , @NamedQuery(name = "AsigProyectos.findByCoordinadorid", query = "SELECT c FROM AsigProyectos c WHERE c.coordinadorid.coordinadorid = :coordinadorid")
    , @NamedQuery(name = "AsigProyectos.findByEstado", query = "SELECT c FROM AsigProyectos c WHERE c.estado = :estado")
    , @NamedQuery(name = "AsigProyectos.findByFecha", query = "SELECT c FROM AsigProyectos c WHERE c.fecha = :fecha")})
public class AsigProyectos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Identity genera los codigos
    @Basic(optional = false)
    @Column(name = "asigproyectoid")
    private int asigproyectoid;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "coordinadorid", referencedColumnName = "coordinadorid")
    @ManyToOne
    private Coordinadores coordinadorid;
    @JoinColumn(name = "proyectoid", referencedColumnName = "proyectoid")
    @ManyToOne
    private Proyectos proyectoid;
    @Column(name = "estado", length = 1)
    private String estado;

    public AsigProyectos() {
    }

    public int getAsigproyectoid() {
        return asigproyectoid;
    }

    public void setAsigproyectoid(int asigproyectoid) {
        this.asigproyectoid = asigproyectoid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Coordinadores getCoordinadorid() {
        return coordinadorid;
    }

    public void setCoordinadorid(Coordinadores coordinadorid) {
        this.coordinadorid = coordinadorid;
    }

    public Proyectos getProyectoid() {
        return proyectoid;
    }

    public void setProyectoid(Proyectos proyectoid) {
        this.proyectoid = proyectoid;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.asigproyectoid;
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
        final AsigProyectos other = (AsigProyectos) obj;
        if (this.asigproyectoid != other.asigproyectoid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return fecha + "  " + coordinadorid.getNombres() + "   " + proyectoid.getNombre() + "      " + estado;
    }

}
