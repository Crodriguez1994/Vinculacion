/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Data;

import Modelo.Mantenedores.Coordinador;
import Modelo.Mantenedores.Facilitador;
import Modelo.Mantenedores.Proyecto;
import Modelo.Mantenedores.ProyectoSector;
import Modelo.Mantenedores.Sector;
import Modelo.Mantenedores.UnidadAtencion;
import Modelo.Procesos.AsignacionProyecto;
import Modelo.Procesos.Capacitacion;
import Modelo.Procesos.CapacitacionPK;
import Modelo.Procesos.DetaCapacitacion;
import Modelo.Procesos.Modulo;
import Modelo.Procesos.ModuloPK;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Christian
 */
@Named
@ViewScoped
public class CabCapacitacionesDataMB implements Serializable {

    private Capacitacion capacitacion;
    private Capacitacion seleccionarC;
    private CapacitacionPK capacitacionPk;

    private Facilitador facilitador;
    private Facilitador seleccionF;
    private List<Facilitador> listaSeleccion;
    private List<Facilitador> listaFacilitadores = new ArrayList<>();
    private List<Facilitador> listaAuxiliar = new ArrayList<>();

    private Modulo modulo;
    private Modulo seleccionM;
    private ModuloPK moduloPk;
    private List<Modulo> listaModuloAuxiliar = new ArrayList<>();
    private List<Modulo> listaModulo = new ArrayList<>();

    private DetaCapacitacion detaCapacitacion;
    private List<DetaCapacitacion> listaDetalle = new ArrayList<>();

    private Coordinador coordinador;
    private Coordinador seleccionCo;
    private List<Coordinador> listaCoordinador;

    private Sector sector;
    private Sector seleccionS;
    private List<Sector> listaSector;

    private UnidadAtencion undAtencion;
    private UnidadAtencion seleccionUnd;
    private List<UnidadAtencion> listaUnd;

    private AsignacionProyecto asigProyecto;
    private AsignacionProyecto seleccionAsig;
    private List<AsignacionProyecto> listaAsig;

    private Proyecto proyeto;
    private Proyecto seleccionarP;
    private List<Proyecto> listaProyectos = new ArrayList<>();

    private ProyectoSector proyectosector;
    private ProyectoSector selecionarPS;
    private List<ProyectoSector> listaPoyectoSector = new ArrayList<>();

    public CabCapacitacionesDataMB() {

    }

    //<editor-fold defaultstate="collapsed" desc="GET AND SET DE DETALLE DE CAPACITACION">
    public DetaCapacitacion getDetaCapacitacion() {
        return detaCapacitacion;
    }

    public void setDetaCapacitacion(DetaCapacitacion detaCapacitacion) {
        this.detaCapacitacion = detaCapacitacion;
    }

    public List<DetaCapacitacion> getListaDetalle() {
        return listaDetalle;
    }

