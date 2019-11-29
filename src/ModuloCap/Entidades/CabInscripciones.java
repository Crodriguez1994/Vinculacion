/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Christian
 */
@Entity
@Table(name = "cap_cabinscripciones")
@NamedQueries({
    @NamedQuery(name = "CabInscripciones.findAll", query = "SELECT c FROM CabInscripciones c")
    , @NamedQuery(name = "CabInscripciones.findByCabinscripcionid", query = "SELECT c FROM CabInscripciones c WHERE c.cabinscripcionid = :cabinscripcionid")
    , @NamedQuery(name = "CabInscripciones.findByEstado", query = "SELECT c FROM CabInscripciones c WHERE c.estado = :estado")
    , @NamedQuery(name = "CabInscripciones.findByFecha", query = "SELECT c FROM CabInscripciones c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "CabInscripciones.findByResponsable", query = "SELECT c FROM CabInscripciones c WHERE c.responsable = :responsable")})

public class CabInscripciones implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Identity genera los codigos
    @Basic(optional = false)
    @Column(name = "cabinscripcionid", nullable = false)
    private int cabinscripcionid;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "cabhorarioid", referencedColumnName = "cabhorarioid")
    @ManyToOne
    private CabHorarios cabhorarioid;
    @JoinColumn(name = "cabcapid", referencedColumnName = "cabcapid")
    @OneToOne
    private CabCapacitaciones cabcapid;
    @Column(name = "responsable", length = 50)
    private String responsable;
    @Column(name = "estado", length = 1)
    private String estado;
    
    
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "cabInscr")
    private List<DetaInscripciones> listaDetaInsc = new ArrayList<>();

    public CabInscripciones() {
    }

    public CabCapacitaciones getCabcapid() {
        return cabcapid;
    }

    public void setCabcapid(CabCapacitaciones cabcapid) {
        this.cabcapid = cabcapid;
    }

    public int getCabinscripcionid() {
        return cabinscripcionid;
    }

    public void setCabinscripcionid(int cabinscripcionid) {
        this.cabinscripcionid = cabinscripcionid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public CabHorarios getCabhorarioid() {
        return cabhorarioid;
    }

    public void setCabhorariid(CabHorarios cabhorarioid) {
        this.cabhorarioid = cabhorarioid;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<DetaInscripciones> getListaDetaInsc() {
        return listaDetaInsc;
    }

    public void setListaDetaInsc(List<DetaInscripciones> listaDetaInsc) {
        this.listaDetaInsc = listaDetaInsc;
    }
    
    public void addDetalle(DetaInscripciones detaInscripciones) {
        listaDetaInsc.add(detaInscripciones);
        detaInscripciones.setCabInscr(this);
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.cabinscripcionid;
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
        final CabInscripciones other = (CabInscripciones) obj;
        if (this.cabinscripcionid != other.cabinscripcionid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CabInscripciones{" + "cabinscripcionid=" + cabinscripcionid + 
                ", fecha=" + fecha + 
                ", cabhorarioid=" + cabhorarioid.getNombre() + 
                ", cabcapid=" + cabcapid.getNombre() + 
                ", responsable=" + responsable + 
                ", estado=" + estado + '}';
    }
    
    
    

}
