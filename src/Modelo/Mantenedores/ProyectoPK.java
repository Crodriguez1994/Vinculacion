/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Mantenedores;

/**
 *
 * @author Christian
 */
public class ProyectoPK {

    private int asigid;
    private int proyectoid;

    public ProyectoPK() {
    }

    public ProyectoPK(int asigid, int proyectoid) {
        this.asigid = asigid;
        this.proyectoid = proyectoid;
    }

    public int getAsigid() {
        return asigid;
    }

    public void setAsigid(int asigid) {
        this.asigid = asigid;
    }

    public int getProyectoid() {
        return proyectoid;
    }

    public void setProyectoid(int proyectoid) {
        this.proyectoid = proyectoid;
    }

    @Override
    public String toString() {
        return "proyectoPK{" + "asigid=" + asigid + ", proyectoid=" + proyectoid + '}';
    }

}
