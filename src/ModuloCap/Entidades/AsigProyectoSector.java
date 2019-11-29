/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Christian
 */
@Entity
@Table(name = "cap_asigProyectoSector")
@NamedQueries({
    @NamedQuery(name = "AsigProyectoSector.findAll", query = "SELECT c FROM AsigProyectoSector c")
    , @NamedQuery(name = "AsigProyectoSector.findByProyectoid", query = "SELECT c FROM AsigProyectoSector c WHERE c.proyectoid.proyectoid = :proyectoid")
    , @NamedQuery(name = "AsigProyectoSector.findBySectorid", query = "SELECT c FROM AsigProyectoSector c WHERE c.sectorid.sectorid = :sectorid")})

public class AsigProyectoSector implements Serializable {

    @EmbeddedId
    private AsigProyectoSectorPK asigProyectoPk;
    @MapsId("proyectoid")
    @JoinColumn(name = "proyectoid", referencedColumnName = "proyectoid", insertable = false, updatable = false)
    @ManyToOne
    private Proyectos proyectoid;
    @JoinColumn(name = "sectorid", referencedColumnName = "sectorid")
    @ManyToOne
    private Sectores sectorid;

    public AsigProyectoSector() {
    }

    public AsigProyectoSectorPK getAsigProyectoPk() {
        return asigProyectoPk;
    }

    public void setAsigProyectoPk(AsigProyectoSectorPK asigProyectoPk) {
        this.asigProyectoPk = asigProyectoPk;
    }

    public Proyectos getProyectoid() {
        return proyectoid;
    }

    public void setProyectoid(Proyectos proyectoid) {
        this.proyectoid = proyectoid;
    }

    public Sectores getSectorid() {
        return sectorid;
    }

    public void setSectorid(Sectores sectorid) {
        this.sectorid = sectorid;
    }

    @Override
    public String toString() {
        return "AsigProyectoSector{" + "asigProyectoPk=" + asigProyectoPk + ", proyectoid=" + proyectoid + ", sectorid=" + sectorid + '}';
    }

}
