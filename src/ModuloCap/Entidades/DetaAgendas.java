/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "cap_detagendas")
@NamedQueries({
    @NamedQuery(name = "DetaAgendas.findAll", query = "SELECT c FROM DetaAgendas c")
    , @NamedQuery(name = "DetaAgendas.findByCabagendaid", query = "SELECT c FROM DetaAgendas c WHERE c.detagendapk.cabagendaid = :cabagendaid")
    , @NamedQuery(name = "DetaAgendas.findByDetagendaid", query = "SELECT c FROM DetaAgendas c WHERE c.detagendapk.detagendaid = :detagendaid")
    , @NamedQuery(name = "DetaAgendas.findByActividad", query = "SELECT c FROM DetaAgendas c WHERE c.actividad = :actividad")
    , @NamedQuery(name = "DetaAgendas.findByEstrategia", query = "SELECT c FROM DetaAgendas c WHERE c.estrategia = :estrategia")
    , @NamedQuery(name = "DetaAgendas.findByHorafin", query = "SELECT c FROM DetaAgendas c WHERE c.horafin = :horafin")
    , @NamedQuery(name = "DetaAgendas.findByHorainicio", query = "SELECT c FROM DetaAgendas c WHERE c.horainicio = :horainicio")
    , @NamedQuery(name = "DetaAgendas.findByResponsable", query = "SELECT c FROM DetaAgendas c WHERE c.responsable = :responsable")})

public class DetaAgendas implements Serializable {

    @EmbeddedId
    private DetaAgendasPK detagendapk;
    @Column(name = "horainicio", length = 6)
    private String horainicio;
    @Column(name = "horafin", length = 6)
    private String horafin;
    @Column(name = "actividad", length = 300)
    private String actividad;
    @Column(name = "estrategia", length = 300)
    private String estrategia;
    @Column(name = "responsable", length = 30)
    private String responsable;

    @MapsId("cabagendaid")
    @JoinColumn(name = "cabagendaid", referencedColumnName = "cabagendaid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CabAgendas cabAgendaid;

    public DetaAgendas() {
    }

    public DetaAgendasPK getDetagendapk() {
        return detagendapk;
    }

    public void setDetagendapk(DetaAgendasPK detagendapk) {
        this.detagendapk = detagendapk;
    }

    public String getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }

    public String getHorafin() {
        return horafin;
    }

    public void setHorafin(String horafin) {
        this.horafin = horafin;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public CabAgendas getCabAgendaid() {
        return cabAgendaid;
    }

    public void setCabAgendaid(CabAgendas cabAgendaid) {
        this.cabAgendaid = cabAgendaid;
    }

   

}
