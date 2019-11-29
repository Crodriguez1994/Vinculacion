/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Christian
 */
@Entity
@Table(name = "cap_planificacionactividades")
@NamedQueries({
    @NamedQuery(name = "PlanificacionActividades.findAll", query = "SELECT c FROM PlanificacionActividades c")
    , @NamedQuery(name = "PlanificacionActividades.findByPlanificacionid", query = "SELECT c FROM PlanificacionActividades c WHERE c.planificacionid = :planificacionid")
    , @NamedQuery(name = "PlanificacionActividades.findByActividad", query = "SELECT c FROM PlanificacionActividades c WHERE c.actividad = :actividad")
    , @NamedQuery(name = "PlanificacionActividades.findByFecha", query = "SELECT c FROM PlanificacionActividades c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "PlanificacionActividades.findByLugar", query = "SELECT c FROM PlanificacionActividades c WHERE c.lugar = :lugar")
    , @NamedQuery(name = "PlanificacionActividades.findByTipo", query = "SELECT c FROM PlanificacionActividades c WHERE c.tipo = :tipo")
    , @NamedQuery(name = "PlanificacionActividades.getNextId", query = "SELECT coalesce(max(c.planificacionid),0) +1 FROM PlanificacionActividades c")})

public class PlanificacionActividades implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Identity genera los codigos
    @Basic(optional = false)
    @Column(name = "planificacionid")
    private int planificacionid;
    @JoinColumn(name = "cabagendaid", referencedColumnName = "cabagendaid")
    @ManyToOne
    private CabAgendas cabagendaid;
    @Column(name = "tipo", length = 1)
    private String tipo;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "lugar", length = 20)
    private String lugar;
    @Column(name = "actividad", length = 200)
    private String actividad;
    @Column(name = "objetivo", length = 200)
    private String objetivo;
    @Column(name = "resultados", length = 200)
    private String resultados;

    public PlanificacionActividades() {
    }

    public int getPlanificacionid() {
        return planificacionid;
    }

    public void setPlanificacionid(int planificacionid) {
        this.planificacionid = planificacionid;
    }

    public CabAgendas getCabagendaid() {
        return cabagendaid;
    }

    public void setCabagendaid(CabAgendas cabagendaid) {
        this.cabagendaid = cabagendaid;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getResultados() {
        return resultados;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }

}
