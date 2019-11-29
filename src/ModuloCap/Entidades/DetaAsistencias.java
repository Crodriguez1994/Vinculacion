/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Entidades;

import java.io.Serializable;
import java.util.Objects;
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
@Table(name = "cap_detasistencias")
@NamedQueries({
    @NamedQuery(name = "DetaAsistencias.findAll", query = "SELECT c FROM DetaAsistencias c")
    , @NamedQuery(name = "DetaAsistencias.findByCabasistenciaid", query = "SELECT c FROM DetaAsistencias c WHERE c.detasistenciasPk.cabasistenciaid = :cabasistenciaid")
    , @NamedQuery(name = "DetaAsistencias.findByDetasistenciaid", query = "SELECT c FROM DetaAsistencias c WHERE c.detasistenciasPk.detasistenciaid = :detasistenciaid")
    , @NamedQuery(name = "DetaAsistencias.findByAsistencia", query = "SELECT c FROM DetaAsistencias c WHERE c.asistencia = :asistencia")})

public class DetaAsistencias implements Serializable {

    @EmbeddedId
    private DetaAsistenciasPK detasistenciasPk;
    @JoinColumn(name = "beneficiarioid", referencedColumnName = "beneficiarioid")
    @ManyToOne
    private Beneficiarios beneficiarioid;
    @Column(name = "asistencia")
    private boolean asistencia;
    
    @MapsId("cabasistenciaid")
    @JoinColumn(name = "cabasistenciaid", referencedColumnName = "cabasistenciaid", insertable = false, updatable=false)
    @ManyToOne(optional = false)
    private  CabAsistencias CabAsis;

    public DetaAsistencias() {
    }

    public DetaAsistenciasPK getDetasistenciasPk() {
        return detasistenciasPk;
    }

    public void setDetasistendiasPk(DetaAsistenciasPK detasistenciasPk) {
        this.detasistenciasPk = detasistenciasPk;
    }

    public Beneficiarios getBeneficiarioid() {
        return beneficiarioid;
    }

    public void setBeneficiarioid(Beneficiarios beneficiarioid) {
        this.beneficiarioid = beneficiarioid;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    public CabAsistencias getCabAsis() {
        return CabAsis;
    }

    public void setCabAsis(CabAsistencias CabAsis) {
        this.CabAsis = CabAsis;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.detasistenciasPk);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DetaAsistencias other = (DetaAsistencias) obj;
        if (!Objects.equals(this.detasistenciasPk, other.detasistenciasPk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DetaAsistencias{" + "detasistenciasPk=" + detasistenciasPk + 
                ", beneficiarioid=" + beneficiarioid.getNombres() + 
                ", asistencia=" + asistencia + '}';
    }
    
    

}
