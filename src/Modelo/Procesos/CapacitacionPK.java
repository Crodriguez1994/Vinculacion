/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Procesos;

/**
 *
 * @author Christian
 */
public class CapacitacionPK {

    private int detacapid;

    private int cabcapid;

    public CapacitacionPK() {
    }

    public CapacitacionPK(int detacapid, int cabcapid) {
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

    @Override
    public String toString() {
        return "CapacitacionPK{" + "detacapid=" + detacapid + ", cabcapid=" + cabcapid + '}';
    }

}
