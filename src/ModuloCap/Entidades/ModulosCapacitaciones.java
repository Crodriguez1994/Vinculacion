/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
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
@Table(name = "cap_moduloscapacitaciones")
@NamedQueries({
    @NamedQuery(name = "ModulosCapacitaciones.findAll", query = "SELECT c FROM ModulosCapacitaciones c ")
    , @NamedQuery(name = "ModulosCapacitaciones.findByCabcapid", query = "SELECT c FROM ModulosCapacitaciones c WHERE c.modulocap.cabcapid = :cabcapid")
    , @NamedQuery(name = "ModulosCapacitaciones.findByModuloid", query = "SELECT c FROM ModulosCapacitaciones c WHERE c.modulocap.moduloid = :moduloid")
    , @NamedQuery(name = "ModulosCapacitaciones.findByEstado", query = "SELECT c FROM ModulosCapacitaciones c WHERE c.estado = :estado")
    , @NamedQuery(name = "ModulosCapacitaciones.findByFecha", query = "SELECT c FROM ModulosCapacitaciones c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "ModulosCapacitaciones.findByNombre", query = "SELECT c FROM ModulosCapacitaciones c WHERE c.nombre = :nombre")})

public class ModulosCapacitaciones implements Serializable {

    @EmbeddedId
    private ModulosCapacitacionesPK modulocap;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "nombre", length = 30)
    private String nombre;
    @Column(name = "estado", length = 1)
    private String estado;
    @MapsId("cabcapid")
    @JoinColumn(name = "cabcapid", referencedColumnName = "cabcapid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CabCapacitaciones cabCapid;
    

    public ModulosCapacitaciones() {
    }

    public ModulosCapacitacionesPK getModulocap() {
        return modulocap;
    }

    public void setModulocap(ModulosCapacitacionesPK modulocap) {
        this.modulocap = modulocap;
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

    public CabCapacitaciones getCabCapid() {
        return cabCapid;
    }

    public void setCabCapid(CabCapacitaciones cabCapid) {
        this.cabCapid = cabCapid;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.modulocap);
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
        final ModulosCapacitaciones other = (ModulosCapacitaciones) obj;
        if (!Objects.equals(this.modulocap, other.modulocap)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ModulosCapacitaciones{" + "modulocap=" + modulocap 
                + ", fecha=" + fecha 
                + ", nombre=" + nombre + ", estado=" + estado + ", cabCapid=" + cabCapid + '}';
    }

   

}
