/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Entidades;

import java.io.Serializable;
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

/**
 *
 * @author Christian
 */
@Entity
@Table(name = "cap_detahorarios")
@NamedQueries({
    @NamedQuery(name = "DetaHorarios.findAll", query = "SELECT c FROM DetaHorarios c")
    , @NamedQuery(name = "DetaHorarios.findByCabhorarioid", query = "SELECT c FROM DetaHorarios c WHERE c.detahorariosPk.cabhorarioid = :cabhorarioid")
    , @NamedQuery(name = "DetaHorarios.findByDetahorarioid", query = "SELECT c FROM DetaHorarios c WHERE c.detahorariosPk.detahorarioid = :detahorarioid")
    , @NamedQuery(name = "DetaHorarios.findByHorafin", query = "SELECT c FROM DetaHorarios c WHERE c.horafin = :horafin")
    , @NamedQuery(name = "DetaHorarios.findByHorainicio", query = "SELECT c FROM DetaHorarios c WHERE c.horainicio = :horainicio")})

public class DetaHorarios implements Serializable {

    @EmbeddedId
    private DetaHorariosPK detahorariosPk;
    @JoinColumn(name = "diaid", referencedColumnName = "diaid")
    @ManyToOne
    private Biodias diaid;
    @Column(name = "horainicio", length = 6)
    private String horainicio;
    @Column(name = "horafin", length = 6)
    private String horafin;
    
    @MapsId("cabhorarioid")
    @JoinColumn(name = "cabhorarioid",referencedColumnName = "cabhorarioid",insertable = false, updatable=false)
    @ManyToOne(optional = false)
    private CabHorarios cabHorid;

    public DetaHorarios() {
    }

    public DetaHorariosPK getDetahorariosPk() {
        return detahorariosPk;
    }

    public void setDetahorariosPk(DetaHorariosPK detahorariosPk) {
        this.detahorariosPk = detahorariosPk;
    }

    public Biodias getDiaid() {
        return diaid;
    }

    public void setDiaid(Biodias diaid) {
        this.diaid = diaid;
    }

    public String getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }

    public String getHorafin() {
        return horafin;
    }

    public void setHorafin(String horafin) {
        this.horafin = horafin;
    }

    public CabHorarios getCabHorid() {
        return cabHorid;
    }

    public void setCabHorid(CabHorarios cabHorid) {
        this.cabHorid = cabHorid;
    }
                   
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.detahorariosPk);
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
        final DetaHorarios other = (DetaHorarios) obj;
        if (!Objects.equals(this.detahorariosPk, other.detahorariosPk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "detahorarios{" + "detahorariosPk=" + detahorariosPk.getCabhorarioid() + 
                detahorariosPk.getDetahorarioid()
                + ", diaid=" + diaid.getNombre() + 
                ", horainicio=" + horainicio + 
                ", horafin=" + horafin + '}';
    }

}
