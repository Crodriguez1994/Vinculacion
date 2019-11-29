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
public class DetaAsistenciasPK implements Serializable {

    //@GeneratedValue(strategy = GenerationType.IDENTITY)//Identity genera los codigos
    @Basic(optional = false)
    @Column(name = "detasistenciaid")
    private int detasistenciaid;
    
    //@GeneratedValue(strategy = GenerationType.IDENTITY)//Identity genera los codigos
    @Basic(optional = false)
    @Column(name = "cabasistenciaid")
    private int cabasistenciaid;

    public DetaAsistenciasPK() {
    }

    public DetaAsistenciasPK(int detasistenciaid, int cabasistenciaid) {
        this.detasistenciaid = detasistenciaid;
        this.cabasistenciaid = cabasistenciaid;
    }

    public int getDetasistenciaid() {
        return detasistenciaid;
    }

    public void setDetasistenciaid(int detasistenciaid) {
        this.detasistenciaid = detasistenciaid;
    }

    public int getCabasistenciaid() {
        return cabasistenciaid;
    }

    public void setCabasistenciaid(int cabasistenciaid) {
        this.cabasistenciaid = cabasistenciaid;
    }
 
}
