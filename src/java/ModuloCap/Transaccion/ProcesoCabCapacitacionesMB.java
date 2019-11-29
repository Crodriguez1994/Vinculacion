/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Transaccion;

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
import ModuloCap.Data.CabCapacitacionesDataMB;
import ModuloCap.Facade.FacadeMantFacilitadores;
import ModuloCap.Facade.FacadeProcesoCapacitaciones;
import ModuloCap.Facade.IFacadeMantFacilitadores;
import ModuloCap.Facade.IFacadeProcesoCapacitaciones;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Christian
 */
@Named
@ViewScoped
public class ProcesoCabCapacitacionesMB implements Serializable {

    @Inject
    private CabCapacitacionesDataMB capacitacionesData;

    private IFacadeProcesoCapacitaciones capacitacionesFacade;
    private IFacadeMantFacilitadores facilitadoresFacde;

    @PostConstruct
    public void init() {
        accionInicializar();
        capacitacionesFacade = new FacadeProcesoCapacitaciones();
        facilitadoresFacde = new FacadeMantFacilitadores();
        capacitacionesData.setListaSeleccion(facilitadoresFacde.GetAllFacilitadores());
        capacitacionesData.setListaCoordinador(capacitacionesFacade.GetAllCoordinador());
    }

    public ProcesoCabCapacitacionesMB() {
    }

    public CabCapacitacionesDataMB getCapacitacionesData() {
        return capacitacionesData;
    }

    public void setCapacitacionesData(CabCapacitacionesDataMB capacitacionesData) {
        this.capacitacionesData = capacitacionesData;
    }

    public void Limpiar() {
        capacitacionesData.setListaAuxiliar(new ArrayList<>());
    }

    //<editor-fold defaultstate="collapsed" desc="1. GESTION DE CAPACITACION">
    public void accionGuardar() {
        FacesContext context = FacesContext.getCurrentInstance();
        onSeleccionCoordinador();

        capacitacionesData.getCapacitacion().setAsigproyectoid(capacitacionesData.getAsigProyecto());
        capacitacionesData.getCapacitacion().setUnidadid(capacitacionesData.getUndAtencion());
        capacitacionesData.getCapacitacion().setListaModCap(capacitacionesData.getListaModulo());
        capacitacionesFacade.GuardarCapacitacion(capacitacionesData.getCapacitacion(),
                capacitacionesData.getListaFacilitadores());
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Accion", "Registro Exitoso!"));
        accionNuevo();

    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="2. GESTION DE FACILITADORES">
    public void accionAgregarF() {

        for (Facilitador f : capacitacionesData.getListaSeleccion()) {
            if (f.isSeleccionar()) {
                capacitacionesData.getListaAuxiliar().add(f);
            }
        }
        capacitacionesData.setListaFacilitadores(capacitacionesData.getListaAuxiliar());
        Limpiar();

    }

    public void accionQuitarF(Facilitador fac) {
        capacitacionesData.setSeleccionF(fac);
        capacitacionesData.getListaFacilitadores().remove(fac);
        Limpiar();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="3. GESTION DE MODULOS">
    public void actionAgregarM() {
        int id = 1;
        capacitacionesData.getListaModulo().add(capacitacionesData.getModulo());
        for (Modulo m : capacitacionesData.getListaModulo()) {
            capacitacionesData.getModulo().setModuloid(id);
            id++;
        }
        capacitacionesData.setModulo(new Modulo());
    }

    public void actionQuitarM(Modulo mo) {
        capacitacionesData.setSeleccionM(mo);
        capacitacionesData.getListaModulo().remove(mo);
        capacitacionesData.setModulo(new Modulo());
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="SELECCION DE LOS COMBOX">
    public void onSeleccionCoordinador() {
        Coordinador coordinador = capacitacionesData.getAsigProyecto().getCoordinadorid();
        if (coordinador != null) {
            capacitacionesData.setListaAsig(capacitacionesFacade.GetAsignacionByCoordinador(coordinador.getCoordinadorid()));
        }
        for (AsignacionProyecto asig : capacitacionesData.getListaAsig()) {
            capacitacionesData.setAsigProyecto(asig);
        }
        capacitacionesData.getAsigProyecto();
    }

    public void onSeleccionProyecto() {
        Proyecto proyecto = capacitacionesData.getProyectosector().getProyecto();
        if (proyecto != null) {
            capacitacionesData.setListaPoyectoSector(capacitacionesFacade.GetAsignacionByProyecto(proyecto.getProyectoid()));
        }
    }

    public void onSeleccionSector() {
        Sector sector = capacitacionesData.getUndAtencion().getSectorid();
        if (sector != null) {
            capacitacionesData.setListaUnd(capacitacionesFacade.GetUndAtencionBySector(sector.getSectorid()));
        }
    }

    //</editor-fold>
    public void accionInicializar() {
        capacitacionesData.setCapacitacion(new Capacitacion());
        capacitacionesData.getCapacitacion().setEstado("Activo");
        capacitacionesData.getCapacitacion().setFecha(new Date());

        capacitacionesData.setDetaCapacitacion(new DetaCapacitacion());
        capacitacionesData.setCapacitacionPk(new CapacitacionPK());

        capacitacionesData.setModulo(new Modulo());
        capacitacionesData.setModuloPk(new ModuloPK());
        capacitacionesData.getModulo().setEstado("Activo");

        capacitacionesData.setFacilitador(new Facilitador());
        capacitacionesData.setCoordinador(new Coordinador());
        capacitacionesData.setAsigProyecto(new AsignacionProyecto());
        capacitacionesData.getAsigProyecto().setCoordinadorid(new Coordinador());

        capacitacionesData.setProyectosector(new ProyectoSector());
        capacitacionesData.getProyectosector().setProyecto(new Proyecto());
        capacitacionesData.getProyectosector().setSector(new Sector());

        capacitacionesData.setUndAtencion(new UnidadAtencion());
        capacitacionesData.getUndAtencion().setProyectoid(new Proyecto());
        capacitacionesData.getUndAtencion().setSectorid(new Sector());
    }

    public void accionNuevo() {
        capacitacionesData.setCapacitacion(new Capacitacion());
        capacitacionesData.getCapacitacion().setEstado("Activo");
        capacitacionesData.getCapacitacion().setFecha(new Date());

        capacitacionesData.setDetaCapacitacion(new DetaCapacitacion());
        capacitacionesData.setCapacitacionPk(new CapacitacionPK());

        capacitacionesData.setModulo(new Modulo());
        capacitacionesData.setModuloPk(new ModuloPK());
        capacitacionesData.getModulo().setEstado("Activo");

        capacitacionesData.setFacilitador(new Facilitador());
        capacitacionesData.setCoordinador(new Coordinador());
        capacitacionesData.setAsigProyecto(new AsignacionProyecto());
        capacitacionesData.getAsigProyecto().setCoordinadorid(new Coordinador());

        capacitacionesData.setProyectosector(new ProyectoSector());
        capacitacionesData.getProyectosector().setProyecto(new Proyecto());
        capacitacionesData.getProyectosector().setSector(new Sector());

        capacitacionesData.setUndAtencion(new UnidadAtencion());
        capacitacionesData.getUndAtencion().setProyectoid(new Proyecto());
        capacitacionesData.getUndAtencion().setSectorid(new Sector());

        capacitacionesData.setListaSeleccion(facilitadoresFacde.GetAllFacilitadores());
        capacitacionesData.setListaFacilitadores(new ArrayList<>());
        capacitacionesData.setListaModulo(new ArrayList<>());
    }

}
