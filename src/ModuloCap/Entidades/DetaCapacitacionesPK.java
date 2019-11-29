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
public class DetaCapacitacionesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "detacapid")
    private int detacapid;

    @Basic(optional = false)
    @Column(name = "cabcapid")
    private int cabcapid;

    public DetaCapacitacionesPK() {
    }

    public DetaCapacitacionesPK(int detacapid, int cabcapid) {
        this.detacapid = detacapid;
        this.cabcapid = cabcapid;
    }

    public int getDetacapid() {
        return detacapid;
    }

    public void setDetacapid(int detacapid) {
        this.detacapid = detacapid;
    }

    public int getCabcapid() {
        return cabcapid;
    }

    public void setCabcapid(int cabcapid) {
        this.cabcapid = cabcapid;
    }

}