    public void setListaDetalle(List<DetaCapacitacion> listaDetalle) {
        this.listaDetalle = listaDetalle;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GET AND SET DE CAPACITACION">
    public Capacitacion getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(Capacitacion capacitacion) {
        this.capacitacion = capacitacion;
    }

    public Capacitacion getSeleccionarC() {
        return seleccionarC;
    }

    public void setSeleccionarC(Capacitacion seleccionarC) {
        this.seleccionarC = seleccionarC;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GET AND SET DE FACILITADORES">
    public Facilitador getFacilitador() {
        return facilitador;
    }

    public void setFacilitador(Facilitador facilitador) {
        this.facilitador = facilitador;
    }

    public List<Facilitador> getListaSeleccion() {
        return listaSeleccion;
    }

    public void setListaSeleccion(List<Facilitador> listaSeleccion) {
        this.listaSeleccion = listaSeleccion;
    }

    public List<Facilitador> getListaFacilitadores() {
        return listaFacilitadores;
    }

    public void setListaFacilitadores(List<Facilitador> listaFacilitadores) {
        this.listaFacilitadores = listaFacilitadores;
    }

    public Facilitador getSeleccionF() {
        return seleccionF;
    }

    public void setSeleccionF(Facilitador seleccionF) {
        this.seleccionF = seleccionF;
    }

    public List<Facilitador> getListaAuxiliar() {
        return listaAuxiliar;
    }

    public void setListaAuxiliar(List<Facilitador> listaAuxiliar) {
        this.listaAuxiliar = listaAuxiliar;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GET AND SET DE MODULOS">
    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public Modulo getSeleccionM() {
        return seleccionM;
    }

    public void setSeleccionM(Modulo seleccionM) {
        this.seleccionM = seleccionM;
    }

    public List<Modulo> getListaModulo() {
        return listaModulo;
    }

    public void setListaModulo(List<Modulo> listaModulo) {
        this.listaModulo = listaModulo;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GET AND SET DE COORDINADOR">
    public Coordinador getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    public Coordinador getSeleccionCo() {
        return seleccionCo;
    }

    public void setSeleccionCo(Coordinador seleccionCo) {
        this.seleccionCo = seleccionCo;
    }

    public List<Coordinador> getListaCoordinador() {
        return listaCoordinador;
    }

    public void setListaCoordinador(List<Coordinador> listaCoordinador) {
        this.listaCoordinador = listaCoordinador;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GET AND SET DE ASIGNACION DE PROYECTOS">
    public AsignacionProyecto getAsigProyecto() {
        return asigProyecto;
    }

    public void setAsigProyecto(AsignacionProyecto asigProyecto) {
        this.asigProyecto = asigProyecto;
    }

    public AsignacionProyecto getSeleccionAsig() {
        return seleccionAsig;
    }

    public void setSeleccionAsig(AsignacionProyecto seleccionAsig) {
        this.seleccionAsig = seleccionAsig;
    }

    public List<AsignacionProyecto> getListaAsig() {
        return listaAsig;
    }

    public void setListaAsig(List<AsignacionProyecto> listaAsig) {
        this.listaAsig = listaAsig;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GET AND SET DE UNIDAD ATENCION">
    public UnidadAtencion getUndAtencion() {
        return undAtencion;
    }

    public void setUndAtencion(UnidadAtencion undAtencion) {
        this.undAtencion = undAtencion;
    }

    public UnidadAtencion getSeleccionUnd() {
        return seleccionUnd;
    }

    public void setSeleccionUnd(UnidadAtencion seleccionUnd) {
        this.seleccionUnd = seleccionUnd;
    }

    public List<UnidadAtencion> getListaUnd() {
        return listaUnd;
    }

    public void setListaUnd(List<UnidadAtencion> listaUnd) {
        this.listaUnd = listaUnd;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GET AND SET DE SECTOR">
    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public Sector getSeleccionS() {
        return seleccionS;
    }

    public void setSeleccionS(Sector seleccionS) {
        this.seleccionS = seleccionS;
    }

    public List<Sector> getListaSector() {
        return listaSector;
    }

    public void setListaSector(List<Sector> listaSector) {
        this.listaSector = listaSector;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GET AND SET DE PROYECTO">
    public Proyecto getProyeto() {
        return proyeto;
    }

    public void setProyeto(Proyecto proyeto) {
        this.proyeto = proyeto;
    }

    public Proyecto getSeleccionarP() {
        return seleccionarP;
    }

    public void setSeleccionarP(Proyecto seleccionarP) {
        this.seleccionarP = seleccionarP;
    }

    public List<Proyecto> getListaProyectos() {
        return listaProyectos;
    }

    public void setListaProyectos(List<Proyecto> listaProyectos) {
        this.listaProyectos = listaProyectos;
    }
    //</editor-fold>

    public ProyectoSector getProyectosector() {
        return proyectosector;
    }

    public void setProyectosector(ProyectoSector proyectosector) {
        this.proyectosector = proyectosector;
    }

    public ProyectoSector getSelecionarPS() {
        return selecionarPS;
    }

    public void setSelecionarPS(ProyectoSector selecionarPS) {
        this.selecionarPS = selecionarPS;
    }

    public List<ProyectoSector> getListaPoyectoSector() {
        return listaPoyectoSector;
    }

    public void setListaPoyectoSector(List<ProyectoSector> listaPoyectoSector) {
        this.listaPoyectoSector = listaPoyectoSector;
    }
//________________________________________________________________________________________
    
    public ModuloPK getModuloPk() {
        return moduloPk;
    }

    public void setModuloPk(ModuloPK moduloPk) {
        this.moduloPk = moduloPk;
    }

    public CapacitacionPK getCapacitacionPk() {
        return capacitacionPk;
    }

    public void setCapacitacionPk(CapacitacionPK capacitacionPk) {
        this.capacitacionPk = capacitacionPk;
    }

    public List<Modulo> getListaModuloAuxiliar() {
        return listaModuloAuxiliar;
    }

    public void setListaModuloAuxiliar(List<Modulo> listaModuloAuxiliar) {
        this.listaModuloAuxiliar = listaModuloAuxiliar;
    }



}
