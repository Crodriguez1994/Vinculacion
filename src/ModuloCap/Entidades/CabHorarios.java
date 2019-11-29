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
@Table(name = "cap_cabhorarios")
@NamedQueries({
    @NamedQuery(name = "CabHorarios.findAll", query = "SELECT c FROM CabHorarios c")
    , @NamedQuery(name = "CabHorarios.findByCabhorarioid", query = "SELECT c FROM CabHorarios c WHERE c.cabhorarioid = :cabhorarioid")
    , @NamedQuery(name = "CabHorarios.findByEstado", query = "SELECT c FROM CabHorarios c WHERE c.estado = :estado")
    , @NamedQuery(name = "CabHorarios.findByFecha", query = "SELECT c FROM CabHorarios c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "CabHorarios.findByNombre", query = "SELECT c FROM CabHorarios c WHERE c.nombre = :nombre")})

public class CabHorarios implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Identity genera los codigos
    @Basic(optional = false)
    @Column(name = "cabhorarioid")
    private int cabhorarioid;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "nombre", length = 20)
    private String nombre;
    @Column(name = "estado", length = 1)
    private String estado;
    
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "cabHorid")
    private List<DetaHorarios> listaDetaHorario = new ArrayList<>();

    public CabHorarios() {
    }

    public int getCabhorarioid() {
        return cabhorarioid;
    }

    public void setCabhorarioid(int cabhorarioid) {
        this.cabhorarioid = cabhorarioid;
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

    public List<DetaHorarios> getListaDetaHorario() {
        return listaDetaHorario;
    }

    public void setListaDetaHorario(List<DetaHorarios> listaDetaHorario) {
        this.listaDetaHorario = listaDetaHorario;
    }

    public void addDetalle(DetaHorarios detaHorario) {
        listaDetaHorario.add(detaHorario);
        detaHorario.setCabHorid(this);
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.cabhorarioid;
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
        final CabHorarios other = (CabHorarios) obj;
        if (this.cabhorarioid != other.cabhorarioid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cabhorarios{" + "cabhorarioid=" + cabhorarioid + 
                ", fecha=" + fecha + 
                ", nombre=" + nombre + 
                ", estado=" + estado + '}';
    }

}
