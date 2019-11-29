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
import javax.persistence.Table;

/**
 *
 * @author Christian
 */
@Entity
@Table(name = "cap_detainscripciones")
@NamedQueries({
    @NamedQuery(name = "DetaInscripciones.findAll", query = "SELECT c FROM DetaInscripciones c")
    , @NamedQuery(name = "DetaInscripciones.findByCabinscripcionid", query = "SELECT c FROM DetaInscripciones c WHERE c.detainscripcionesPk.cabinscripcionid = :cabinscripcionid")
    , @NamedQuery(name = "DetaInscripciones.findByDetainsid", query = "SELECT c FROM DetaInscripciones c WHERE c.detainscripcionesPk.detainsid = :detainsid")})

public class DetaInscripciones implements Serializable {

    @EmbeddedId
    private DetaInscripcionesPK detainscripcionesPk;
    @JoinColumn(name = "beneficiarioid", referencedColumnName = "beneficiarioid")
    @ManyToOne
    private Beneficiarios beneficiarioid;
    
    @MapsId("cabinscripcionid")
    @JoinColumn(name = "cabinscripcionid", referencedColumnName = "cabinscripcionid", insertable = false, updatable=false)
    @ManyToOne(optional = false)
    private CabInscripciones cabInscr;
    
    

    public DetaInscripciones() {
    }

    public DetaInscripcionesPK getDetainscripcionesPk() {
        return detainscripcionesPk;
    }

    public void setDetainscripcionesPk(DetaInscripcionesPK detainscripcionesPk) {
        this.detainscripcionesPk = detainscripcionesPk;
    }

    public Beneficiarios getBeneficiarioid() {
        return beneficiarioid;
    }

    public void setBeneficiarioid(Beneficiarios beneficiarioid) {
        this.beneficiarioid = beneficiarioid;
    }

    public CabInscripciones getCabInscr() {
        return cabInscr;
    }

    public void setCabInscr(CabInscripciones cabInscr) {
        this.cabInscr = cabInscr;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.detainscripcionesPk);
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
        final DetaInscripciones other = (DetaInscripciones) obj;
        if (!Objects.equals(this.detainscripcionesPk, other.detainscripcionesPk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DetaInscripciones{" + "detainscripcionesPk=" + detainscripcionesPk + 
                ", beneficiarioid=" + beneficiarioid + '}';
    }
    
    
    

    
    

}
