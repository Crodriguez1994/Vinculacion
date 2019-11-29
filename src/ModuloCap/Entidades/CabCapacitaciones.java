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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "cap_cabcapacitaciones")
@NamedQueries({
    @NamedQuery(name = "CabCapacitaciones.findAll", query = "SELECT c FROM CabCapacitaciones c ORDER BY c.cabcapid ASC")
    , @NamedQuery(name = "CabCapacitaciones.findByCabcapid", query = "SELECT c FROM CabCapacitaciones c WHERE c.cabcapid = :cabcapid")
    , @NamedQuery(name = "CabCapacitaciones.findByEstado", query = "SELECT c FROM CabCapacitaciones c WHERE c.estado = :estado")
    , @NamedQuery(name = "CabCapacitaciones.findByFecha", query = "SELECT c FROM CabCapacitaciones c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "CabCapacitaciones.findByFechaapertura", query = "SELECT c FROM CabCapacitaciones c WHERE c.fechaapertura = :fechaapertura")
    , @NamedQuery(name = "CabCapacitaciones.findByFechacierre", query = "SELECT c FROM CabCapacitaciones c WHERE c.fechacierre = :fechacierre")
    , @NamedQuery(name = "CabCapacitaciones.findByLugar", query = "SELECT c FROM CabCapacitaciones c WHERE c.lugar = :lugar")
    , @NamedQuery(name = "CabCapacitaciones.findByNombre", query = "SELECT c FROM CabCapacitaciones c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "CabCapacitaciones.findByTipo", query = "SELECT c FROM CabCapacitaciones c WHERE c.tipo = :tipo")})

public class CabCapacitaciones implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Identity genera los codigos
    @Basic(optional = false)
    @Column(name = "cabcapid")
    private int cabcapid;
    @Column(name = "nombre", length = 35)
    private String nombre;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "tipo", length = 1)
    private String tipo;
    @Column(name = "lugar", length = 25)
    private String lugar;
    @Column(name = "cupo")
    private int cupo;
    @Column(name = "fechaapertura")
    @Temporal(TemporalType.DATE)
    private Date fechaapertura;
    @Column(name = "fechacierre")
    @Temporal(TemporalType.DATE)
    private Date fechacierre;
    @JoinColumn(name = "unidadid", referencedColumnName = "unidadid")
    @ManyToOne
    private UnidadesAtencion unidadid;
    @JoinColumn(name = "asigproyectoid", referencedColumnName = "asigproyectoid")
    @ManyToOne
    private AsigProyectos asigproyectoid;
    @Column(name = "estado", length = 1)
    private String estado;
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "cabCapid")//variable debe ser igual al cabCapacitaciones del detalle
    private List<DetaCapacitaciones> listaDetaCap = new ArrayList<>();
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "cabCapid")//variable debe ser igual al cabCapacitaciones del detalle
    private List<ModulosCapacitaciones> listaModCap = new ArrayList<>();

    public CabCapacitaciones() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCabcapid() {
        return cabcapid;
    }

    public void setCabcapid(int cabcapid) {
        this.cabcapid = cabcapid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public Date getFechaapertura() {
        return fechaapertura;
    }

    public void setFechaapertura(Date fechaapertura) {
        this.fechaapertura = fechaapertura;
    }

    public Date getFechacierre() {
        return fechacierre;
    }

    public void setFechacierre(Date fechacierre) {
        this.fechacierre = fechacierre;
    }

    public UnidadesAtencion getUnidadid() {
        return unidadid;
    }

    public void setUnidadid(UnidadesAtencion unidadid) {
        this.unidadid = unidadid;
    }

    public AsigProyectos getAsigproyectoid() {
        return asigproyectoid;
    }

    public void setAsigproyectoid(AsigProyectos asigproyectoid) {
        this.asigproyectoid = asigproyectoid;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<DetaCapacitaciones> getListaDetaCap() {
        return listaDetaCap;
    }

    public void setListaDetaCap(List<DetaCapacitaciones> listaDetaCap) {
        this.listaDetaCap = listaDetaCap;
    }

    public List<ModulosCapacitaciones> getListaModCap() {
        return listaModCap;
    }

    public void setListaModCap(List<ModulosCapacitaciones> listaModCap) {
        this.listaModCap = listaModCap;
    }

    public void addDetalle(DetaCapacitaciones detaCapacitaciones) {
        listaDetaCap.add(detaCapacitaciones);
        detaCapacitaciones.setCabCapid(this);
    }

    public void addDetalleMod(ModulosCapacitaciones modulosCapacitaciones) {
        listaModCap.add(modulosCapacitaciones);
        modulosCapacitaciones.setCabCapid(this);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.cabcapid;
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
        final CabCapacitaciones other = (CabCapacitaciones) obj;
        if (this.cabcapid != other.cabcapid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cabcapacitaciones{"
                + "Codigo="+ cabcapid
                + "nombre=" + nombre
                + ", fecha=" + fecha
                + ", tipo=" + tipo
                + ", lugar=" + lugar
                + ", cupo=" + cupo
                + ", fechaapertura=" + fechaapertura
                + ", fechacierre=" + fechacierre
                + ", unidadid=" + unidadid
                + ", Coordinador=" + asigproyectoid
                + ", Proyectos=" + asigproyectoid
                + ", estado=" + estado + '}';
    }

}
