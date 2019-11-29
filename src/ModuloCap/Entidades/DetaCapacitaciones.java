/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Entidades;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Christian
 */
@Entity
@Table(name = "cap_detacapacitaciones")
@NamedQueries({
    @NamedQuery(name = "DetaCapacitaciones.findAll", query = "SELECT c FROM DetaCapacitaciones c")
    , @NamedQuery(name = "DetaCapacitaciones.findByCabcapid", query = "SELECT c FROM DetaCapacitaciones c WHERE c.detacapacitacionesPk.cabcapid = :cabcapid")
    , @NamedQuery(name = "DetaCapacitaciones.findByDetacapid", query = "SELECT c FROM DetaCapacitaciones c WHERE c.detacapacitacionesPk.detacapid = :detacapid")})

public class DetaCapacitaciones implements Serializable {

    @EmbeddedId
    private DetaCapacitacionesPK detacapacitacionesPk;
    @JoinColumn(name = "facilitadorid", referencedColumnName = "facilitadorid")
    @OneToOne
    private Facilitadores facilitadorid;
    @MapsId("cabcapid")
    @JoinColumn(name = "cabcapid", referencedColumnName = "cabcapid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CabCapacitaciones cabCapid;

    public DetaCapacitaciones() {
    }

    public DetaCapacitacionesPK getDetacapacitacionesPk() {
        return detacapacitacionesPk;
    }

    public void setDetacapacitacionesPk(DetaCapacitacionesPK detacapacitacionesPk) {
        this.detacapacitacionesPk = detacapacitacionesPk;
    }

    public Facilitadores getFacilitadorid() {
        return facilitadorid;
    }

    public void setFacilitadorid(Facilitadores facilitadorid) {
        this.facilitadorid = facilitadorid;
    }

    public CabCapacitaciones getCabCapid() {
        return cabCapid;
    }

    public void setCabCapid(CabCapacitaciones cabCapid) {
        this.cabCapid = cabCapid;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.detacapacitacionesPk);
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
        final DetaCapacitaciones other = (DetaCapacitaciones) obj;
        if (!Objects.equals(this.detacapacitacionesPk, other.detacapacitacionesPk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "detacapacitaciones{"
                + "detacapacitacionesPk=" + detacapacitacionesPk
                + ", facilitadorid=" + facilitadorid + '}';
    }

}
