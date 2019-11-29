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
import javax.persistence.Id;
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
@Table(name = "cap_especialidades")
@NamedQueries({
    @NamedQuery(name = "Especialidades.findAll", query = "SELECT c FROM Especialidades c ORDER BY c.especialidadid ASC")
    , @NamedQuery(name = "Especialidades.findByEspecialidadid", query = "SELECT c FROM Especialidades c WHERE c.especialidadid = :especialidadid")
    , @NamedQuery(name = "Especialidades.findByEstado", query = "SELECT c FROM Especialidades c WHERE c.estado = :estado")
    , @NamedQuery(name = "Especialidades.findByFecha", query = "SELECT c FROM Especialidades c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Especialidades.findByNombre", query = "SELECT c FROM Especialidades c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Especialidades.getNextId", query = "SELECT coalesce(max(c.especialidadid),0) +1 FROM Especialidades c")})

public class Especialidades implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "especialidadid")
    private int especialidadid;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "nombre", length = 30)
    private String nombre;
    @Column(name = "estado", length = 1)
    private String estado;

    public Especialidades() {
    }

    public int getEspecialidadid() {
        return especialidadid;
    }

    public void setEspecialidadid(int especialidadid) {
        this.especialidadid = especialidadid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
