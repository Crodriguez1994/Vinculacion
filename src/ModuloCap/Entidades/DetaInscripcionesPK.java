/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 *
 * @author Christian
 */
@Embeddable
public class DetaInscripcionesPK implements Serializable {

    //@GeneratedValue(strategy = GenerationType.IDENTITY)//Identity genera los codigos
    @Basic(optional = false)
    @Column(name = "detainsid")
    private int detainsid;
    
    //@GeneratedValue(strategy = GenerationType.IDENTITY)//Identity genera los codigos
    @Basic(optional = false)
    @Column(name = "cabinscripcionid") //agregue la relacion @Column(name = "cabinsid")  private int cabinsid;
    private int cabinscripcionid; 

    public DetaInscripcionesPK() {
    }

    public DetaInscripcionesPK(int detainsid, int cabinscripcionid) {
        this.detainsid = detainsid;
        this.cabinscripcionid = cabinscripcionid;
    }

    public int getDetainsid() {
        return detainsid;
    }

    public void setDetainsid(int detainsid) {
        this.detainsid = detainsid;
    }

    public int getCabinscripcionid() {
        return cabinscripcionid;
    }

    public void setCabinscripcionid(int cabinscripcionid) {
        this.cabinscripcionid = cabinscripcionid;
    }
    
    

   /*
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) detainsid;
        hash += (int) cabinscripcionid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetaInscripcionesPK)) {
            return false;
        }
        DetaInscripcionesPK other = (DetaInscripcionesPK) object;
        if (this.detainsid != other.detainsid) {
            return false;
        }
        if (this.cabinscripcionid != other.cabinscripcionid) {
            return false;
        }
        return true;
    }*/

    
}
