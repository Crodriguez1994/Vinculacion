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
@Table(name = "cap_sectores")
@NamedQueries({
    @NamedQuery(name = "Sectores.findAll", query = "SELECT c FROM Sectores c ORDER BY c.sectorid ASC")
    , @NamedQuery(name = "Sectores.findBySectorid", query = "SELECT c FROM Sectores c WHERE c.sectorid = :sectorid")
    , @NamedQuery(name = "Sectores.findByEstado", query = "SELECT c FROM Sectores c WHERE c.estado = :estado")
    , @NamedQuery(name = "Sectores.findByFecha", query = "SELECT c FROM Sectores c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Sectores.findByNombre", query = "SELECT c FROM Sectores c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Sectores.getNextId", query = "SELECT coalesce(max(c.sectorid),0) +1 FROM Sectores c")})

public class Sectores implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "sectorid")
    private int sectorid;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "nombre", length = 30)
    private String nombre;
    @Column(name = "estado", length = 1)
    private String estado;

    public Sectores() {
    }

    public int getSectorid() {
        return sectorid;
    }

    public void setSectorid(int sectorid) {
        this.sectorid = sectorid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        int hash = 7;
        hash = 67 * hash + this.sectorid;
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
        final Sectores other = (Sectores) obj;
        if (this.sectorid != other.sectorid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sectores{" + "fecha=" + fecha + ", nombre=" + nombre + ", estado=" + estado + '}';
    }

}
