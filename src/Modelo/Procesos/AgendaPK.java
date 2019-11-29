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
public class AgendaPK {

    private int detagendaid;
    private int cabagendaid;

    public AgendaPK() {
    }

    public AgendaPK(int detagendaid, int cabagendaid) {
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

    @Override
    public String toString() {
        return "AgendaPK{" + "detagendaid=" + detagendaid + ", cabagendaid=" + cabagendaid + '}';
    }

}
