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
import javax.persistence.JoinColumns;
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
@Table(name = "cap_cabagendas")
@NamedQueries({
    @NamedQuery(name = "CabAgendas.findAll", query = "SELECT c FROM CabAgendas c ORDER BY c.cabagendaid ASC")
    , @NamedQuery(name = "CabAgendas.findByCabagendaid", query = "SELECT c FROM CabAgendas c WHERE c.cabagendaid = :cabagendaid")
    , @NamedQuery(name = "CabAgendas.findByDia", query = "SELECT c FROM CabAgendas c WHERE c.dia = :dia")
    , @NamedQuery(name = "CabAgendas.findByEstado", query = "SELECT c FROM CabAgendas c WHERE c.estado = :estado")
    , @NamedQuery(name = "CabAgendas.findByFecha", query = "SELECT c FROM CabAgendas c WHERE c.fecha = :fecha")})

public class CabAgendas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Identity genera los codigos
    @Basic(optional = false)
    @Column(name = "cabagendaid")
    private int cabagendaid;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumns({
        @JoinColumn(name = "moduloid", referencedColumnName = "moduloid")
        , @JoinColumn(name = "cabcapid", referencedColumnName = "cabcapid")})
    @ManyToOne
    private ModulosCapacitaciones moduloid;
    @Column(name = "dia")
    private int dia;
    @Column(name = "estado", length = 1)
    private String estado;
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "cabAgendaid")//variable debe ser igual al cabCapacitaciones del detalle
    private List<DetaAgendas> listaDetaAgenda = new ArrayList<>();

    public CabAgendas() {
    }

    public int getCabagendaid() {
        return cabagendaid;
    }

    public void setCabagendaid(int cabagendaid) {
        this.cabagendaid = cabagendaid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ModulosCapacitaciones getModuloid() {
        return moduloid;
    }

    public void setModuloid(ModulosCapacitaciones moduloid) {
        this.moduloid = moduloid;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<DetaAgendas> getListaDetaAgenda() {
        return listaDetaAgenda;
    }

    public void setListaDetaAgenda(List<DetaAgendas> listaDetaAgenda) {
        this.listaDetaAgenda = listaDetaAgenda;
    }

    public void addDetalle(DetaAgendas detaAgendas) {
        listaDetaAgenda.add(detaAgendas);
        detaAgendas.setCabAgendaid(this);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.cabagendaid;
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
        final CabAgendas other = (CabAgendas) obj;
        if (this.cabagendaid != other.cabagendaid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CabAgendas{" + "cabagendaid=" + cabagendaid 
                + ", fecha=" + fecha + ", moduloid=" + moduloid 
                + ", dia=" + dia + ", estado=" + estado 
                + ", listaDetaAgenda=" + listaDetaAgenda + '}';
    }

}
