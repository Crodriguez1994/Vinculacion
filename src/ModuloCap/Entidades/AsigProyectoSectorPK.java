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
public class AsigProyectoSectorPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "asigid")
    private int asigid;
    @Basic(optional = false)
    @Column(name = "proyectoid")
    private int proyectoid;

    public AsigProyectoSectorPK() {
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

}
