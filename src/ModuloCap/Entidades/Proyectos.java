/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Christian
 */
@Entity
@Table(name = "cap_proyectos")
@NamedQueries({
    @NamedQuery(name = "Proyectos.findAll", query = "SELECT c FROM Proyectos c ORDER BY c.proyectoid ASC")
    , @NamedQuery(name = "Proyectos.findByProyectoid", query = "SELECT c FROM Proyectos c WHERE c.proyectoid = :proyectoid")
    , @NamedQuery(name = "Proyectos.findByEstado", query = "SELECT c FROM Proyectos c WHERE c.estado = :estado")
    , @NamedQuery(name = "Proyectos.findByFecha", query = "SELECT c FROM Proyectos c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Proyectos.findByNombre", query = "SELECT c FROM Proyectos c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Proyectos.getNextId", query = "SELECT coalesce(max(c.proyectoid),0) +1 FROM Proyectos c")})

public class Proyectos implements Serializable {
    
    @Id
    @Basic(optional = false)
    @Column(name = "proyectoid")
    private int proyectoid;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "nombre", length = 30)
    private String nombre;
    @Column(name = "fechainicio")
    @Temporal(TemporalType.DATE)
    private Date fechainicio;
    @Column(name = "fechafin")
    @Temporal(TemporalType.DATE)
    private Date fechafin;
    @Column(name = "estado", length = 1)
    private String estado;
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "proyectoid")//variable debe ser igual al cabCapacitaciones del detalle
    private List<AsigProyectoSector> ListasigProyectoSector = new ArrayList<>();
    
    public Proyectos() {
    }
    
    public Proyectos(Date fecha, String nombre, Date fechainicio, Date fechafin, String estado) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.estado = estado;
    }
    
    public int getProyectoid() {
        return proyectoid;
    }
    
    public void setProyectoid(int proyectoid) {
        this.proyectoid = proyectoid;
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Date getFechainicio() {
        return fechainicio;
    }
    
    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }
    
    public Date getFechafin() {
        return fechafin;
    }
    
    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public List<AsigProyectoSector> getListasigProyectoSector() {
        return ListasigProyectoSector;
    }
    
    public void setListasigProyectoSector(List<AsigProyectoSector> ListasigProyectoSector) {
        this.ListasigProyectoSector = ListasigProyectoSector;
    }
    
    public void addAgregar(AsigProyectoSector asigProyectoSector) {
        ListasigProyectoSector.add(asigProyectoSector);
        asigProyectoSector.setProyectoid(this);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.proyectoid;
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
        final Proyectos other = (Proyectos) obj;
        if (this.proyectoid != other.proyectoid) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "proyectos{" + "proyectoid=" + proyectoid + ", fecha=" + fecha + ", nombre=" + nombre + ", fechainicio=" + fechainicio + ", fechafin=" + fechafin + ", estado=" + estado + '}';
    }
    
}
