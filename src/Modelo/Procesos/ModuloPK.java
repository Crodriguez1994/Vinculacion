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
public class ModuloPK {

    private int moduloid;
    private int cabcapid;

    public ModuloPK() {
    }

    public ModuloPK(int moduloid, int cabcapid) {
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
        return "ModuloPK{" + "moduloid=" + moduloid + ", cabcapid=" + cabcapid + '}';
    }

}
