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
public class ModulosCapacitacionesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "moduloid")
    private int moduloid;
    @Basic(optional = false)
    @Column(name = "cabcapid")
    private int cabcapid;

    public ModulosCapacitacionesPK() {
    }

    public ModulosCapacitacionesPK(int moduloid, int cabcapid) {
        this.moduloid = moduloid;
        this.cabcapid = cabcapid;
    }

    public int getModuloid() {
        return moduloid;
    }

    public void setModuloid(int moduloid) {
        this.moduloid = moduloid;
    }

    public int getCabcapid() {
        return cabcapid;
    }

    public void setCabcapid(int cabcapid) {
        this.cabcapid = cabcapid;
    }

    @Override
    public String toString() {
        return "ModulosCapacitacionesPK{" + "moduloid=" + moduloid + ", cabcapid=" + cabcapid + '}';
    }

}
