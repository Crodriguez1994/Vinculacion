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
public class DetaHorariosPK implements Serializable {
    
    @Basic(optional = false)
    @Column(name = "detahorarioid")
    private int detahorarioid;
    
    @Basic(optional = false)
    @Column(name = "cabhorarioid")
    private int cabhorarioid;

    public DetaHorariosPK() {
    }

    public DetaHorariosPK(int detahorarioid, int cabhorarioid) {
        this.detahorarioid = detahorarioid;
        this.cabhorarioid = cabhorarioid;
    }

    public int getDetahorarioid() {
        return detahorarioid;
    }

    public void setDetahorarioid(int detahorarioid) {
        this.detahorarioid = detahorarioid;
    }

    public int getCabhorarioid() {
        return cabhorarioid;
    }

    public void setCabhorarioid(int cabhorarioid) {
        this.cabhorarioid = cabhorarioid;
    }

    
}
