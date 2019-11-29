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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Christian
 */
@Entity
@Table(name = "cap_cabasistencias")
@NamedQueries({
    @NamedQuery(name = "CabAsistencias.findAll", query = "SELECT c FROM CabAsistencias c")
    , @NamedQuery(name = "CabAsistencias.findByCabasistenciaid", query = "SELECT c FROM CabAsistencias c WHERE c.cabasistenciaid = :cabasistenciaid")
    , @NamedQuery(name = "CabAsistencias.findByEstado", query = "SELECT c FROM CabAsistencias c WHERE c.estado = :estado")
    , @NamedQuery(name = "CabAsistencias.findByFecha", query = "SELECT c FROM CabAsistencias c WHERE c.fecha = :fecha")})

public class CabAsistencias implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Identity genera los codigos
    @Basic(optional = false)
    @Column(name = "cabasistenciaid")
    private int cabasistenciaid;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "cabinscripcionid", referencedColumnName = "cabinscripcionid")
    @ManyToOne
    private CabInscripciones cabinscripcionid;
    @Column(name = "estado", length = 1)
    private String estado;
    
    
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "CabAsis")
    private List<DetaAsistencias> listaDetAsi = new ArrayList<>();

    public CabAsistencias() {
    }

    public int getCabasistenciaid() {
        return cabasistenciaid;
    }

    public void setCabasistenciaid(int cabasistenciaid) {
        this.cabasistenciaid = cabasistenciaid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public CabInscripciones getCabinscripcionid() {
        return cabinscripcionid;
    }

    public void setCabinscripcionid(CabInscripciones cabinscripcionid) {
        this.cabinscripcionid = cabinscripcionid;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<DetaAsistencias> getListaDetAsi() {
        return listaDetAsi;
    }

    public void setListaDetAsi(List<DetaAsistencias> listaDetAsi) {
        this.listaDetAsi = listaDetAsi;
    }
    
    public void addDetalle(DetaAsistencias detaAsistencia) {
        listaDetAsi.add(detaAsistencia);
        detaAsistencia.setCabAsis(this);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.cabasistenciaid;
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
        final CabAsistencias other = (CabAsistencias) obj;
        if (this.cabasistenciaid != other.cabasistenciaid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CabAsistencias{" + "cabasistenciaid=" + cabasistenciaid + ", fecha=" + fecha + 
                ", cabinscripcionid=" + cabinscripcionid.getCabcapid().getNombre() + 
                ", estado=" + estado + '}';
    }
            
    

}
