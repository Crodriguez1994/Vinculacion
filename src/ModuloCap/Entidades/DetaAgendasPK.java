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

/**
 *
 * @author Christian
 */
@Embeddable
public class DetaAgendasPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "detagendaid")
    private int detagendaid;
    
    @Basic(optional = false)
    @Column(name = "cabagendaid")
    private int cabagendaid;

    public DetaAgendasPK() {
    }

    public DetaAgendasPK(int detagendaid, int cabagendaid) {
        this.detagendaid = detagendaid;
        this.cabagendaid = cabagendaid;
    }

    public int getDetagendaid() {
        return detagendaid;
    }

    public void setDetagendaid(int detagendaid) {
        this.detagendaid = detagendaid;
    }

    public int getCabagendaid() {
        return cabagendaid;
    }

    public void setCabagendaid(int cabagendaid) {
        this.cabagendaid = cabagendaid;
    }
    
}
