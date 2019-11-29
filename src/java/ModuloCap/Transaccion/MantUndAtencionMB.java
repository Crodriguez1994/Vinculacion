/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Transaccion;

import Modelo.Mantenedores.Proyecto;
import Modelo.Mantenedores.ProyectoSector;
import Modelo.Mantenedores.Sector;
import Modelo.Mantenedores.UnidadAtencion;
import ModuloCap.Data.MantUndAtencionDataMB;
import ModuloCap.Facade.FacadeMantUnidadAtencion;
import java.io.Serializable;
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
public class MantUndAtencionMB implements Serializable {

    @Inject
    private MantUndAtencionDataMB undAtencionData;
    private FacadeMantUnidadAtencion undAtencionFacade;

    @PostConstruct
    public void Init() {
        accionNuevo();
        undAtencionFacade = new FacadeMantUnidadAtencion();
        undAtencionData.setListaUnd(undAtencionFacade.GetAllUnidad());
        undAtencionData.setListaPro(undAtencionFacade.GetAllProyecto());
    }

    public MantUndAtencionMB() {
    }

    public MantUndAtencionDataMB getUndAtencionData() {
        return undAtencionData;
    }

    public void setUndAtencionData(MantUndAtencionDataMB undAtencionData) {
        this.undAtencionData = undAtencionData;
    }

    public void accionGuardar() {
        FacesContext context = FacesContext.getCurrentInstance();
        undAtencionFacade.GuardarUnidad(undAtencionData.getUndAtencion());
        undAtencionData.setListaUnd(undAtencionFacade.GetAllUnidad());
        context.addMessage(null, new FacesMessage("Accion", "Registro Exitoso!"));
        accionNuevo();
    }

    public void accionSeleccionar() {
        if (undAtencionData.getSeleccionarUnd() != null) {
            UnidadAtencion und = undAtencionData.getSeleccionarUnd();
            undAtencionData.setUndAtencion(und);
        }
    }

    public void seleccionarProyecto() {
        Proyecto proyecto = undAtencionData.getUndAtencion().getProyectoid();
        if (proyecto != null) {
            undAtencionData.setListaPoyectoSector(undAtencionFacade.GetAsignacionByProyecto(proyecto.getProyectoid()));
        }
        undAtencionData.getUndAtencion().setProyectoid(proyecto);
    }

    public void seleccionarSector() {

        Sector sector = undAtencionData.getUndAtencion().getSectorid();
        if (sector != null) {
            undAtencionData.getUndAtencion().setSectorid(sector);
        }
    }

    public void accionNuevo() {

        undAtencionData.setUndAtencion(new UnidadAtencion());
        undAtencionData.getUndAtencion().setProyectoid(new Proyecto());
        undAtencionData.getUndAtencion().setSectorid(new Sector());
        undAtencionData.setProyectosector(new ProyectoSector());
        undAtencionData.getUndAtencion().setEstado("Activo");
        undAtencionData.getUndAtencion().setFecha(new Date());

    }
}
